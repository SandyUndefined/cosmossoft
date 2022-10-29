package com.sandy.cosmossoft.activities.microatm;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmResponseBinding;
import java.util.Objects;

public class MicroAtmResponse extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMicroAtmResponseBinding binding = ActivityMicroAtmResponseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setMicroAtmData(MicroAtmHome.microAtmModel);
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "ATM Details");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }
}
