package com.nyawira.cityguide.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.nyawira.cityguide.R;

public class BirthDate extends AppCompatActivity {

    Button nextBtn, loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_date);

        nextBtn = findViewById(R.id.nextBtn);
    }
    public void callNext(View view){
        Intent intent = new Intent(getApplicationContext(), PhoneVerification.class);
        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(nextBtn, "loginTransition");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BirthDate.this, pairs);
        startActivity(intent, options.toBundle());
    }
}