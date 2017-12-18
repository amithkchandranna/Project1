package com.example.test.api;

import com.example.test.models.Master;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ILocation {
    @GET("api/views/yitu-d5am/rows.json?accessType=DOWNLOAD")
    Call<Master> getLocationList();
}
