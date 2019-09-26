package com.kellton.mvvmtest1.model;

public class places {
    private String placeName;
    private String imageUrl;

    public places(String placeName, String imageUrl) {
        this.placeName = placeName;
        this.imageUrl = imageUrl;
    }

    public places() {
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
