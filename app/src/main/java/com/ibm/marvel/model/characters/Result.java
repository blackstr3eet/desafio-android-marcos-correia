package com.ibm.marvel.model.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({
    "description",
    "modified",
    "resourceURI",
    "comics",
    "series",
    "stories",
    "events",
    "urls"
})
@JsonPropertyOrder({
    "id",
    "name",
    "thumbnail"
})
public class Result {

    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;

    public Result() {

    }

    public Result(long id, String name, Thumbnail thumbnail) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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