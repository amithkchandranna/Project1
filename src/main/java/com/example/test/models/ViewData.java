package com.example.test.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ViewData implements Parcelable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("attribution")
    @Expose
    private String attribution;
    @SerializedName("attributionLink")
    @Expose
    private String attributionLink;
    @SerializedName("averageRating")
    @Expose
    private Integer averageRating;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("createdAt")
    @Expose
    private Integer createdAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("displayType")
    @Expose
    private String displayType;
    @SerializedName("downloadCount")
    @Expose
    private Integer downloadCount;
    @SerializedName("hideFromCatalog")
    @Expose
    private Boolean hideFromCatalog;
    @SerializedName("hideFromDataJson")
    @Expose
    private Boolean hideFromDataJson;
    @SerializedName("indexUpdatedAt")
    @Expose
    private Integer indexUpdatedAt;
    @SerializedName("licenseId")
    @Expose
    private String licenseId;
    @SerializedName("newBackend")
    @Expose
    private Boolean newBackend;
    @SerializedName("numberOfComments")
    @Expose
    private Integer numberOfComments;
    @SerializedName("oid")
    @Expose
    private Integer oid;
    @SerializedName("provenance")
    @Expose
    private String provenance;
    @SerializedName("publicationAppendEnabled")
    @Expose
    private Boolean publicationAppendEnabled;
    @SerializedName("publicationDate")
    @Expose
    private Integer publicationDate;
    @SerializedName("publicationGroup")
    @Expose
    private Integer publicationGroup;
    @SerializedName("publicationStage")
    @Expose
    private String publicationStage;
    @SerializedName("rowsUpdatedAt")
    @Expose
    private Integer rowsUpdatedAt;
    @SerializedName("rowsUpdatedBy")
    @Expose
    private String rowsUpdatedBy;
    @SerializedName("tableId")
    @Expose
    private Integer tableId;
    @SerializedName("totalTimesRated")
    @Expose
    private Integer totalTimesRated;
    @SerializedName("viewCount")
    @Expose
    private Integer viewCount;
    @SerializedName("viewLastModified")
    @Expose
    private Integer viewLastModified;
    @SerializedName("viewType")
    @Expose
    private String viewType;
    @SerializedName("columns")
    @Expose
    private List<Column> columns = null;
    @SerializedName("grants")
    @Expose
    private List<Grant> grants = null;
    @SerializedName("license")
    @Expose
    private License license;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("rights")
    @Expose
    private List<String> rights = null;
    @SerializedName("tableAuthor")
    @Expose
    private TableAuthor tableAuthor;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("flags")
    @Expose
    private List<String> flags = null;
    public final static Parcelable.Creator<ViewData> CREATOR = new Creator<ViewData>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ViewData createFromParcel(Parcel in) {
            return new ViewData(in);
        }

        public ViewData[] newArray(int size) {
            return (new ViewData[size]);
        }

    }
            ;

    protected ViewData(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.attribution = ((String) in.readValue((String.class.getClassLoader())));
        this.attributionLink = ((String) in.readValue((String.class.getClassLoader())));
        this.averageRating = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.category = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.displayType = ((String) in.readValue((String.class.getClassLoader())));
        this.downloadCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.hideFromCatalog = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hideFromDataJson = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.indexUpdatedAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.licenseId = ((String) in.readValue((String.class.getClassLoader())));
        this.newBackend = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.numberOfComments = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.oid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.provenance = ((String) in.readValue((String.class.getClassLoader())));
        this.publicationAppendEnabled = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.publicationDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.publicationGroup = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.publicationStage = ((String) in.readValue((String.class.getClassLoader())));
        this.rowsUpdatedAt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rowsUpdatedBy = ((String) in.readValue((String.class.getClassLoader())));
        this.tableId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalTimesRated = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.viewCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.viewLastModified = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.viewType = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.columns, (com.example.test.models.Column.class.getClassLoader()));
        in.readList(this.grants, (com.example.test.models.Grant.class.getClassLoader()));
        this.license = ((License) in.readValue((License.class.getClassLoader())));
        this.metadata = ((Metadata) in.readValue((Metadata.class.getClassLoader())));
        this.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
        this.query = ((Query) in.readValue((Query.class.getClassLoader())));
        in.readList(this.rights, (java.lang.String.class.getClassLoader()));
        this.tableAuthor = ((TableAuthor) in.readValue((TableAuthor.class.getClassLoader())));
        in.readList(this.tags, (java.lang.String.class.getClassLoader()));
        in.readList(this.flags, (java.lang.String.class.getClassLoader()));
    }

    public ViewData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getAttributionLink() {
        return attributionLink;
    }

    public void setAttributionLink(String attributionLink) {
        this.attributionLink = attributionLink;
    }

    public Integer getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Boolean getHideFromCatalog() {
        return hideFromCatalog;
    }

    public void setHideFromCatalog(Boolean hideFromCatalog) {
        this.hideFromCatalog = hideFromCatalog;
    }

    public Boolean getHideFromDataJson() {
        return hideFromDataJson;
    }

    public void setHideFromDataJson(Boolean hideFromDataJson) {
        this.hideFromDataJson = hideFromDataJson;
    }

    public Integer getIndexUpdatedAt() {
        return indexUpdatedAt;
    }

    public void setIndexUpdatedAt(Integer indexUpdatedAt) {
        this.indexUpdatedAt = indexUpdatedAt;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Boolean getNewBackend() {
        return newBackend;
    }

    public void setNewBackend(Boolean newBackend) {
        this.newBackend = newBackend;
    }

    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(Integer numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public Boolean getPublicationAppendEnabled() {
        return publicationAppendEnabled;
    }

    public void setPublicationAppendEnabled(Boolean publicationAppendEnabled) {
        this.publicationAppendEnabled = publicationAppendEnabled;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getPublicationGroup() {
        return publicationGroup;
    }

    public void setPublicationGroup(Integer publicationGroup) {
        this.publicationGroup = publicationGroup;
    }

    public String getPublicationStage() {
        return publicationStage;
    }

    public void setPublicationStage(String publicationStage) {
        this.publicationStage = publicationStage;
    }

    public Integer getRowsUpdatedAt() {
        return rowsUpdatedAt;
    }

    public void setRowsUpdatedAt(Integer rowsUpdatedAt) {
        this.rowsUpdatedAt = rowsUpdatedAt;
    }

    public String getRowsUpdatedBy() {
        return rowsUpdatedBy;
    }

    public void setRowsUpdatedBy(String rowsUpdatedBy) {
        this.rowsUpdatedBy = rowsUpdatedBy;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getTotalTimesRated() {
        return totalTimesRated;
    }

    public void setTotalTimesRated(Integer totalTimesRated) {
        this.totalTimesRated = totalTimesRated;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getViewLastModified() {
        return viewLastModified;
    }

    public void setViewLastModified(Integer viewLastModified) {
        this.viewLastModified = viewLastModified;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Grant> getGrants() {
        return grants;
    }

    public void setGrants(List<Grant> grants) {
        this.grants = grants;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public List<String> getRights() {
        return rights;
    }

    public void setRights(List<String> rights) {
        this.rights = rights;
    }

    public TableAuthor getTableAuthor() {
        return tableAuthor;
    }

    public void setTableAuthor(TableAuthor tableAuthor) {
        this.tableAuthor = tableAuthor;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public void writeToParcel(Parcel dest, int flag) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(attribution);
        dest.writeValue(attributionLink);
        dest.writeValue(averageRating);
        dest.writeValue(category);
        dest.writeValue(createdAt);
        dest.writeValue(description);
        dest.writeValue(displayType);
        dest.writeValue(downloadCount);
        dest.writeValue(hideFromCatalog);
        dest.writeValue(hideFromDataJson);
        dest.writeValue(indexUpdatedAt);
        dest.writeValue(licenseId);
        dest.writeValue(newBackend);
        dest.writeValue(numberOfComments);
        dest.writeValue(oid);
        dest.writeValue(provenance);
        dest.writeValue(publicationAppendEnabled);
        dest.writeValue(publicationDate);
        dest.writeValue(publicationGroup);
        dest.writeValue(publicationStage);
        dest.writeValue(rowsUpdatedAt);
        dest.writeValue(rowsUpdatedBy);
        dest.writeValue(tableId);
        dest.writeValue(totalTimesRated);
        dest.writeValue(viewCount);
        dest.writeValue(viewLastModified);
        dest.writeValue(viewType);
        dest.writeList(columns);
        dest.writeList(grants);
        dest.writeValue(license);
        dest.writeValue(metadata);
        dest.writeValue(owner);
        dest.writeValue(query);
        dest.writeList(rights);
        dest.writeValue(tableAuthor);
        dest.writeList(tags);
        dest.writeList(flags);
    }

    public int describeContents() {
        return 0;
    }

}
