package com.example.test.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query implements Parcelable {

    @SerializedName("orderBys")
    @Expose
    private List<OrderBy> orderBys = null;
    public final static Parcelable.Creator<Query> CREATOR = new Creator<Query>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Query createFromParcel(Parcel in) {
            return new Query(in);
        }

        public Query[] newArray(int size) {
            return (new Query[size]);
        }

    }
            ;

    protected Query(Parcel in) {
        in.readList(this.orderBys, (com.example.test.models.OrderBy.class.getClassLoader()));
    }

    public Query() {
    }

    public List<OrderBy> getOrderBys() {
        return orderBys;
    }

    public void setOrderBys(List<OrderBy> orderBys) {
        this.orderBys = orderBys;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(orderBys);
    }

    public int describeContents() {
        return 0;
    }

}
