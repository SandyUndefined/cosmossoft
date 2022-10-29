package com.sandy.cosmossoft.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends Hilt_SplashScreen {
    Animation bottomAnimation;
    User loggedUser = null;
    ImageView logo;
    TextView logoText;
    Animation topAnimation;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) C0330R.layout.activity_splash_screen);
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar);
        actionBar.hide();
        this.loggedUser = ((AuthViewModel) new ViewModelProvider(this).get(AuthViewModel.class)).userRepository.getRegularUser();
        this.topAnimation = AnimationUtils.loadAnimation(getApplicationContext(), C0330R.anim.top_animation);
        this.bottomAnimation = AnimationUtils.loadAnimation(getApplicationContext(), C0330R.anim.bottom_animation);
        this.logo = (ImageView) findViewById(C0330R.C0333id.LogoSplash);
        this.logoText = (TextView) findViewById(C0330R.C0333id.LogoSplashText);
        this.logo.setAnimation(this.topAnimation);
        this.logoText.setAnimation(this.bottomAnimation);
        new Timer().schedule(new TimerTask() {
            public void run() {
                Intent intent;
                if (SplashScreen.this.loggedUser != null) {
                    intent = new Intent(SplashScreen.this, HomeActivity.class);
                } else {
                    intent = new Intent(SplashScreen.this, MainActivity.class);
                }
                intent.setFlags(268468224);
                SplashScreen.this.startActivity(intent);
            }
        }, 4000);
    }
}
