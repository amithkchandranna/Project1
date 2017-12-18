package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailedDescriptive implements Parcelable
{

    @SerializedName("Data notes")
    @Expose
    private String dataNotes;
    @SerializedName("Geographic unit")
    @Expose
    private String geographicUnit;
    public final static Parcelable.Creator<DetailedDescriptive> CREATOR = new Creator<DetailedDescriptive>() {


        @SuppressWarnings({
                "unchecked"
        })
        public DetailedDescriptive createFromParcel(Parcel in) {
            return new DetailedDescriptive(in);
        }

        public DetailedDescriptive[] newArray(int size) {
            return (new DetailedDescriptive[size]);
        }

    }
            ;

    protected DetailedDescriptive(Parcel in) {
        this.dataNotes = ((String) in.readValue((String.class.getClassLoader())));
        this.geographicUnit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public DetailedDescriptive() {
    }

    public String getDataNotes() {
        return dataNotes;
    }

    public void setDataNotes(String dataNotes) {
        this.dataNotes = dataNotes;
    }

    public String getGeographicUnit() {
        return geographicUnit;
    }

    public void setGeographicUnit(String geographicUnit) {
        this.geographicUnit = geographicUnit;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dataNotes);
        dest.writeValue(geographicUnit);
    }

    public int describeContents() {
        return 0;
    }

}
