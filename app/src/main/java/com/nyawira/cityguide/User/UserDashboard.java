package com.nyawira.cityguide.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.nyawira.cityguide.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.nyawira.cityguide.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.nyawira.cityguide.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.nyawira.cityguide.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.nyawira.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //variables
    RecyclerView featured, category;
    RecyclerView.Adapter adapter;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //hooks
        featured = findViewById(R.id.featured);
        category = findViewById(R.id.categories);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_view);
        menu = findViewById(R.id.menuIcon);

        featuredRecycler();
        categoryRecycler();
        navigationDrawer();
    }

    //Navigation Functions
    private void navigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_all:
                startActivity(new Intent(getApplicationContext(), AllCategories.class));
                break;
        }
        return true;
    }

   //RecyclerView Functions
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
    private void categoryRecycler() {
        category.setHasFixedSize(true);
        category.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<CategoriesHelperClass> categoryLocation = new ArrayList<>();
        categoryLocation.add(new CategoriesHelperClass("Restaurants", R.drawable.restaurant));
        categoryLocation.add(new CategoriesHelperClass("Airports", R.drawable.airport));
        categoryLocation.add(new CategoriesHelperClass("Hospitals", R.drawable.hospital));

        adapter = new CategoriesAdapter(categoryLocation);
        category.setAdapter(adapter);
    }

}