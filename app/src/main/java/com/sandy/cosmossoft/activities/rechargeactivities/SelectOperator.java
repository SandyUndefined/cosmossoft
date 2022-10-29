package com.sandy.cosmossoft.activities.rechargeactivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.activities.bbps.BbpsEnter;
import com.sandy.cosmossoft.adapters.OperatorAdapter;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.databinding.ActivitySelectOperatorBinding;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.listeners.OperatorListener;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.List;
import java.util.Objects;

public class SelectOperator extends Hilt_SelectOperator implements OperatorListener {
    ActivitySelectOperatorBinding binding;
    OperatorAdapter operatorAdapter;
    String operatorType;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySelectOperatorBinding inflate = ActivitySelectOperatorBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Select Operator");
        this.operatorType = getIntent().getExtras().getString("operatorType");
        MobileRechargeViewModel viewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.binding.setSelectOperatorViewModel(viewModel);
        this.binding.getRoot().setOverScrollMode(2);
        setFragment(new SliderFragment(), this.binding.selectOperatorSliders);
        viewModel.getOperators(this.operatorType, this.binding.operatorsRecycler).observe(this, new SelectOperator$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-rechargeactivities-SelectOperator */
    public /* synthetic */ void mo48307x99cfce7e(List operatorModelList) {
        if (operatorModelList != null) {
            setOperators(operatorModelList);
        }
    }

    public void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void setOperators(List<OperatorModel> list) {
        this.binding.operatorsRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.operatorAdapter = new OperatorAdapter(list, this);
        this.binding.operatorsRecycler.setAdapter(this.operatorAdapter);
        this.binding.operatorsRecycler.setOverScrollMode(2);
        this.binding.OperatorListCard.setVisibility(0);
        searchAble();
    }

    public void searchAble() {
        this.binding.operatorSearchList.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                SelectOperator.this.operatorAdapter.getFilter().filter(query);
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                SelectOperator.this.operatorAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    public void myOperatorClicks(View view, OperatorModel model) {
        Intent intent;
        if (MobileRechargeViewModel.service.equals("Mobile\nRecharge") || MobileRechargeViewModel.service.equals("DTH")) {
            intent = new Intent(this, RechargeMyPlan.class);
        } else {
            intent = new Intent(this, BbpsEnter.class);
        }
        intent.putExtra("name", model.getName());
        intent.putExtra("operatorCode", model.getOperatorcode());
        intent.putExtra("logo", model.getLogo());
        startActivity(intent);
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
}
