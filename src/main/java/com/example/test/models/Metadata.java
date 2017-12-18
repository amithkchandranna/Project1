package com.example.test.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata implements Parcelable {

    @SerializedName("jsonQuery")
    @Expose
    private JsonQuery jsonQuery;
    @SerializedName("rdfSubject")
    @Expose
    private String rdfSubject;
    @SerializedName("custom_fields")
    @Expose
    private CustomFields customFields;
    @SerializedName("rowLabel")
    @Expose
    private String rowLabel;
    @SerializedName("availableDisplayTypes")
    @Expose
    private List<String> availableDisplayTypes = null;
    @SerializedName("renderTypeConfig")
    @Expose
    private RenderTypeConfig renderTypeConfig;
    public final static Parcelable.Creator<Metadata> CREATOR = new Creator<Metadata>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Metadata createFromParcel(Parcel in) {
            return new Metadata(in);
        }

        public Metadata[] newArray(int size) {
            return (new Metadata[size]);
        }

    }
            ;

    protected Metadata(Parcel in) {
        this.jsonQuery = ((JsonQuery) in.readValue((JsonQuery.class.getClassLoader())));
        this.rdfSubject = ((String) in.readValue((String.class.getClassLoader())));
        this.customFields = ((CustomFields) in.readValue((CustomFields.class.getClassLoader())));
        this.rowLabel = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.availableDisplayTypes, (java.lang.String.class.getClassLoader()));
        this.renderTypeConfig = ((RenderTypeConfig) in.readValue((RenderTypeConfig.class.getClassLoader())));
    }

    public Metadata() {
    }

    public JsonQuery getJsonQuery() {
        return jsonQuery;
    }

    public void setJsonQuery(JsonQuery jsonQuery) {
        this.jsonQuery = jsonQuery;
    }

    public String getRdfSubject() {
        return rdfSubject;
    }

    public void setRdfSubject(String rdfSubject) {
        this.rdfSubject = rdfSubject;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public String getRowLabel() {
        return rowLabel;
    }

    public void setRowLabel(String rowLabel) {
        this.rowLabel = rowLabel;
    }

    public List<String> getAvailableDisplayTypes() {
        return availableDisplayTypes;
    }

    public void setAvailableDisplayTypes(List<String> availableDisplayTypes) {
        this.availableDisplayTypes = availableDisplayTypes;
    }

    public RenderTypeConfig getRenderTypeConfig() {
        return renderTypeConfig;
    }

    public void setRenderTypeConfig(RenderTypeConfig renderTypeConfig) {
        this.renderTypeConfig = renderTypeConfig;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(jsonQuery);
        dest.writeValue(rdfSubject);
        dest.writeValue(customFields);
        dest.writeValue(rowLabel);
        dest.writeList(availableDisplayTypes);
        dest.writeValue(renderTypeConfig);
    }

    public int describeContents() {
        return 0;
    }

}
