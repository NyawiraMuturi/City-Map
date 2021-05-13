package com.nyawira.cityguide.HelperClasses;

import android.content.Context;

import androidx.viewpager.widget.PagerAdapter;

import com.nyawira.cityguide.R;

public class SliderAdapter extends PagerAdapter {

    Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    int image[] = {
            R.drawable.search,
            R.drawable.customerc,
            R.drawable.location,
            R.drawable.explore,
    };
    int heading[] = {
            R.string.search,
            R.string.call,
            R.string.missing,
            R.string.start,

    };
    int description[] = {
            R.string.searchD,
            R.string.callD,
            R.string.missingD,
            R.string.explore,
    };
}
