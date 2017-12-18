package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderBy implements Parcelable {

    @SerializedName("ascending")
    @Expose
    private Boolean ascending;
    @SerializedName("expression")
    @Expose
    private Expression expression;
    public final static Parcelable.Creator<OrderBy> CREATOR = new Creator<OrderBy>() {
        @SuppressWarnings({
                "unchecked"
        })
        public OrderBy createFromParcel(Parcel in) {
            return new OrderBy(in);
        }

        public OrderBy[] newArray(int size) {
            return (new OrderBy[size]);
        }

    }
            ;

    protected OrderBy(Parcel in) {
        this.ascending = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.expression = ((Expression) in.readValue((Expression.class.getClassLoader())));
    }

    public OrderBy() {
    }

    public Boolean getAscending() {
        return ascending;
    }

    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ascending);
        dest.writeValue(expression);
    }

    public int describeContents() {
        return 0;
    }

}
