package com.example.arcus.android_lv5.models;

import android.support.annotation.NonNull;

public class Instructor {
    String bio;
    String image;
    String name;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return  name + "\n";
    }
}
