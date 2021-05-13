package com.nyawira.cityguide.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.nyawira.cityguide.HelperClasses.SliderAdapter;
import com.nyawira.cityguide.R;

public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dots;
    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        viewPager = findViewById(R.id.slider);
        dots = findViewById(R.id.dots);

        sliderAdapter =new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);
    }
}