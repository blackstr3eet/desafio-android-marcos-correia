package com.ibm.marvel.model.characters;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path",
    "extension"
})
public class Thumbnail {

    @JsonProperty("path")
    private String path;
    @JsonProperty("extension")
    private String extension;

    public Thumbnail() {

    }

    public Thumbnail(String path, String extension) {
        super();
        this.path = path;
        this.extension = extension;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }
}