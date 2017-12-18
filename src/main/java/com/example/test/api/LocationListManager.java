package com.example.test.api;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.example.test.models.Master;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.test.recyclerview.RecyclerViewFragment.LOCATION_LIST;
import static com.example.test.recyclerview.RecyclerViewFragment.LOCATION_FILTER;

public class LocationListManager extends RestBase {
    public static final String TAG = LocationListManager.class.getSimpleName();
    private Context mContext;

    private LocationListManager(Context context) {
        mContext = context;
    }

    public static LocationListManager getInstance(Context context) {
        return new LocationListManager(context);
    }

    public void getLocationList() {
        Call<Master> call = getInstance().create(ILocation.class).getLocationList();
        call.enqueue(new Callback<Master>() {
            @Override
            public void onResponse(Call<Master> call, Response<Master> response) {
                Log.d(TAG, "onResponse: " + call);
                if (response.isSuccessful()) {
                    Intent intent = new Intent(LOCATION_FILTER);
                    intent.putExtra(LOCATION_LIST, response.body());
                    LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
                }
            }

            @Override
            public void onFailure(Call<Master> call, Throwable throwable) {
                Log.d(TAG, "onFailure: " + call, throwable);
            }
        });
    }
}
