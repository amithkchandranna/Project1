package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Parcelable {

    @SerializedName("view")
    @Expose
    private ViewData view;
    public final static Parcelable.Creator<Meta> CREATOR = new Creator<Meta>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Meta createFromParcel(Parcel in) {
            return new Meta(in);
        }

        public Meta[] newArray(int size) {
            return (new Meta[size]);
        }

    }
            ;

    protected Meta(Parcel in) {
        this.view = ((ViewData) in.readValue((ViewData.class.getClassLoader())));
    }

    public Meta() {
    }

    public ViewData getView() {
        return view;
    }

    public void setView(ViewData view) {
        this.view = view;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(view);
    }

    public int describeContents() {
        return 0;
    }

}
