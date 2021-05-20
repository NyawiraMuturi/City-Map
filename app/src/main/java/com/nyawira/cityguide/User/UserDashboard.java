package com.nyawira.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.nyawira.cityguide.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.nyawira.cityguide.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.nyawira.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    //variables
    RecyclerView featured, popular, category;
    RecyclerView.Adapter adapter;

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

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.java, "Java-Kimathi Street", "jhuvjdhfu isueri icoirnce surnbce ncxjhdsbci iufhfviur"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.forest, "Karura Forest", "jhuvjdhfu isueri icoirnce surnbce ncxjhdsbci iufhfviur"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.club, "Klub One", "jhuvjdhfu isueri icoirnce surnbce ncxjhdsbci iufhfviur"));

        adapter = new FeaturedAdapter(featuredLocations);
        featured.setAdapter(adapter);
    }
}