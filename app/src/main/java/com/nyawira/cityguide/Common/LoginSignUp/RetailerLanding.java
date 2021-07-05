package com.nyawira.cityguide.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.nyawira.cityguide.R;

public class RetailerLanding extends AppCompatActivity {

    Button login, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_landing);

        login = findViewById(R.id.loginBtn);
        signUp = findViewById(R.id.signUpBtn);
    }
    public void callLogin(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(login, "loginTransition");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RetailerLanding.this, pairs);
        startActivity(intent, options.toBundle());
    }
    public void callSignUp(View view){
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(signUp, "transitionSignUp");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RetailerLanding.this, pairs);
        startActivity(intent, options.toBundle());

    }
}