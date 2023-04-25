package com.example.agriculture_shopping_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

import com.example.agriculture_shopping_app.adapter.ProductAdapter;
import com.example.agriculture_shopping_app.adapter.ProductItemAdapter;
import com.example.agriculture_shopping_app.model.ProductCategory;
import com.example.agriculture_shopping_app.model.ProductItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtUserName;
    //
    ProductAdapter productAdapter;
    RecyclerView productCatRecycler;

    // productItem
    ProductItemAdapter productItemAdapter;
    RecyclerView productItemRecycler;

    //menu
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    CategoryFragment categoryFragment = new CategoryFragment();
    PostProductFragment postProductFragment = new PostProductFragment();
    NewsFragment newsFragment = new NewsFragment();
    SettingFragment settingFragment = new SettingFragment();

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = findViewById(R.id.tv_user);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("userLogin");
        String userName = bundle.getString("nameKey");
        txtUserName.setText("Hello, " + userName);

        //
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

       // getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, categoryFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                return false;
            }
        });

        // add data
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Most Popular"));
        productCategoryList.add(new ProductCategory(1, "All Products"));
        productCategoryList.add(new ProductCategory(1, "Fruits"));
        productCategoryList.add(new ProductCategory(1, "Vegetable"));
        productCategoryList.add(new ProductCategory(1, "Cabbage"));
        setProductCatRecycler(productCategoryList);

        // add product item
        List<ProductItem> productItemList = new ArrayList<>();
        productItemList.add(new ProductItem(1, "Dua Hau", "12", R.drawable.download, 100.000));
        productItemList.add(new ProductItem(2, "Cam", "30", R.drawable.cam, 10.000));
        productItemList.add(new ProductItem(3, "Thanh Long", "40", R.drawable.tl, 20.000));
        productItemList.add(new ProductItem(4, "Buoi", "70", R.drawable.buoi, 50.000));
        productItemList.add(new ProductItem(5, "XaLach", "50", R.drawable.salach, 10.000));
        productItemList.add(new ProductItem(6, "Ngo", "25", R.drawable.ngo, 40.000));

        setProductItemRecycler(productItemList);
    }
    //menu


//    MainActivity mainActivity = new MainActivity();
//    Catagory catagory = new Catagory();
//    PostProduct postProduct = new PostProduct();
//    News news =  new News();
//    Setting setting = new Setting();


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()){
//            case R.id.homeMenu:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .commit();
//                break;
//                return true;
//
//            case R.id.categoryMenu:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, categoryFragment)
//                        .commit();
//                return true;
//            case R.id.postMenu:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, postProductFragment)
//                        .commit();
//                return true;
//
//            case R.id.newsMenu:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, newsFragment)
//                        .commit();
//                return true;
//            case R.id.settingsMenu:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.flFragment, settingFragment)
//                        .commit();
//                return true;
//        }
//        return false;
//    }

    // code

    private void setProductCatRecycler(List<ProductCategory> productCategoryList){
        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productAdapter);
    }

    private void setProductItemRecycler(List<ProductItem> productItemList){
        productItemRecycler = findViewById(R.id.item_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        productItemRecycler.setLayoutManager(layoutManager);
        productItemAdapter = new ProductItemAdapter(this, productItemList);
        productItemRecycler.setAdapter(productItemAdapter);

    }



}