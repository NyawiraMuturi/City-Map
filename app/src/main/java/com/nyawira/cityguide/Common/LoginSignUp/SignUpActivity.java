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
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;
import com.nyawira.cityguide.R;

public class SignUpActivity extends AppCompatActivity {

    //variables
    ImageView backButton;
    Button nextBtn, loginBtn;
    TextInputLayout fullName, userName, userEmail, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        //hooks
        backButton = findViewById(R.id.backBtn);
        nextBtn = findViewById(R.id.nextBtn);
        loginBtn = findViewById(R.id.login);
        fullName = findViewById(R.id.fullName);
        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpActivity.super.onBackPressed();
            }
        });
    }

    public void callNextScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), BirthDate.class);
        //Transition
        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(nextBtn, "transitionNextBtn");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this, pairs);
        startActivity(intent, options.toBundle());
    }

    public void callLogin(View view) {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(loginBtn, "loginTransition");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this, pairs);
        startActivity(intent, options.toBundle());

    }

    private boolean validateFullName() {
        String val = fullName.getEditText().getText().toString().trim();

        if (val.isEmpty()) {
            fullName.setError("Fill in full name");
            return false;
        } else {
            fullName.setError(null);
            fullName.setErrorEnabled(false);
            return true;
        }
    }
}