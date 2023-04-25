package com.example.agriculture_shopping_app.model;

public class ProductItem {

    Integer productItemId;
    String productItemName;
    String getProductIteQty;
    Integer getProductItemImage;
    double productItemPrice;

    public ProductItem(Integer productItemId, String productItemName, String getProductIteQty, Integer getProductItemImage, double productItemPrice) {
        this.productItemId = productItemId;
        this.productItemName = productItemName;
        this.getProductIteQty = getProductIteQty;
        this.getProductItemImage = getProductItemImage;
        this.productItemPrice = productItemPrice;
    }

    public Integer getProductItemId() {
        return productItemId;
    }

    public void setProductItemId(Integer productItemId) {
        this.productItemId = productItemId;
    }

    public String getProductItemName() {
        return productItemName;
    }

    public void setProductItemName(String productItemName) {
        this.productItemName = productItemName;
    }

    public String getGetProductIteQty() {
        return getProductIteQty;
    }

    public void setGetProductIteQty(String getProductIteQty) {
        this.getProductIteQty = getProductIteQty;
    }

    public int getGetProductItemImage() {
        return getProductItemImage;
    }

    public void setGetProductItemImage(Integer getProductItemImage) {
        this.getProductItemImage = getProductItemImage;
    }

    public int getProductItemPrice() {
        return (int) productItemPrice;
    }

    public void setProductItemPrice(Float productItemPrice) {
        this.productItemPrice = productItemPrice;
    }
}
