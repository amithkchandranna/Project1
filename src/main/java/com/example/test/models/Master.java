package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Master implements Parcelable {

    @SerializedName("data")
    public final static Parcelable.Creator<Master> CREATOR = new Creator<Master>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Master createFromParcel(Parcel in) {
            return new Master(in);
        }

        public Master[] newArray(int size) {
            return (new Master[size]);
        }

    };
    @SerializedName("meta")
    @Expose
    private Meta meta;

    protected Master(Parcel in) {
        this.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
    }

    public Master() {
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(meta);
    }

    public int describeContents() {
        return 0;
    }

}
