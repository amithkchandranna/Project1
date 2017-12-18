package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DepartmentMetrics implements Parcelable
{

    @SerializedName("Publishing Department")
    @Expose
    private String publishingDepartment;
    public final static Parcelable.Creator<DepartmentMetrics> CREATOR = new Creator<DepartmentMetrics>() {


        @SuppressWarnings({
                "unchecked"
        })
        public DepartmentMetrics createFromParcel(Parcel in) {
            return new DepartmentMetrics(in);
        }

        public DepartmentMetrics[] newArray(int size) {
            return (new DepartmentMetrics[size]);
        }

    }
            ;

    protected DepartmentMetrics(Parcel in) {
        this.publishingDepartment = ((String) in.readValue((String.class.getClassLoader())));
    }

    public DepartmentMetrics() {
    }

    public String getPublishingDepartment() {
        return publishingDepartment;
    }

    public void setPublishingDepartment(String publishingDepartment) {
        this.publishingDepartment = publishingDepartment;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(publishingDepartment);
    }

    public int describeContents() {
        return 0;
    }

}
