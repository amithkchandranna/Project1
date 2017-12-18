package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Format implements Parcelable
{

    @SerializedName("align")
    @Expose
    private String align;
    @SerializedName("precisionStyle")
    @Expose
    private String precisionStyle;
    @SerializedName("noCommas")
    @Expose
    private String noCommas;
    public final static Parcelable.Creator<Format> CREATOR = new Creator<Format>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Format createFromParcel(Parcel in) {
            return new Format(in);
        }

        public Format[] newArray(int size) {
            return (new Format[size]);
        }

    }
            ;

    protected Format(Parcel in) {
        this.align = ((String) in.readValue((String.class.getClassLoader())));
        this.precisionStyle = ((String) in.readValue((String.class.getClassLoader())));
        this.noCommas = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Format() {
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getPrecisionStyle() {
        return precisionStyle;
    }

    public void setPrecisionStyle(String precisionStyle) {
        this.precisionStyle = precisionStyle;
    }

    public String getNoCommas() {
        return noCommas;
    }

    public void setNoCommas(String noCommas) {
        this.noCommas = noCommas;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(align);
        dest.writeValue(precisionStyle);
        dest.writeValue(noCommas);
    }

    public int describeContents() {
        return 0;
    }

}
