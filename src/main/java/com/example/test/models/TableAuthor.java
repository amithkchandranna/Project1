package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableAuthor implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("profileImageUrlLarge")
    @Expose
    private String profileImageUrlLarge;
    @SerializedName("profileImageUrlMedium")
    @Expose
    private String profileImageUrlMedium;
    @SerializedName("profileImageUrlSmall")
    @Expose
    private String profileImageUrlSmall;
    @SerializedName("screenName")
    @Expose
    private String screenName;
    public final static Parcelable.Creator<TableAuthor> CREATOR = new Creator<TableAuthor>() {
        @SuppressWarnings({
                "unchecked"
        })
        public TableAuthor createFromParcel(Parcel in) {
            return new TableAuthor(in);
        }

        public TableAuthor[] newArray(int size) {
            return (new TableAuthor[size]);
        }

    };

    protected TableAuthor(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.profileImageUrlLarge = ((String) in.readValue((String.class.getClassLoader())));
        this.profileImageUrlMedium = ((String) in.readValue((String.class.getClassLoader())));
        this.profileImageUrlSmall = ((String) in.readValue((String.class.getClassLoader())));
        this.screenName = ((String) in.readValue((String.class.getClassLoader())));
    }

    public TableAuthor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProfileImageUrlLarge() {
        return profileImageUrlLarge;
    }

    public void setProfileImageUrlLarge(String profileImageUrlLarge) {
        this.profileImageUrlLarge = profileImageUrlLarge;
    }

    public String getProfileImageUrlMedium() {
        return profileImageUrlMedium;
    }

    public void setProfileImageUrlMedium(String profileImageUrlMedium) {
        this.profileImageUrlMedium = profileImageUrlMedium;
    }

    public String getProfileImageUrlSmall() {
        return profileImageUrlSmall;
    }

    public void setProfileImageUrlSmall(String profileImageUrlSmall) {
        this.profileImageUrlSmall = profileImageUrlSmall;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(displayName);
        dest.writeValue(profileImageUrlLarge);
        dest.writeValue(profileImageUrlMedium);
        dest.writeValue(profileImageUrlSmall);
        dest.writeValue(screenName);
    }

    public int describeContents() {
        return 0;
    }

}
