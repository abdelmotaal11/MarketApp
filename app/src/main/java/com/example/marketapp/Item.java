package com.example.marketapp;

//This Class acting as model class for the recyclerview
public class Item {
    int itemImg;
    String itemName, itemdDesc;

    public Item(int itemImg, String itemName, String itemdDesc) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemdDesc = itemdDesc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemdDesc() {
        return itemdDesc;
    }

    public void setItemdDesc(String itemdDesc) {
        this.itemdDesc = itemdDesc;
    }
}
