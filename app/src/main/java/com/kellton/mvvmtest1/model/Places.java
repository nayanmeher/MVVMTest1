package com.kellton.mvvmtest1.model;

public class Places {
    private String placeName;
    private String imageUrl;

    public Places(String placeName, String imageUrl) {
        this.placeName = placeName;
        this.imageUrl = imageUrl;
    }

    public Places() {
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
