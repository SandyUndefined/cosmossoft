package com.sandy.cosmossoft.activities.rechargeactivities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
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
import com.sandy.cosmossoft.databinding.ActivityMobileRechargeBinding;
import com.sandy.cosmossoft.listeners.ContactsClickListener;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.ArrayList;
import java.util.Objects;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observable;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileRecharge extends Hilt_MobileRecharge implements ContactsClickListener {
    ContactsAdapter adapter;
    ArrayList<ContactsModel> allContactsList;
    ActivityMobileRechargeBinding binding;
    ProgressDialog dialog;
    String logo;
    String opCode;
    String opName;
    String purpose;
    MobileRechargeViewModel rechargeViewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMobileRechargeBinding inflate = ActivityMobileRechargeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Select Contacts");
        MobileRechargeViewModel mobileRechargeViewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.rechargeViewModel = mobileRechargeViewModel;
        this.binding.setRechargeViewModel(mobileRechargeViewModel);
        Bundle bundle = getIntent().getExtras();
        String string = bundle.getString("purpose");
        this.purpose = string;
        if (string.equals("Recharge")) {
            this.opName = bundle.getString("name");
            this.opCode = bundle.getString("operatorCode");
            this.logo = bundle.getString("logo");
            this.rechargeViewModel.longCode = this.opCode;
            this.rechargeViewModel.operator = this.opName;
            this.rechargeViewModel.logo = this.logo;
        } else {
            this.binding.enteredNumberSelf.setVisibility(8);
        }
        this.allContactsList = new ArrayList<>();
        this.binding.allContactsCard.setVisibility(8);
        this.dialog = new ProgressDialog(this);
        makeItWork();
        this.binding.contactsSearchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                onBackPressed();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void makeItWork() {
        this.dialog.setMessage("Please wait, Loading..");
        this.dialog.show();
        Observable.just("one").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                MobileRecharge.this.getContactList();
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
                MobileRecharge.this.binding.allContactsRecycler.setLayoutManager(new GridLayoutManager((Context) MobileRecharge.this, 1, 1, false));
                MobileRecharge.this.adapter = new ContactsAdapter(MobileRecharge.this.allContactsList, MobileRecharge.this);
                MobileRecharge.this.binding.allContactsRecycler.setAdapter(MobileRecharge.this.adapter);
                MobileRecharge.this.binding.allContactsRecycler.setOverScrollMode(2);
                MobileRecharge.this.binding.allContactsCard.setVisibility(0);
                MobileRecharge.this.dialog.dismiss();
                MobileRecharge.this.searchAble();
            }
        });
    }

    public void searchAble() {
        this.binding.contactsSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                MobileRecharge.this.adapter.getFilter().filter(query);
                MobileRecharge.this.rechargeViewModel.enteredNumber = query;
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                MobileRecharge.this.adapter.getFilter().filter(newText);
                MobileRecharge.this.rechargeViewModel.enteredNumber = newText;
                return false;
            }
        });
    }

    /* access modifiers changed from: private */
    public void getContactList() {
        Cursor cursor = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "display_name ASC");
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String id = cursor.getString(cursor.getColumnIndex("_id"));
                String name = cursor.getString(cursor.getColumnIndex("display_name"));
                Uri uriPhone = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                Cursor phoneCursor = getContentResolver().query(uriPhone, (String[]) null, "contact_id =?", new String[]{id}, (String) null);
                if (phoneCursor.moveToNext()) {
                    this.allContactsList.add(new ContactsModel(name, phoneCursor.getString(phoneCursor.getColumnIndex("data1")).replaceAll("[^\\w]", "")));
                    phoneCursor.close();
                }
            }
        }
    }

    public void onRecyclerViewContactsClickListener(View view, ContactsModel model) {
        if (this.purpose.equals("Number")) {
            StringBuilder builder = new StringBuilder(model.getNumber().replaceAll("[^\\w]", ""));
            if (builder.charAt(0) == '9' && builder.charAt(1) == '1') {
                builder.deleteCharAt(0);
                builder.deleteCharAt(0);
            }
            Intent data = new Intent();
            data.putExtra("number", String.valueOf(builder));
            data.putExtra("name", model.getName());
            setResult(-1, data);
            finish();
            return;
        }
        Intent intent = new Intent(this, RechargeMyPlan.class);
        intent.putExtra("name", model.getName());
        intent.putExtra("number", model.getNumber());
        intent.putExtra("operatorName", this.opName);
        intent.putExtra("operatorCode", this.opCode);
        intent.putExtra("logo", this.logo);
        startActivity(intent);
    }

    public void onBackPressed() {
        if (this.purpose.equals("Number")) {
            setResult(0);
        }
        super.onBackPressed();
    }
}
