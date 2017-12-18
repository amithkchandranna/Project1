package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class License implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("termsLink")
    @Expose
    private String termsLink;
    public final static Parcelable.Creator<License> CREATOR = new Creator<License>() {


        @SuppressWarnings({
                "unchecked"
        })
        public License createFromParcel(Parcel in) {
            return new License(in);
        }

        public License[] newArray(int size) {
            return (new License[size]);
        }

    }
            ;

    protected License(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.termsLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public License() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermsLink() {
        return termsLink;
    }

    public void setTermsLink(String termsLink) {
        this.termsLink = termsLink;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(termsLink);
    }

    public int describeContents() {
        return 0;
    }

}
