package com.example.test.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonQuery implements Parcelable
{

    @SerializedName("order")
    @Expose
    private List<Order> order = null;
    public final static Parcelable.Creator<JsonQuery> CREATOR = new Creator<JsonQuery>() {


        @SuppressWarnings({
                "unchecked"
        })
        public JsonQuery createFromParcel(Parcel in) {
            return new JsonQuery(in);
        }

        public JsonQuery[] newArray(int size) {
            return (new JsonQuery[size]);
        }

    }
            ;

    protected JsonQuery(Parcel in) {
        in.readList(this.order, (com.example.test.models.Order.class.getClassLoader()));
    }

    public JsonQuery() {
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(order);
    }

    public int describeContents() {
        return 0;
    }

}
