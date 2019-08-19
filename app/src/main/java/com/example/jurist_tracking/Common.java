package com.example.jurist_tracking;

import com.example.jurist_tracking.Remote.IGoogleApi;
import com.example.jurist_tracking.Remote.RetrofitClient;

public class Common {
    public static final String baseURL="https://googleapis.com";
    public static IGoogleApi getGoogleApi(){
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
