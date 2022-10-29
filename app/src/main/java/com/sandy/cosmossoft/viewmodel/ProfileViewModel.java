package com.sandy.cosmossoft.viewmodel;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import androidx.lifecycle.ViewModel;
import com.fingpay.microatmsdk.utils.Constants;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.profile.ProfileDetails;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.data.repositories.ProfileRepository;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {
    public String confirm_pass = null;
    DatePickerDialog.OnDateSetListener date = new ProfileViewModel$$ExternalSyntheticLambda0(this);
    TextInputEditText dob_editText;
    final Calendar myCalendar = Calendar.getInstance();
    public String new_pass = null;
    public String old_pass = null;
    public ProfileRepository profileRepository;
    public User user;
    public UserProfile userProfile;

    @Inject
    public ProfileViewModel(ProfileRepository profileRepository2) {
        this.profileRepository = profileRepository2;
    }

    public void onEditDetails(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), ProfileDetails.class));
    }

    public void selectDOB(View view) {
        this.dob_editText = (TextInputEditText) view.findViewById(C0330R.C0333id.selectedDOB);
        new DatePickerDialog(view.getContext(), this.date, this.myCalendar.get(1), this.myCalendar.get(2), this.myCalendar.get(5)).show();
    }

    public void updateProfileData(View view) {
        if (this.user.getName().trim().isEmpty() || this.user.getLastname().trim().isEmpty() || this.userProfile.getDOB() == null || this.userProfile.getDOB().trim().isEmpty() || this.userProfile.GENDER == null || this.userProfile.GENDER.trim().isEmpty() || this.userProfile.COUNTRY == null || this.userProfile.COUNTRY.trim().isEmpty() || this.userProfile.STATE == null || this.userProfile.STATE.trim().isEmpty() || this.user.pin == null || this.user.pin.trim().isEmpty() || this.user.address == null || this.user.address.trim().isEmpty()) {
            ViewUtils.showToast(view.getContext(), "Provide all the information..");
        } else {
            this.profileRepository.updateProfileDetails(view.getContext(), this.userProfile, this.user);
        }
    }

    public void selectTheGender(RadioGroup radioGroup, int id) {
        if (radioGroup.getCheckedRadioButtonId() == C0330R.C0333id.male) {
            this.userProfile.GENDER = "Male";
        } else if (radioGroup.getCheckedRadioButtonId() == C0330R.C0333id.fe_male) {
            this.userProfile.GENDER = "Female";
        } else if (radioGroup.getCheckedRadioButtonId() == C0330R.C0333id.others) {
            this.userProfile.GENDER = "Others";
        }
    }

    /* renamed from: lambda$new$0$com-sandy-cosmossoft-viewmodel-ProfileViewModel  reason: not valid java name */
    public /* synthetic */ void m2693lambda$new$0$comsandycosmossoftviewmodelProfileViewModel(DatePicker view1, int year, int monthOfYear, int dayOfMonth) {
        this.myCalendar.set(1, year);
        this.myCalendar.set(2, monthOfYear);
        this.myCalendar.set(5, dayOfMonth);
        updateLabel();
    }

    private void updateLabel() {
        SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_HISTORY, Locale.ENGLISH);
        this.userProfile.setDOB(sdf.format(this.myCalendar.getTime()));
        this.dob_editText.setText(sdf.format(this.myCalendar.getTime()));
    }

    public void updateSocialMediaData(View view) {
        try {
            this.profileRepository.updateSocialMediaDetails(view.getContext(), this.userProfile, AppDatabase.getAppDatabase(view.getContext()).getUserDao().getRegularUser());
        } catch (NullPointerException e) {
            Context context = view.getContext();
            ViewUtils.showToast(context, "Failed due to: " + e.getMessage());
        }
    }

    public void updateBankDetailsData(View view) {
    }

    public void updateSettingsDetailsData(View view) {
        User user2 = AppDatabase.getAppDatabase(view.getContext()).getUserDao().getRegularUser();
        String str = this.old_pass;
        if (str == null || !str.equals(user2.getPassword())) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Old Password is Wrong", C0330R.C0332drawable.warning);
            return;
        }
        String str2 = this.new_pass;
        if (str2 == null || str2.length() < 5) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Enter a valid new Password eg: @#344bces^3 etc", C0330R.C0332drawable.warning);
            return;
        }
        String str3 = this.confirm_pass;
        if (str3 == null || !str3.equals(this.new_pass)) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Enter a valid new Password doesn't match.", C0330R.C0332drawable.warning);
        } else {
            this.profileRepository.updateMyPassword(view.getContext(), user2, this.new_pass);
        }
    }
}
