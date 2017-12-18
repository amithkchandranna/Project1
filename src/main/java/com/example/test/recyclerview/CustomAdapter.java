package com.example.test.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.recyclerview.R;
import com.example.test.models.Column;
import com.example.test.models.Master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    public static final String TITLE = "Title";
    public static final String RELEASE_YEAR = "Release Year";
    public static final String LOCATIONS = "Locations";
    private static final String TAG = CustomAdapter.class.getSimpleName();
    private Master mMaster;
    private List<Column> mTitle = new ArrayList<>();
    private List<Column> mReleaseYear = new ArrayList<>();
    private List<Column> mLocations = new ArrayList<>();

    private List<Details> mDetails = new ArrayList<>();

    private ITag mCaller;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param master the location data to populate views to be used by RecyclerView.
     */
    public CustomAdapter(ITag caller, Master master) {
        mCaller = caller;
        mMaster = master;

        if (mMaster != null && mMaster.getMeta() != null && mMaster.getMeta().getView() != null &&
                mMaster.getMeta().getView().getColumns() != null &&
                mMaster.getMeta().getView().getColumns().size() > 0) {

            for (Column column : mMaster.getMeta().getView().getColumns()) {
                if (column != null) {
                    switch (column.getName()) {
                        case TITLE:
                            mTitle.add(column);
                            break;
                        case RELEASE_YEAR:
                            mReleaseYear.add(column);
                            break;
                        case LOCATIONS:
                            mLocations.add(column);
                            break;
                    }
                }
            }

            if (mTitle != null && mTitle.get(0).getCachedContents() != null &&
                    mTitle.get(0).getCachedContents().getTop() != null &&
                    mReleaseYear.get(0) != null &&
                    mReleaseYear.get(0).getCachedContents() != null &&
                    mReleaseYear.get(0).getCachedContents().getTop() != null &&
                    mLocations.get(0) != null &&
                    mLocations.get(0).getCachedContents() != null &&
                    mLocations.get(0).getCachedContents().getTop() != null) {
                for (int index = 0; index < mTitle.get(0).getCachedContents().getTop().size(); index++) {
                    if (index < mTitle.get(0).getCachedContents().getTop().size() &&
                            index < mReleaseYear.get(0).getCachedContents().getTop().size() &&
                            index < mLocations.get(0).getCachedContents().getTop().size()) {
                        Details details = new Details(
                                mTitle.get(0).getCachedContents().getTop().get(index).getItem(),
                                mReleaseYear.get(0).getCachedContents().getTop().get(index).getItem(),
                                mLocations.get(0).getCachedContents().getTop().get(index).getItem());
                        mDetails.add(details);
                    }
                }
            }
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        try {
            /*
            master data -> "meta" -> "view" -> "columns" ->
                                                    "name": "Title"
                                                    "cachedContents" ->
                                                        "top" ->
                                                           "item": "Looking",
                                                           "count": 20

                                                    "name": "Release Year"
                                                    "cachedContents" ->
                                                         "top" ->
                                                            "item": "1978",
                                                            "count": 20

                                                    "name": "Locations"
                                                    "cachedContents" ->
                                                         "top" ->
                                                            "item": "Palace of Fine Arts (3301 Lyon Street)",
                                                            "count": 20

            */

            if (mDetails != null && position >= 0 && position < mDetails.size() && viewHolder != null) {
                viewHolder.getTitle().setText(mDetails.get(position).getTitle());
                viewHolder.getDate().setText(mDetails.get(position).getDate());
                viewHolder.getLocation().setText(mDetails.get(position).getLocation());

                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mCaller != null) {
                            mCaller.onItemClick(mDetails.get(position));
                        }
                    }
                });
            }

        } catch (Exception e) {
            Log.e(TAG, "error loading list", e);
        }
    }

    @Override
    public int getItemCount() {
        /* assuming all 3 populated lists have same size */
        return mDetails != null ? mDetails.size() : 0;
    }

    public void sortBy(String sortBy) {
        Collections.sort(mDetails, new CustomComparator(sortBy));
    }

    public interface ITag {
        public void onItemClick(Details details);
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final TextView date;
        private final TextView location;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's ViewData.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                }
            });

            title = v.findViewById(R.id.title);
            date = v.findViewById(R.id.date);
            location = v.findViewById(R.id.location);
        }

        public TextView getTitle() {
            return title;
        }

        public TextView getDate() {
            return date;
        }

        public TextView getLocation() {
            return location;
        }
    }

    public static class Details implements Parcelable {
        @SuppressWarnings("unused")
        public static final Parcelable.Creator<Details> CREATOR = new Parcelable.Creator<Details>() {
            @Override
            public Details createFromParcel(Parcel in) {
                return new Details(in);
            }

            @Override
            public Details[] newArray(int size) {
                return new Details[size];
            }
        };
        private final String mTitle;
        private final String mDate;
        private final String mLocation;

        public Details(String title, String date, String location) {
            mTitle = title;
            mDate = date;
            mLocation = location;
        }

        protected Details(Parcel in) {
            mTitle = in.readString();
            mDate = in.readString();
            mLocation = in.readString();
        }

        public String getTitle() {
            return mTitle;
        }

        public String getDate() {
            return mDate;
        }

        public String getLocation() {
            return mLocation;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(mTitle);
            dest.writeString(mDate);
            dest.writeString(mLocation);
        }
    }

    private static class CustomComparator implements Comparator<Details> {
        private String mSortBy;

        CustomComparator(String sortBy) {
            mSortBy = sortBy;
        }

        @Override
        public int compare(Details d1, Details d2) {
            switch (mSortBy) {
                case TITLE:
                    return d1.getTitle().compareTo(d2.getTitle());
                case RELEASE_YEAR:
                    return d1.getDate().compareTo(d2.getDate());
                case LOCATIONS:
                    return d1.getLocation().compareTo(d2.getLocation());
            }
            return 0;
        }
    }
}
