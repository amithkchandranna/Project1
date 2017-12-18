package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublishingDetails implements Parcelable {

    @SerializedName("Data change frequency")
    @Expose
    private String dataChangeFrequency;
    @SerializedName("Publishing frequency")
    @Expose
    private String publishingFrequency;
    public final static Parcelable.Creator<PublishingDetails> CREATOR = new Creator<PublishingDetails>() {
        @SuppressWarnings({
                "unchecked"
        })
        public PublishingDetails createFromParcel(Parcel in) {
            return new PublishingDetails(in);
        }

        public PublishingDetails[] newArray(int size) {
            return (new PublishingDetails[size]);
        }

    }
            ;

    protected PublishingDetails(Parcel in) {
        this.dataChangeFrequency = ((String) in.readValue((String.class.getClassLoader())));
        this.publishingFrequency = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PublishingDetails() {
    }

    public String getDataChangeFrequency() {
        return dataChangeFrequency;
    }

    public void setDataChangeFrequency(String dataChangeFrequency) {
        this.dataChangeFrequency = dataChangeFrequency;
    }

    public String getPublishingFrequency() {
        return publishingFrequency;
    }

    public void setPublishingFrequency(String publishingFrequency) {
        this.publishingFrequency = publishingFrequency;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dataChangeFrequency);
        dest.writeValue(publishingFrequency);
    }

    public int describeContents() {
        return 0;
    }

}
