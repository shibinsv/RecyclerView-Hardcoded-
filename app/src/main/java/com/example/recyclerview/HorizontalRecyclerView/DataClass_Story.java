package com.example.recyclerview.HorizontalRecyclerView;

public class DataClass_Story {

    private String name;
    private int imageURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }

    public DataClass_Story(String name, int imageURL) {
        this.name = name;
        this.imageURL = imageURL;

    }
}
