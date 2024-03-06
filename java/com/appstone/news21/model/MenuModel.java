package com.appstone.news21.model;

public class MenuModel {
    private String category;
    private int icons;

    public MenuModel(String category, int icons) {
        this.category = category;
        this.icons = icons;
    }

//    public MenuModel() {
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIcons() {
        return icons;
    }

    public void setIcons(int icons) {
        this.icons = icons;
    }
}
