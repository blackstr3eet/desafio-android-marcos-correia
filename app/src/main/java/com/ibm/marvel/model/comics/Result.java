
package com.ibm.marvel.model.comics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "digitalId",
    "title",
    "issueNumber",
    "variantDescription",
    "description",
    "modified",
    "isbn",
    "upc",
    "diamondCode",
    "ean",
    "issn",
    "format",
    "pageCount",
    "textObjects",
    "resourceURI",
    "urls",
    "series",
    "variants",
    "collections",
    "collectedIssues",
    "dates",
    "prices",
    "thumbnail",
    "images",
    "creators",
    "characters",
    "stories",
    "events"
})
public class Result {

    @JsonProperty("id")
    private long id;
    @JsonProperty("digitalId")
    private long digitalId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("issueNumber")
    private long issueNumber;
    @JsonProperty("variantDescription")
    private String variantDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("diamondCode")
    private String diamondCode;
    @JsonProperty("ean")
    private String ean;
    @JsonProperty("issn")
    private String issn;
    @JsonProperty("format")
    private String format;
    @JsonProperty("pageCount")
    private long pageCount;
    @JsonProperty("textObjects")
    private List<TextObject> textObjects = null;
    @JsonProperty("resourceURI")
    private String resourceURI;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonProperty("series")
    private Series series;
    @JsonProperty("variants")
    private List<Object> variants = null;
    @JsonProperty("collections")
    private List<Object> collections = null;
    @JsonProperty("collectedIssues")
    private List<Object> collectedIssues = null;
    @JsonProperty("dates")
    private List<Date> dates = null;
    @JsonProperty("prices")
    private List<Price> prices = null;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("creators")
    private Creators creators;
    @JsonProperty("characters")
    private Characters characters;
    @JsonProperty("stories")
    private Stories stories;
    @JsonProperty("events")
    private Events events;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param creators
     * @param issueNumber
     * @param isbn
     * @param description
     * @param variants
     * @param title
     * @param diamondCode
     * @param characters
     * @param urls
     * @param ean
     * @param collections
     * @param modified
     * @param id
     * @param prices
     * @param events
     * @param collectedIssues
     * @param pageCount
     * @param thumbnail
     * @param images
     * @param stories
     * @param textObjects
     * @param digitalId
     * @param format
     * @param upc
     * @param dates
     * @param resourceURI
     * @param variantDescription
     * @param issn
     * @param series
     */
    public Result(long id, long digitalId, String title, long issueNumber, String variantDescription, String description, String modified, String isbn, String upc, String diamondCode, String ean, String issn, String format, long pageCount, List<TextObject> textObjects, String resourceURI, List<Url> urls, Series series, List<Object> variants, List<Object> collections, List<Object> collectedIssues, List<Date> dates, List<Price> prices, Thumbnail thumbnail, List<Image> images, Creators creators, Characters characters, Stories stories, Events events) {
        super();
        this.id = id;
        this.digitalId = digitalId;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.modified = modified;
        this.isbn = isbn;
        this.upc = upc;
        this.diamondCode = diamondCode;
        this.ean = ean;
        this.issn = issn;
        this.format = format;
        this.pageCount = pageCount;
        this.textObjects = textObjects;
        this.resourceURI = resourceURI;
        this.urls = urls;
        this.series = series;
        this.variants = variants;
        this.collections = collections;
        this.collectedIssues = collectedIssues;
        this.dates = dates;
        this.prices = prices;
        this.thumbnail = thumbnail;
        this.images = images;
        this.creators = creators;
        this.characters = characters;
        this.stories = stories;
        this.events = events;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("digitalId")
    public long getDigitalId() {
        return digitalId;
    }

    @JsonProperty("digitalId")
    public void setDigitalId(long digitalId) {
        this.digitalId = digitalId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("issueNumber")
    public long getIssueNumber() {
        return issueNumber;
    }

    @JsonProperty("issueNumber")
    public void setIssueNumber(long issueNumber) {
        this.issueNumber = issueNumber;
    }

    @JsonProperty("variantDescription")
    public String getVariantDescription() {
        return variantDescription;
    }

    @JsonProperty("variantDescription")
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("diamondCode")
    public String getDiamondCode() {
        return diamondCode;
    }

    @JsonProperty("diamondCode")
    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    @JsonProperty("ean")
    public String getEan() {
        return ean;
    }

    @JsonProperty("ean")
    public void setEan(String ean) {
        this.ean = ean;
    }

    @JsonProperty("issn")
    public String getIssn() {
        return issn;
    }

    @JsonProperty("issn")
    public void setIssn(String issn) {
        this.issn = issn;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("pageCount")
    public long getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("textObjects")
    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    @JsonProperty("textObjects")
    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }

    @JsonProperty("resourceURI")
    public String getResourceURI() {
        return resourceURI;
    }

    @JsonProperty("resourceURI")
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    @JsonProperty("series")
    public Series getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(Series series) {
        this.series = series;
    }

    @JsonProperty("variants")
    public List<Object> getVariants() {
        return variants;
    }

    @JsonProperty("variants")
    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }

    @JsonProperty("collections")
    public List<Object> getCollections() {
        return collections;
    }

    @JsonProperty("collections")
    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    @JsonProperty("collectedIssues")
    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    @JsonProperty("collectedIssues")
    public void setCollectedIssues(List<Object> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    @JsonProperty("dates")
    public List<Date> getDates() {
        return dates;
    }

    @JsonProperty("dates")
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @JsonProperty("thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("creators")
    public Creators getCreators() {
        return creators;
    }

    @JsonProperty("creators")
    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    @JsonProperty("characters")
    public Characters getCharacters() {
        return characters;
    }

    @JsonProperty("characters")
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @JsonProperty("stories")
    public Stories getStories() {
        return stories;
    }

    @JsonProperty("stories")
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    @JsonProperty("events")
    public Events getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(Events events) {
        this.events = events;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
