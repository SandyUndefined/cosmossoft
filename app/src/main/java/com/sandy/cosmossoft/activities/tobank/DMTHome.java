package com.sandy.cosmossoft.activities.tobank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.DmtUserAdapter;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;
import com.sandy.cosmossoft.databinding.ActivityDmthomeBinding;
import com.sandy.cosmossoft.listeners.DMTAccountListener;
import com.sandy.cosmossoft.listeners.DMTHomeListeners;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.List;
import java.util.Objects;

public class DMTHome extends Hilt_DMTHome implements DMTHomeListeners, DMTAccountListener {
    ActivityDmthomeBinding binding;
    ToBankViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDmthomeBinding inflate = ActivityDmthomeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Direct Money Transfer");
        ToBankViewModel toBankViewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.viewModel = toBankViewModel;
        this.binding.setToBankViewModel(toBankViewModel);
        this.viewModel.toBankRepository.getAllMyDMTReports(this);
        this.binding.addMoreBeneficiary.setOnClickListener(new DMTHome$$ExternalSyntheticLambda0(this));
        Bundle bundle = getIntent().getExtras();
        Objects.requireNonNull(bundle);
        String message = bundle.getString("message");
        if (message != null) {
            MyAlertUtils.anotherAlertDialog(this, message, "Message", Integer.valueOf(C0330R.C0332drawable.success));
        }
        this.binding.searchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-tobank-DMTHome */
    public /* synthetic */ void mo16xe57646f(View v) {
        startActivity(new Intent(this, QueryRemitter.class));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void setWholeRecycler(List<DmtUserData> list) {
        this.binding.dmtUserRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        final DmtUserAdapter adapter = new DmtUserAdapter(list, this);
        this.binding.dmtUserRecycler.setAdapter(adapter);
        MyAlertUtils.dismissAlertDialog();
        if (list == null || list.isEmpty()) {
            this.binding.noRecords.setVisibility(0);
            this.binding.userSearchCard.setVisibility(8);
        } else {
            this.binding.noRecords.setVisibility(8);
            this.binding.userSearchCard.setVisibility(0);
        }
        this.binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String s) {
                adapter.getFilter().filter(s);
                return false;
            }

            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }

    public void setErrorInFetch(String value) {
        MyAlertUtils.showServerAlertDialog(this, value);
    }

    public void initiateStart() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void onAccountClick(View view, DmtUserData data) {
        Intent intent = new Intent(this, ToAccount.class);
        intent.putExtra("number", data.getMobile());
        intent.putExtra("status", data.isStatus());
        intent.putExtra("message", data.getMessage());
        startActivity(intent);
    }

    public void onRefreshClick(View view, DmtUserData data) {
        this.viewModel.refreshDMTUserAccount(data.getId(), data.getMobile(), this, this);
    }

    public void onDeleteClick(View view, DmtUserData data) {
        this.viewModel.deleteDMTUserAccount(data.getId(), this, this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
