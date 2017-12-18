package com.example.test.recyclerview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.recyclerview.R;

public class MainActivity extends AppCompatActivity implements
        CustomAdapter.ITag, DetailsFragment.IDetail {

    public static final String TAG = MainActivity.class.getSimpleName();
    public static final String DETAILS_EXTRA = "DetailsExtra";
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            setDefaultFragment();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected: position = " + item.getOrder());
        if (currentFragment instanceof RecyclerViewFragment) {
            switch (item.getOrder()) {
                case 0:
                    setDefaultFragment();
                    break;
                case 1:
                    ((RecyclerViewFragment) currentFragment).sortBy(CustomAdapter.TITLE);
                    break;

                case 2:
                    ((RecyclerViewFragment) currentFragment).sortBy(CustomAdapter.RELEASE_YEAR);
                    break;

                case 3:
                    ((RecyclerViewFragment) currentFragment).sortBy(CustomAdapter.LOCATIONS);
                    break;
            }
        }
        return true;
    }

    @Override
    public void onItemClick(CustomAdapter.Details details) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        DetailsFragment df = new DetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(DETAILS_EXTRA, details);
        df.setArguments(bundle);
        transaction.replace(R.id.sample_content_fragment, df);
        transaction.commit();
    }

    private void setDefaultFragment() {
        if (currentFragment == null) {
            currentFragment = new RecyclerViewFragment();
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.sample_content_fragment, currentFragment);
        transaction.commit();
    }

    @Override
    public void onDetailsBackPressed() {
        setDefaultFragment();
    }
}
