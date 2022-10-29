package com.sandy.cosmossoft.data.model;

public class ProfileListModel {
    Integer icon;
    String title;

    public ProfileListModel(Integer icon2, String title2) {
        this.icon = icon2;
        this.title = title2;
    }

    public Integer getIcon() {
        return this.icon;
    }

    public void setIcon(Integer icon2) {
        this.icon = icon2;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }
}
