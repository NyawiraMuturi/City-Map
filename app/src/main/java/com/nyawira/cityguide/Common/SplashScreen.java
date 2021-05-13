package com.nyawira.cityguide.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.nyawira.cityguide.R;
import com.nyawira.cityguide.User.UserDashboard;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 4000;

    //variables
    ImageView landing;
    TextView slogan, sloganName, catchPhrase;
    Animation sideAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //hooks
        landing=findViewById(R.id.imageView);
        slogan = findViewById(R.id.slogan);
        sloganName = findViewById(R.id.sloganName);
        catchPhrase = findViewById(R.id.catchPhrase);
        sideAnim = AnimationUtils.loadAnimation (this, R.anim.side_anim);

        //set Animations on Elements
        slogan.setAnimation(sideAnim);
        sloganName.setAnimation(sideAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIMER);
    }
}