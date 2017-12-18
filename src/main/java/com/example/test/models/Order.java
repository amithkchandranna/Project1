package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order implements Parcelable {
    @SerializedName("ascending")
    @Expose
    private Boolean ascending;
    @SerializedName("columnFieldName")
    @Expose
    private String columnFieldName;
    public final static Parcelable.Creator<Order> CREATOR = new Creator<Order>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Order createFromParcel(Parcel in) {
            return new Order(in);
        }

        public Order[] newArray(int size) {
            return (new Order[size]);
        }

    }
            ;

    protected Order(Parcel in) {
        this.ascending = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.columnFieldName = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Order() {
    }

    public Boolean getAscending() {
        return ascending;
    }

    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }

    public String getColumnFieldName() {
        return columnFieldName;
    }

    public void setColumnFieldName(String columnFieldName) {
        this.columnFieldName = columnFieldName;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ascending);
        dest.writeValue(columnFieldName);
    }

    public int describeContents() {
        return 0;
    }

}
