package com.example.android183.ui.dashboard;

public class Modeldash {
    private String title;
    private String description;
    private int img;
    private int imgLiked;

    public Modeldash(String title, String description, int img, int imgLiked) {
        this.title = title;
        this.description = description;
        this.img = img;
        this.imgLiked = imgLiked;
    }

    public int getImgLiked() {
        return imgLiked;
    }

    public void setImgLiked(int imgLiked) {
        this.imgLiked = imgLiked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
