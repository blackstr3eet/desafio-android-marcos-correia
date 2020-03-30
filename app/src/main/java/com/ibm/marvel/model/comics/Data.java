
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
    "offset",
    "limit",
    "total",
    "count",
    "results"
})
public class Data {

    @JsonProperty("offset")
    private long offset;
    @JsonProperty("limit")
    private long limit;
    @JsonProperty("total")
    private long total;
    @JsonProperty("count")
    private long count;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param total
     * @param offset
     * @param limit
     * @param count
     * @param results
     */
    public Data(long offset, long limit, long total, long count, List<Result> results) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    @JsonProperty("offset")
    public long getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(long offset) {
        this.offset = offset;
    }

    @JsonProperty("limit")
    public long getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(long limit) {
        this.limit = limit;
    }

    @JsonProperty("total")
    public long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(long total) {
        this.total = total;
    }

    @JsonProperty("count")
    public long getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(long count) {
        this.count = count;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
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
