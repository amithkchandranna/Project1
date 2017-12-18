package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RenderTypeConfig implements Parcelable {

    @SerializedName("visible")
    @Expose
    private Visible visible;
    public final static Parcelable.Creator<RenderTypeConfig> CREATOR = new Creator<RenderTypeConfig>() {
        @SuppressWarnings({
                "unchecked"
        })
        public RenderTypeConfig createFromParcel(Parcel in) {
            return new RenderTypeConfig(in);
        }

        public RenderTypeConfig[] newArray(int size) {
            return (new RenderTypeConfig[size]);
        }

    }
            ;

    protected RenderTypeConfig(Parcel in) {
        this.visible = ((Visible) in.readValue((Visible.class.getClassLoader())));
    }

    public RenderTypeConfig() {
    }

    public Visible getVisible() {
        return visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(visible);
    }

    public int describeContents() {
        return 0;
    }

}
