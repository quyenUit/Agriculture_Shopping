package com.example.agriculture_shopping_app.adapter;

import android.content.Context;
//import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agriculture_shopping_app.MainActivity;
import com.example.agriculture_shopping_app.ProductDetails;
import com.example.agriculture_shopping_app.R;
import com.example.agriculture_shopping_app.model.ProductCategory;
import com.example.agriculture_shopping_app.model.ProductItem;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<ProductCategory> productCategoryList;


    public ProductAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_row_item, parent, false);
        // tao recycleview row
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.categoryName.setText(productCategoryList.get(position).getProductName());

    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;

        public ProductViewHolder(@NonNull View itemView){
            super(itemView);
            categoryName = itemView.findViewById(R.id.cat_name);

        }
    }

}
