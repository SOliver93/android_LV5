package com.example.arcus.android_lv5.models;

import android.support.annotation.NonNull;

import java.util.ArrayList;

public class Course {
    ArrayList<Instructor> instructors;
    String subtitle;
    String title;

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NonNull
    @Override
    public String toString()
    {
        return "\n" + "instruktori: " + instructors.toString() + "\n" + "naslov: " + title.toString();
    }
}

