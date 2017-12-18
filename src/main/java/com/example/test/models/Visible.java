package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Visible implements Parcelable {
    @SerializedName("table")
    @Expose
    private Boolean table;
    public final static Parcelable.Creator<Visible> CREATOR = new Creator<Visible>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Visible createFromParcel(Parcel in) {
            return new Visible(in);
        }

        public Visible[] newArray(int size) {
            return (new Visible[size]);
        }

    };

    protected Visible(Parcel in) {
        this.table = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Visible() {
    }

    public Boolean getTable() {
        return table;
    }

    public void setTable(Boolean table) {
        this.table = table;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(table);
    }

    public int describeContents() {
        return 0;
    }

}
