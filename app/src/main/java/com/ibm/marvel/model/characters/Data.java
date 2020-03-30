package com.ibm.marvel.model.characters;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({
    "offset",
    "limit",
    "total",
    "count"
})
@JsonPropertyOrder({
    "results"
})
public class Data {

    @JsonProperty("results")
    private List<Result> results = null;

    public Data() {

    }

    public Data(List<Result> results) {
        super();
        this.results = results;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }
}