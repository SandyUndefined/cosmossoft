package com.sandy.cosmossoft.activities.payoutpaysprint;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.xmp.XMPError;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.paytm.pgsdk.Constants;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.PdfDocumentAdapter;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityPayoutDetailedAnalyticBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class PayoutDetailedAnalytic extends AppCompatActivity {
    String amount_in_word = "";
    String amount_label = "Amount";
    ActivityPayoutDetailedAnalyticBinding binding;
    String charges = "";
    private final String filename = "invoice.pdf";
    private final String filepath = "MyInvoices";
    String gst_no = "";
    DetailedHistoryResponse historyResponse;
    private long mLastClickTime = 0;
    AnalyticsResponseModel model;
    String myStatus = "";
    String shareResponse = "";
    String shareValue = "Nothing";
    String transactionType = "";
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayoutDetailedAnalyticBinding inflate = ActivityPayoutDetailedAnalyticBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Payout Transaction");
        this.historyResponse = (DetailedHistoryResponse) getIntent().getSerializableExtra("detailed");
        this.model = (AnalyticsResponseModel) getIntent().getSerializableExtra("regular");
        setJsonData();
        this.binding.setRegularDetailModel(this.model);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
        setListener();
        setConditionals();
    }

    private void setConditionals() {
        try {
            if (this.model.getCause().equals("commission")) {
                this.amount_label = "Commission";
                this.binding.amountLabel.setText(this.amount_label);
            } else if (this.model.getCause().equals("charge")) {
                this.amount_label = "Charge";
                this.binding.amountLabel.setText(this.amount_label);
                this.binding.gstSection.setVisibility(0);
                this.shareValue = shareOfCommission();
            } else {
                this.amount_label = "Amount";
                this.binding.amountLabel.setText(this.amount_label);
                this.shareValue = shareOfNormal();
            }
        } catch (NullPointerException e) {
        }
        this.binding.tdsChargeSection.setVisibility(8);
    }

    private String shareOfNormal() {
        return "Status: " + this.myStatus + "\nBeneficiary ID: " + this.model.getOnMobile() + "\nTransaction Type: " + this.transactionType + "\nGST No: " + this.gst_no + "\n" + this.amount_label + ": " + this.model.getAmount() + "\nCommission: " + this.model.getCommission_amount() + "\nOpening Balance: " + this.model.getAmount_earlier() + "\nClosing Balance: " + this.model.getAmount_left() + "\nTransaction id: " + this.model.getTxn_id() + "\nResponse: " + this.shareResponse + "\nDate-Time" + this.model.getDate() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile();
    }

    private String shareOfCommission() {
        return "Status: " + this.myStatus + "\nBeneficiary ID: " + this.model.getOnMobile() + "\nTransaction Type: " + this.transactionType + "\nTDS Charge: " + this.model.getTds() + "\n" + this.amount_label + ": " + this.model.getAmount() + "\nCommission: " + this.model.getCommission_amount() + "\nOpening Balance: " + this.model.getAmount_earlier() + "\nClosing Balance: " + this.model.getAmount_left() + "\nTransaction id: " + this.model.getTxn_id() + "\nResponse: " + this.shareResponse + "\nDate-Time" + this.model.getDate() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile();
    }

    private void setJsonData() {
        String comStatus = "";
        if (this.model.getStatus() != null) {
            comStatus = this.model.getStatus().toLowerCase();
        }
        try {
            JSONObject object = new JSONObject(this.historyResponse.getData_response());
            JSONObject detObject = new JSONObject(this.historyResponse.getAdditional_info());
            if (comStatus.equals(Constants.EVENT_LABEL_SUCCESS)) {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.success);
                this.binding.textStatus.setText("Success");
                this.myStatus = "Success";
            } else if (comStatus.equals("pending")) {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.warning);
                this.binding.textStatus.setText("Pending");
                this.myStatus = "Pending";
            } else {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.failed);
                this.binding.textStatus.setText("Failed");
                this.myStatus = "Failed";
            }
            this.shareResponse = object.getString("message");
            this.binding.responseMessage.setText(object.getString("message"));
            String type_response = this.historyResponse.getType_response();
            this.transactionType = type_response;
            if (type_response == null) {
                this.transactionType = "";
            }
            this.binding.transactionType.setText(this.transactionType.toUpperCase());
            this.charges = detObject.getString("charges");
            this.binding.charges.setText(this.charges);
            this.gst_no = detObject.getString("gst_no");
            this.binding.gstNo.setText(this.gst_no);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            onBackPressed();
            finish();
            return true;
        }
        if (item.getItemId() == C0330R.C0333id.share) {
            shareTheData();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0330R.C0335menu.response_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void shareTheData() {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (this.shareResponse == null) {
                this.shareResponse = "nothing";
            }
            Intent whatsappIntent = new Intent("android.intent.action.SEND");
            whatsappIntent.setType("text/plain");
            whatsappIntent.putExtra("android.intent.extra.TEXT", this.shareValue);
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    private void setListener() {
        this.binding.printReceipt.setOnClickListener(new PayoutDetailedAnalytic$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListener$0$com-sandy-cosmossoft-activities-payoutpaysprint-PayoutDetailedAnalytic */
    public /* synthetic */ void mo1063x187af050(View v) {
        Dexter.withContext(this).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new PermissionListener() {
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                PayoutDetailedAnalytic payoutDetailedAnalytic = PayoutDetailedAnalytic.this;
                payoutDetailedAnalytic.createPDFFile(PayoutDetailedAnalytic.this.getExternalFilesDir("MyInvoices") + "/" + "invoice.pdf");
            }

            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                ViewUtils.showToast(PayoutDetailedAnalytic.this.getApplicationContext(), "Permission Denied for Printing");
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
            }
        }).check();
    }

    /* access modifiers changed from: private */
    public void createPDFFile(String path) {
        String str = path;
        if (new File(str).exists()) {
            new File(str).delete();
        }
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(str));
            document.open();
            document.setPageSize(PageSize.f688A4);
            document.addCreationDate();
            document.addAuthor(getResources().getString(C0330R.string.app_name));
            document.addCreator(this.user.getName() + MaskedEditText.SPACE + this.user.getLastname());
            BaseColor colorAccent = new BaseColor(0, 153, (int) XMPError.BADSTREAM, 255);
            Bitmap bmp = BitmapFactory.decodeStream(getAssets().open("logo.png"));
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
            Image companyLogo = Image.getInstance(stream.toByteArray());
            companyLogo.setAlignment(1);
            companyLogo.scalePercent(25.0f);
            document.add(companyLogo);
            AddLineSeparator(document);
            BaseFont fontName = BaseFont.createFont("assets/fonts/brandon_medium.otf", "UTF-8", true);
            Font titleFont = new Font(fontName, 36.0f, 0, BaseColor.BLACK);
            addNewItem(document, this.model.getPayment_type() + MaskedEditText.SPACE + this.transactionType.toUpperCase(), 1, titleFont);
            Font orderNumberFont = new Font(fontName, 20.0f, 0, colorAccent);
            Font orderNumberValueFont = new Font(fontName, 20.0f, 0, colorAccent);
            AddLineSeparator(document);
            Font font = titleFont;
            addNewItem(document, "Beneficiary ID:", 0, orderNumberFont);
            addNewItem(document, this.model.getOnMobile(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Transaction Type:", 0, orderNumberFont);
            addNewItem(document, this.model.getOp_id(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Transaction ID:", 0, orderNumberFont);
            addNewItem(document, this.model.getTxn_id(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "TDS Charge:", 0, orderNumberFont);
            addNewItem(document, this.model.getTds(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Amount:", 0, orderNumberFont);
            StringBuilder sb = new StringBuilder();
            sb.append("₹");
            BaseColor baseColor = colorAccent;
            sb.append(getResources().getString(C0330R.string.rupee_sign));
            sb.append(MaskedEditText.SPACE);
            sb.append(this.model.getAmount());
            addNewItem(document, sb.toString(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Amount in Words:", 0, orderNumberFont);
            addNewItem(document, this.model.getAmount_in_word(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Charges:", 0, orderNumberFont);
            addNewItem(document, "₹" + this.charges, 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Response:", 0, orderNumberFont);
            addNewItem(document, this.shareResponse, 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Date:", 0, orderNumberFont);
            addNewItem(document, this.model.getDate(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Retailer:", 0, orderNumberFont);
            addNewItem(document, this.user.getName() + MaskedEditText.SPACE + this.user.getLastname(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, "Retailer Mobile:", 0, orderNumberFont);
            addNewItem(document, this.user.getMobile(), 0, orderNumberValueFont);
            AddLineSeparator(document);
            addNewItem(document, getResources().getString(C0330R.string.f117x7e6109eb), 1, orderNumberFont);
            AddLineSeparator(document);
            document.close();
            printPDF();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            ViewUtils.showToast(this, e.getMessage());
        }
    }

    private void printPDF() {
        PrintManager printManager = (PrintManager) getSystemService("print");
        try {
            printManager.print("Document", new PdfDocumentAdapter(this, getExternalFilesDir("MyInvoices") + "/" + "invoice.pdf"), new PrintAttributes.Builder().build());
        } catch (Exception e) {
            ViewUtils.showToast(this, e.getMessage());
        }
    }

    private void AddLineSeparator(Document document) throws DocumentException {
        LineSeparator lineSeparator = new LineSeparator();
        lineSeparator.setLineColor(new BaseColor(0, 0, 0, 0));
        addLineSpace(document);
        document.add(new Chunk((DrawInterface) lineSeparator));
        addLineSpace(document);
    }

    private void addLineSpace(Document document) throws DocumentException {
        document.add(new Paragraph());
    }

    private void addNewItem(Document document, String text, int align, Font font) throws DocumentException {
        Paragraph paragraph = new Paragraph(new Chunk(text, font));
        paragraph.setAlignment(align);
        document.add(paragraph);
    }
}
