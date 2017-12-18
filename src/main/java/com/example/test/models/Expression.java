package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Expression implements Parcelable
{

    @SerializedName("columnId")
    @Expose
    private Integer columnId;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Parcelable.Creator<Expression> CREATOR = new Creator<Expression>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Expression createFromParcel(Parcel in) {
            return new Expression(in);
        }

        public Expression[] newArray(int size) {
            return (new Expression[size]);
        }

    }
            ;

    protected Expression(Parcel in) {
        this.columnId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Expression() {
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(columnId);
        dest.writeValue(type);
    }

    public int describeContents() {
        return 0;
    }

}
