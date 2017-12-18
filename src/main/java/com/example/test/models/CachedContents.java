package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CachedContents implements Parcelable
{

    @SerializedName("largest")
    @Expose
    private String largest;
    @SerializedName("non_null")
    @Expose
    private Integer nonNull;
    @SerializedName("null")
    @Expose
    private Integer _null;
    @SerializedName("top")
    @Expose
    private List<Top> top = null;
    @SerializedName("smallest")
    @Expose
    private String smallest;
    @SerializedName("average")
    @Expose
    private String average;
    @SerializedName("sum")
    @Expose
    private String sum;
    public final static Parcelable.Creator<CachedContents> CREATOR = new Creator<CachedContents>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CachedContents createFromParcel(Parcel in) {
            return new CachedContents(in);
        }

        public CachedContents[] newArray(int size) {
            return (new CachedContents[size]);
        }

    }
            ;

    protected CachedContents(Parcel in) {
        this.largest = ((String) in.readValue((String.class.getClassLoader())));
        this.nonNull = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this._null = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.top, (com.example.test.models.Top.class.getClassLoader()));
        this.smallest = ((String) in.readValue((String.class.getClassLoader())));
        this.average = ((String) in.readValue((String.class.getClassLoader())));
        this.sum = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CachedContents() {
    }

    public String getLargest() {
        return largest;
    }

    public void setLargest(String largest) {
        this.largest = largest;
    }

    public Integer getNonNull() {
        return nonNull;
    }

    public void setNonNull(Integer nonNull) {
        this.nonNull = nonNull;
    }

    public Integer getNull() {
        return _null;
    }

    public void setNull(Integer _null) {
        this._null = _null;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

    public String getSmallest() {
        return smallest;
    }

    public void setSmallest(String smallest) {
        this.smallest = smallest;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(largest);
        dest.writeValue(nonNull);
        dest.writeValue(_null);
        dest.writeList(top);
        dest.writeValue(smallest);
        dest.writeValue(average);
        dest.writeValue(sum);
    }

    public int describeContents() {
        return 0;
    }

}
