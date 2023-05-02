package com.example.agriculture_shopping_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agriculture_shopping_app.ProductDetails;
import com.example.agriculture_shopping_app.R;
import com.example.agriculture_shopping_app.model.ProductItem;

import java.util.List;

public class ProductItemAdapter extends RecyclerView.Adapter<ProductItemAdapter.ProductViewHolder> {
    Context context;
    List<ProductItem> productItemList;

    public ProductItemAdapter(Context context, List<ProductItem> productItemList) {
        this.context = context;
        this.productItemList = productItemList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        // tao recycleview row
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productItemImg.setImageResource(productItemList.get(position).getGetProductItemImage());
        holder.productItemName.setText(productItemList.get(position).getProductItemName());
//        holder.productItemPrice.setText(productItemList.get(position).getProductItemPrice());
        holder.productItemQty.setText(productItemList.get(position).getGetProductIteQty());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProductDetails.class);
                Bundle itemData = new Bundle();
                itemData.putInt("Image", productItemList.get(position).getGetProductItemImage());
                itemData.putString("Name", productItemList.get(position).getProductItemName());
                itemData.putDouble("Price", productItemList.get(position).getProductItemPrice());
                i.putExtras(itemData);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productItemList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView productItemName, productItemPrice, productItemQty;
        ImageView productItemImg;
        public  ProductViewHolder(@NonNull View itemView){
            super(itemView);
            productItemImg = itemView.findViewById(R.id.productItemImg);
            productItemName = itemView.findViewById(R.id.productItemName);
//            productItemPrice = itemView.findViewById(R.id.tv_price);
            productItemQty = itemView.findViewById(R.id.tv_qty);
        }
    }
}
