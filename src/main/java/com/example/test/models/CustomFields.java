package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomFields implements Parcelable
{

    @SerializedName("Department Metrics")
    @Expose
    private DepartmentMetrics departmentMetrics;
    @SerializedName("Detailed Descriptive")
    @Expose
    private DetailedDescriptive detailedDescriptive;
    @SerializedName("Publishing Details")
    @Expose
    private PublishingDetails publishingDetails;
    public final static Parcelable.Creator<CustomFields> CREATOR = new Creator<CustomFields>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CustomFields createFromParcel(Parcel in) {
            return new CustomFields(in);
        }

        public CustomFields[] newArray(int size) {
            return (new CustomFields[size]);
        }

    }
            ;

    protected CustomFields(Parcel in) {
        this.departmentMetrics = ((DepartmentMetrics) in.readValue((DepartmentMetrics.class.getClassLoader())));
        this.detailedDescriptive = ((DetailedDescriptive) in.readValue((DetailedDescriptive.class.getClassLoader())));
        this.publishingDetails = ((PublishingDetails) in.readValue((PublishingDetails.class.getClassLoader())));
    }

    public CustomFields() {
    }

    public DepartmentMetrics getDepartmentMetrics() {
        return departmentMetrics;
    }

    public void setDepartmentMetrics(DepartmentMetrics departmentMetrics) {
        this.departmentMetrics = departmentMetrics;
    }

    public DetailedDescriptive getDetailedDescriptive() {
        return detailedDescriptive;
    }

    public void setDetailedDescriptive(DetailedDescriptive detailedDescriptive) {
        this.detailedDescriptive = detailedDescriptive;
    }

    public PublishingDetails getPublishingDetails() {
        return publishingDetails;
    }

    public void setPublishingDetails(PublishingDetails publishingDetails) {
        this.publishingDetails = publishingDetails;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(departmentMetrics);
        dest.writeValue(detailedDescriptive);
        dest.writeValue(publishingDetails);
    }

    public int describeContents() {
        return 0;
    }

}
