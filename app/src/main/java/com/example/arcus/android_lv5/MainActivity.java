package com.example.arcus.android_lv5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.arcus.android_lv5.models.CoursesResponse;
import com.example.arcus.android_lv5.network.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback <CoursesResponse> {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvView);
        //poziv
        Call <CoursesResponse> callResp  = RetrofitManager.getInstance().getService().getCourses();
        callResp.enqueue(MainActivity.this);
    }

    @Override
    public void onResponse(@NonNull Call<CoursesResponse> call, @NonNull Response<CoursesResponse> response)
    {
        String text;
        if(response.isSuccessful() && response.body() != null)
            {
                text = response.body().getCourses().toString();
            }
        else
            {
                text = "Error! 404 Error!";
            }
            setText(text);
    }

    @Override
    public void onFailure(@NonNull Call<CoursesResponse> call, @NonNull Throwable t)
    {
        setText("Došlo je do pogreške" + t.getMessage());

    }
    void setText(String text)
    {
        textView.setText(text);
    }
}
