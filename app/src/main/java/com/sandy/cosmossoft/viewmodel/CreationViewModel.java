package com.sandy.cosmossoft.viewmodel;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.PackageType;
import com.sandy.cosmossoft.data.model.PersonUserModel;
import com.sandy.cosmossoft.data.model.UserTypeModel;
import com.sandy.cosmossoft.data.repositories.CreationRepository;
import com.sandy.cosmossoft.listeners.CreationListener;
import java.util.List;
import javax.inject.Inject;

public class CreationViewModel extends ViewModel implements CreationListener {
    public String email = null;
    public String first_name = null;
    public String last_name = null;
    public String mobile = null;
    public PackageType packageType = null;
    public PersonUserModel personUserModel = null;
    public CreationRepository repository;
    public List<UserTypeModel> userTypeModelList = null;
    public UserTypeModel userTypemodel = null;

    @Inject
    public CreationViewModel(CreationRepository repository2) {
        this.repository = repository2;
    }

    public void onUserTypeClick(View view) {
        if (this.userTypeModelList == null) {
            this.repository.bringUserType(this, view);
        } else {
            onUserTypeSpinnerClick(view);
        }
    }

    public void onOwnerClick(View view) {
    }

    public void onUserPackageTypeClick(View view) {
    }

    public void onAddUserClick(View view) {
    }

    public void achieveUserType(List<UserTypeModel> userTypeModelList2) {
        this.userTypeModelList = userTypeModelList2;
    }

    public void achievePersonUser(List<PersonUserModel> list) {
    }

    public void achievePackageType(List<PackageType> list) {
    }

    public void onUserTypeSpinnerClick(View view) {
        Dialog dialog = new Dialog(view.getContext());
        dialog.setContentView(C0330R.layout.my_spinner_row);
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        ListView myOperatorListView = (ListView) dialog.findViewById(C0330R.C0333id.MyOperatorListView);
        ((TextView) dialog.findViewById(C0330R.C0333id.head_title_section)).setText("User Types");
        final ArrayAdapter<UserTypeModel> adapter = new ArrayAdapter<>(view.getContext(), 17367043, this.userTypeModelList);
        myOperatorListView.setAdapter(adapter);
        ((EditText) dialog.findViewById(C0330R.C0333id.SearchOperator)).addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        myOperatorListView.setOnItemClickListener(new CreationViewModel$$ExternalSyntheticLambda0(this, view, adapter, dialog));
    }

    /* renamed from: lambda$onUserTypeSpinnerClick$0$com-sandy-cosmossoft-viewmodel-CreationViewModel */
    public /* synthetic */ void mo48048xa07aae8f(View view, ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        ((TextInputEditText) view.findViewById(C0330R.C0333id.user_type)).setText(((UserTypeModel) adapter.getItem(position)).name);
        this.userTypemodel = (UserTypeModel) adapter.getItem(position);
        dialog.dismiss();
    }
}
