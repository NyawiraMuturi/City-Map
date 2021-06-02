package com.nyawira.cityguide.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.nyawira.cityguide.R;

public class SignUpActivity extends AppCompatActivity {

    //variables
    ImageView backButton;
    Button nextBtn, loginBtn;

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

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpActivity.super.onBackPressed();
            }
        });
    }

    public void callNextScreen (View view){

    }
}