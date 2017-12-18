package com.example.test.recyclerview;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.recyclerview.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import static com.example.test.recyclerview.MainActivity.DETAILS_EXTRA;

public class DetailsFragment extends Fragment implements OnMapReadyCallback {
    private static final String TAG = DetailsFragment.class.getSimpleName();

    private CustomAdapter.Details mDetails;
    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            mDetails = bundle.getParcelable(DETAILS_EXTRA);
        }

        View rootView = inflater.inflate(R.layout.details_layout, container, false);

        if (mDetails != null) {
            TextView title = rootView.findViewById(R.id.title);
            TextView rating = rootView.findViewById(R.id.date);
            TextView location = rootView.findViewById(R.id.location);

            title.setText(mDetails.getTitle());
            title.setMaxLines(2);
            rating.setText(mDetails.getDate());
            rating.setMaxLines(2);
            location.setText(mDetails.getLocation());
            location.setMaxLines(2);

            SupportMapFragment mapFragment =
                    (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

        mToolbar = rootView.findViewById(R.id.toolbar);
        if (getActivity() instanceof AppCompatActivity) {
            AppCompatActivity activity = ((AppCompatActivity) getActivity());
            activity.setSupportActionBar(mToolbar);
            activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            if (mDetails != null && mDetails.getTitle() != null) {
                activity.getSupportActionBar().setTitle(mDetails.getTitle());
            }
        }

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        menu.clear();

        if (getActivity() instanceof AppCompatActivity) {
            ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
                actionBar.setHomeButtonEnabled(true);
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (getActivity() instanceof IDetail) {
                    ((IDetail) getActivity()).onDetailsBackPressed();
                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Log.d(TAG, "onMapReady");

        try {
            String address = mDetails.getLocation() + ", San Francisco, California";
            LatLng latLong = getLocationFromAddress(getContext(), address);
            if (latLong != null) {
                googleMap.addMarker(new MarkerOptions().position(latLong).title(address));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLong, 15));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
            }
        } catch (Exception e) {
            Log.d(TAG, "onMapReady error", e);
        }
    }

    @Nullable
    public LatLng getLocationFromAddress(Context context, String strAddress) {
        if (!Geocoder.isPresent()) {
            Log.d(TAG, "Geocoder not present");
            return null;
        }

        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {

            address = coder.getFromLocationName(strAddress, 1);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            Log.d(TAG, "address: " + address.get(0).toString());
            p1 = new LatLng(location.getLatitude(), location.getLongitude());
        } catch (Exception e) {
            Log.e(TAG, "error getting lat long for the address", e);
        }
        return p1;
    }

    public interface IDetail {
        public void onDetailsBackPressed();
    }
}
