package com.sandy.cosmossoft.data.model;

public class SliderItem {
    String images;
    String link;

    public SliderItem(String images2, String link2) {
        this.images = images2;
        this.link = link2;
    }

    public String getImages() {
        return this.images;
    }

    public void setImages(String images2) {
        this.images = images2;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link2) {
        this.link = link2;
    }

    public String toString() {
        return "SliderItem{images='" + this.images + '\'' + '}';
    }
}
