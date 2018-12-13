package com.example.arcus.android_lv5.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*singleton:
* -privatni konstruktor
* -statična istanca kako bi drugi mogli pristupiti podatcima*/
public class RetrofitManager
{
    private static RetrofitManager instance;
    private UdacityAPIInterface service;
    private RetrofitManager()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.udacity.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       service = retrofit.create(UdacityAPIInterface.class);
    }
    public static RetrofitManager getInstance()
    {
        //ako nemamo instancu da se napravi
        if(instance  == null)
        {
            instance = new RetrofitManager();
        }
        return instance;
    }

    public UdacityAPIInterface getService() {
        return service;
    }
}
