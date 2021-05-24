package com.nyawira.cityguide.HelperClasses.HomeAdapter;

import android.widget.TextView;

public class CategoriesHelperClass {

    String categoryName;
    int image;

    public CategoriesHelperClass(String categoryName, int image) {
        this.categoryName = categoryName;
        this.image = image;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getImage() {
        return image;
    }
}
