package com.nyawira.cityguide.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nyawira.cityguide.R;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder> {

    ArrayList<CategoriesHelperClass> categoryLocations;

    public CategoriesAdapter(ArrayList<CategoriesHelperClass> categoryLocations) {
        this.categoryLocations = categoryLocations;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories, parent, false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.CategoryViewHolder holder, int position) {
        CategoriesHelperClass categoriesHelperClass = categoryLocations.get(position);

        holder.title.setText(categoriesHelperClass.getCategoryName());
        holder.image.setImageResource(categoriesHelperClass.getImage());

    }

    @Override
    public int getItemCount() {
        return categoryLocations.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.catTitle);
            image=itemView.findViewById(R.id.catImage);
        }
    }
}
