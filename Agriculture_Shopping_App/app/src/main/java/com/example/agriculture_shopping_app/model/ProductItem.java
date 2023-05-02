package com.example.agriculture_shopping_app.model;

public class ProductItem {

    Integer productItemId;
    String productItemName;
    String getProductIteQty;
    Integer getProductItemImage;
    String locationItem;
    String unitItem;

    double productItemPrice;

    public ProductItem(Integer productItemId, String productItemName, String getProductIteQty, Integer getProductItemImage, double productItemPrice, String locationItem, String unitItem) {
        this.productItemId = productItemId;
        this.productItemName = productItemName;
        this.getProductIteQty = getProductIteQty;
        this.getProductItemImage = getProductItemImage;
        this.productItemPrice = productItemPrice;
        this.locationItem = locationItem;
        this.unitItem = unitItem;
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

    public String getLocationItem() {
        return locationItem;
    }


    public void setLocationItem(String locationItem) {
        this.locationItem = locationItem;
    }

    public String getUnitItem() {
        return unitItem;
    }

    public void setUnitItem(String unitItem) {
        this.unitItem = unitItem;
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

    public double getProductItemPrice() {
        return (double) productItemPrice;
    }

    public void setProductItemPrice(double productItemPrice) {
        this.productItemPrice = productItemPrice;
    }

}
