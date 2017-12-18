package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top implements Parcelable {

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("count")
    @Expose
    private Integer count;
    public final static Parcelable.Creator<Top> CREATOR = new Creator<Top>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Top createFromParcel(Parcel in) {
            return new Top(in);
        }

        public Top[] newArray(int size) {
            return (new Top[size]);
        }

    };

    protected Top(Parcel in) {
        this.item = ((String) in.readValue((String.class.getClassLoader())));
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Top() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(item);
        dest.writeValue(count);
    }

    public int describeContents() {
        return 0;
    }

}
