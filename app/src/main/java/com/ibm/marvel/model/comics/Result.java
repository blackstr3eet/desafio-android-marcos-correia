package com.ibm.marvel.model.comics;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({
    "id",
    "digitalId",
    "issueNumber",
    "variantDescription",
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
    "images",
    "creators",
    "characters",
    "stories",
    "events"
})
@JsonPropertyOrder({
    "title",
    "description",
    "prices",
    "thumbnail",
})
public class Result {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("prices")
    private List<Price> prices = null;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;

    public Result() {

    }

    public Result(String title, String description, List<Price> prices, Thumbnail thumbnail) {
        super();
        this.title = title;
        this.description = description;
        this.prices = prices;
        this.thumbnail = thumbnail;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
}