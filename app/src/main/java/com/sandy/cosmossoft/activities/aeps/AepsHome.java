package com.sandy.cosmossoft.activities.aeps;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.MenuAdapter;
import com.sandy.cosmossoft.data.model.MenuModel;
import com.sandy.cosmossoft.databinding.ActivityAepsHomeBinding;
import com.sandy.cosmossoft.listeners.RecyclerViewClickListener;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AepsHome extends Hilt_AepsHome implements RecyclerViewClickListener {
    ActivityAepsHomeBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAepsHomeBinding inflate = ActivityAepsHomeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "AePS");
        AepsViewModel aepsViewModel = (AepsViewModel) new ViewModelProvider(this).get(AepsViewModel.class);
        setHomeMenus();
    }

    private void setHomeMenus() {
        this.binding.aepsHomeMenu.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
        List<MenuModel> moneyTransferList = new ArrayList<>();
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_balance_enquery), "Balance\nEnquiry"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_mini_statement), "Mini\nStatement"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_withdraw), "Cash\nWithdrawal"));
        moneyTransferList.add(new MenuModel(Integer.valueOf(C0330R.C0332drawable.ic_aadharpay), "Aadhaar\nPay"));
        this.binding.aepsHomeMenu.setAdapter(new MenuAdapter(moneyTransferList, this));
        this.binding.aepsHomeMenu.setOverScrollMode(2);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRecyclerViewClickItem(android.view.View r4, MenuModel r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getTitle()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1449302980: goto L_0x002a;
                case 858364492: goto L_0x0020;
                case 1159504684: goto L_0x0016;
                case 1306165269: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r1 = "Balance\nEnquiry"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r1 = "Cash\nWithdrawal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "Aadhaar\nPay"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "Mini\nStatement"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 3
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            java.lang.String r1 = "aepsType"
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0056;
                case 2: goto L_0x0046;
                case 3: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0071
        L_0x003b:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.aeps.MiniStatement> r1 = com.sandy.cosmossoft.activities.aeps.MiniStatement.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
            goto L_0x0071
        L_0x0046:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.aeps.CashWithdrawal> r2 = com.sandy.cosmossoft.activities.aeps.CashWithdrawal.class
            r0.<init>(r3, r2)
            java.lang.String r2 = "M"
            r0.putExtra(r1, r2)
            r3.startActivity(r0)
            goto L_0x0071
        L_0x0056:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.aeps.CashWithdrawal> r2 = com.sandy.cosmossoft.activities.aeps.CashWithdrawal.class
            r0.<init>(r3, r2)
            java.lang.String r2 = "CW"
            r0.putExtra(r1, r2)
            r3.startActivity(r0)
            goto L_0x0071
        L_0x0066:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.aeps.BalanceEnquiry> r1 = com.sandy.cosmossoft.activities.aeps.BalanceEnquiry.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.activities.aeps.AepsHome.onRecyclerViewClickItem(android.view.View, com.sandy.cosmossoft.data.model.MenuModel):void");
    }
}
