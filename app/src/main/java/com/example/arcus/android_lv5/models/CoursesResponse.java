package com.example.arcus.android_lv5.models;

import java.util.ArrayList;

public class CoursesResponse {
    ArrayList<Course> courses;
    //getteri i setteri = alt + insert i uzmemo što nam treba
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
