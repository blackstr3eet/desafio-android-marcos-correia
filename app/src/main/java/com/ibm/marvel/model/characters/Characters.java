package com.ibm.marvel.model.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({
    "code",
    "status",
    "copyright",
    "attributionText",
    "attributionHTML",
    "etag",
})
@JsonPropertyOrder({
    "data"
})
public class Characters {

    @JsonProperty("data")
    private Data data;

    public Characters() {

    }

    public Characters(Data data) {
        super();
        this.data = data;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }
}