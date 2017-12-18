package com.example.test.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grant implements Parcelable
{

    @SerializedName("inherited")
    @Expose
    private Boolean inherited;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    public final static Parcelable.Creator<Grant> CREATOR = new Creator<Grant>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Grant createFromParcel(Parcel in) {
            return new Grant(in);
        }

        public Grant[] newArray(int size) {
            return (new Grant[size]);
        }

    }
            ;

    protected Grant(Parcel in) {
        this.inherited = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.flags, (java.lang.String.class.getClassLoader()));
    }

    public Grant() {
    }

    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public void writeToParcel(Parcel dest, int flag) {
        dest.writeValue(inherited);
        dest.writeValue(type);
        dest.writeList(flags);
    }

    public int describeContents() {
        return 0;
    }

}
