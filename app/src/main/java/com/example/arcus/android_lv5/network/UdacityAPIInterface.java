package com.example.arcus.android_lv5.network;

import com.example.arcus.android_lv5.models.CoursesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UdacityAPIInterface {
    /*-anotacija se uvijek odnosi na idući red i tu ne ide ; i mora uvijek biti iznad call-a
    * -skica svega što ja mogu raditi sa serverom*/
    @GET ("/public-api/v0/courses")
    //Call retrofit
    Call <CoursesResponse> getCourses();

}
