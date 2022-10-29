package com.sandy.cosmossoft.activities.mobilenumber;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.adapters.ContactsAdapter;
import com.sandy.cosmossoft.data.model.ContactsModel;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.databinding.ActivityMobileNumberHomePageBinding;
import com.sandy.cosmossoft.listeners.ContactsClickListener;
import com.sandy.cosmossoft.listeners.NumberPayListener;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;
import java.util.ArrayList;
import java.util.Objects;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observable;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileNumberPay extends Hilt_MobileNumberPay implements NumberPayListener, ContactsClickListener {
    /* access modifiers changed from: private */
    public static final String[] PROJECTION = {"contact_id", "display_name", "data1"};
    ContactsAdapter adapter;
    ArrayList<ContactsModel> allContactsList;
    ActivityMobileNumberHomePageBinding binding;
    ProgressDialog dialog;
    MobileNumberPayViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMobileNumberHomePageBinding inflate = ActivityMobileNumberHomePageBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Mobile Number");
        MobileNumberPayViewModel mobileNumberPayViewModel = (MobileNumberPayViewModel) new ViewModelProvider(this).get(MobileNumberPayViewModel.class);
        this.viewModel = mobileNumberPayViewModel;
        this.binding.setMobileNumbersViewModel(mobileNumberPayViewModel);
        this.viewModel.listener = this;
        this.allContactsList = new ArrayList<>();
        this.binding.allContactsCard.setVisibility(8);
        this.dialog = new ProgressDialog(this);
        new TestAsync().execute(new Void[0]);
        this.binding.contactsSearchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void onRecyclerViewContactsClickListener(View view, ContactsModel model) {
        this.viewModel.checkIfAccountExists(model.getNumber());
    }

    private void makeItWork() {
        this.dialog.setMessage("Please wait, Loading..");
        this.dialog.show();
        Observable.just("one").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                MobileNumberPay.this.contactsHere();
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
                MobileNumberPay.this.binding.allContactsRecycler.setLayoutManager(new GridLayoutManager((Context) MobileNumberPay.this, 1, 1, false));
                MobileNumberPay.this.adapter = new ContactsAdapter(MobileNumberPay.this.allContactsList, MobileNumberPay.this);
                MobileNumberPay.this.binding.allContactsRecycler.setAdapter(MobileNumberPay.this.adapter);
                MobileNumberPay.this.binding.allContactsRecycler.setOverScrollMode(2);
                MobileNumberPay.this.binding.allContactsCard.setVisibility(0);
                MobileNumberPay.this.dialog.dismiss();
                MobileNumberPay.this.searchAble();
            }
        });
    }

    public void searchAble() {
        this.binding.contactsSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                MobileNumberPay.this.adapter.getFilter().filter(query);
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                MobileNumberPay.this.adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    /* access modifiers changed from: private */
    public void contactsHere() {
        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, PROJECTION, (String) null, (String[]) null, (String) null);
        if (cursor != null) {
            try {
                int nameIndex = cursor.getColumnIndex("display_name");
                int numberIndex = cursor.getColumnIndex("data1");
                while (cursor.moveToNext()) {
                    this.allContactsList.add(new ContactsModel(cursor.getString(nameIndex), cursor.getString(numberIndex)));
                }
            } finally {
                cursor.close();
            }
        }
    }

    public void isNumberValid(AuthResponse authResponse) {
        if (authResponse.isStatus()) {
            Intent intent = new Intent(this, SendMoney.class);
            intent.putExtra("receiver_id", authResponse.getUser().getId());
            intent.putExtra("receiver_name", authResponse.getUser().getName() + MaskedEditText.SPACE + authResponse.getUser().getLastname());
            intent.putExtra("receiver_mobile", authResponse.getUser().getMobile());
            startActivity(intent);
        } else {
            ViewUtils.showToast(this, authResponse.getMessage());
        }
        this.dialog.dismiss();
    }

    public void showMessage(String message) {
        this.dialog.setTitle(message);
        this.dialog.show();
    }

    public void showProgress(String message) {
        this.dialog.setTitle(message);
        this.dialog.show();
    }

    public class TestAsync extends AsyncTask<Void, Void, ArrayList<ContactsModel>> {
        String TAG = getClass().getSimpleName();
        ArrayList<ContactsModel> arrayList = new ArrayList<>();

        public TestAsync() {
        }

        /* access modifiers changed from: protected */
        public ArrayList<ContactsModel> doInBackground(Void... voids) {
            String lastnumber = "";
            Cursor cursor = MobileNumberPay.this.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, MobileNumberPay.PROJECTION, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    int nameIndex = cursor.getColumnIndex("display_name");
                    int numberIndex = cursor.getColumnIndex("data1");
                    while (cursor.moveToNext()) {
                        String name = cursor.getString(nameIndex);
                        String number = cursor.getString(numberIndex).trim().replaceAll("\\s", "");
                        if (!number.equals(lastnumber)) {
                            lastnumber = number;
                            this.arrayList.add(new ContactsModel(name, number));
                            publishProgress(new Void[0]);
                        }
                    }
                } finally {
                    cursor.close();
                }
            }
            return this.arrayList;
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            if (MobileNumberPay.this.adapter != null) {
                MobileNumberPay.this.adapter.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            MobileNumberPay.this.binding.allContactsRecycler.setLayoutManager(new GridLayoutManager((Context) MobileNumberPay.this, 1, 1, false));
            MobileNumberPay.this.adapter = new ContactsAdapter(this.arrayList, MobileNumberPay.this);
            MobileNumberPay.this.binding.allContactsRecycler.setAdapter(MobileNumberPay.this.adapter);
            MobileNumberPay.this.binding.allContactsRecycler.setOverScrollMode(2);
            MobileNumberPay.this.binding.allContactsCard.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(ArrayList<ContactsModel> contactsModels) {
            super.onPostExecute(contactsModels);
            MobileNumberPay.this.searchAble();
        }
    }
}
