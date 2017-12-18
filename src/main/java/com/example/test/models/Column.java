package com.example.test.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Column implements Parcelable {

    public final static Parcelable.Creator<Column> CREATOR = new Creator<Column>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Column createFromParcel(Parcel in) {
            return new Column(in);
        }

        public Column[] newArray(int size) {
            return (new Column[size]);
        }

    };
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dataTypeName")
    @Expose
    private String dataTypeName;
    @SerializedName("fieldName")
    @Expose
    private String fieldName;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("renderTypeName")
    @Expose
    private String renderTypeName;
    @SerializedName("format")
    @Expose
    private Format format;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    @SerializedName("tableColumnId")
    @Expose
    private Integer tableColumnId;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("cachedContents")
    @Expose
    private CachedContents cachedContents;

    protected Column(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.dataTypeName = ((String) in.readValue((String.class.getClassLoader())));
        this.fieldName = ((String) in.readValue((String.class.getClassLoader())));
        this.position = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.renderTypeName = ((String) in.readValue((String.class.getClassLoader())));
        this.format = ((Format) in.readValue((Format.class.getClassLoader())));
        in.readList(this.flags, (java.lang.String.class.getClassLoader()));
        this.tableColumnId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.cachedContents = ((CachedContents) in.readValue((CachedContents.class.getClassLoader())));
    }

    public Column() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getRenderTypeName() {
        return renderTypeName;
    }

    public void setRenderTypeName(String renderTypeName) {
        this.renderTypeName = renderTypeName;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public Integer getTableColumnId() {
        return tableColumnId;
    }

    public void setTableColumnId(Integer tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public CachedContents getCachedContents() {
        return cachedContents;
    }

    public void setCachedContents(CachedContents cachedContents) {
        this.cachedContents = cachedContents;
    }

    public void writeToParcel(Parcel dest, int flag) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(dataTypeName);
        dest.writeValue(fieldName);
        dest.writeValue(position);
        dest.writeValue(renderTypeName);
        dest.writeValue(format);
        dest.writeList(flags);
        dest.writeValue(tableColumnId);
        dest.writeValue(width);
        dest.writeValue(cachedContents);
    }

    public int describeContents() {
        return 0;
    }

}
