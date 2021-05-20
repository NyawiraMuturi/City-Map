package com.nyawira.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.nyawira.cityguide.R;

public class UserDashboard extends AppCompatActivity {

    //variables
    RecyclerView featured, popular, category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //hooks
        featured = findViewById(R.id.featured);
        popular = findViewById(R.id.popular);
        category = findViewById(R.id.categories);

        featuredRecycler();
    }

    private void featuredRecycler() {

        featured.setHasFixedSize(true);
        featured.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}