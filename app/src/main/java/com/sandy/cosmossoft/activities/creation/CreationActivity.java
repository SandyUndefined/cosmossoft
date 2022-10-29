package com.sandy.cosmossoft.activities.creation;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityCreationBinding;
import com.sandy.cosmossoft.viewmodel.CreationViewModel;

public class CreationActivity extends Hilt_CreationActivity {
    ActivityCreationBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCreationBinding inflate = ActivityCreationBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.setCreationViewModel((CreationViewModel) new ViewModelProvider(this).get(CreationViewModel.class));
    }
}
