
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items",
    "found",
    "pages",
    "per_page",
    "page",
    "clusters",
    "arguments",
    "alternate_url"
})
@Generated("jsonschema2pojo")
public class ObjectJson {

    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("found")
    private Long found;
    @JsonProperty("pages")
    private Long pages;
    @JsonProperty("per_page")
    private Long perPage;
    @JsonProperty("page")
    private Long page;
    @JsonProperty("clusters")
    private Object clusters;
    @JsonProperty("arguments")
    private Object arguments;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectJson() {
    }

    /**
     * 
     * @param found
     * @param pages
     * @param perPage
     * @param alternateUrl
     * @param arguments
     * @param page
     * @param items
     * @param clusters
     */
    public ObjectJson(List<Item> items, Long found, Long pages, Long perPage, Long page, Object clusters, Object arguments, String alternateUrl) {
        super();
        this.items = items;
        this.found = found;
        this.pages = pages;
        this.perPage = perPage;
        this.page = page;
        this.clusters = clusters;
        this.arguments = arguments;
        this.alternateUrl = alternateUrl;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ObjectJson withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("found")
    public Long getFound() {
        return found;
    }

    @JsonProperty("found")
    public void setFound(Long found) {
        this.found = found;
    }

    public ObjectJson withFound(Long found) {
        this.found = found;
        return this;
    }

    @JsonProperty("pages")
    public Long getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Long pages) {
        this.pages = pages;
    }

    public ObjectJson withPages(Long pages) {
        this.pages = pages;
        return this;
    }

    @JsonProperty("per_page")
    public Long getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Long perPage) {
        this.perPage = perPage;
    }

    public ObjectJson withPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    @JsonProperty("page")
    public Long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Long page) {
        this.page = page;
    }

    public ObjectJson withPage(Long page) {
        this.page = page;
        return this;
    }

    @JsonProperty("clusters")
    public Object getClusters() {
        return clusters;
    }

    @JsonProperty("clusters")
    public void setClusters(Object clusters) {
        this.clusters = clusters;
    }

    public ObjectJson withClusters(Object clusters) {
        this.clusters = clusters;
        return this;
    }

    @JsonProperty("arguments")
    public Object getArguments() {
        return arguments;
    }

    @JsonProperty("arguments")
    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    public ObjectJson withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    public ObjectJson withAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ObjectJson withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObjectJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("found");
        sb.append('=');
        sb.append(((this.found == null)?"<null>":this.found));
        sb.append(',');
        sb.append("pages");
        sb.append('=');
        sb.append(((this.pages == null)?"<null>":this.pages));
        sb.append(',');
        sb.append("perPage");
        sb.append('=');
        sb.append(((this.perPage == null)?"<null>":this.perPage));
        sb.append(',');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("clusters");
        sb.append('=');
        sb.append(((this.clusters == null)?"<null>":this.clusters));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
        sb.append(',');
        sb.append("alternateUrl");
        sb.append('=');
        sb.append(((this.alternateUrl == null)?"<null>":this.alternateUrl));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.found == null)? 0 :this.found.hashCode()));
        result = ((result* 31)+((this.pages == null)? 0 :this.pages.hashCode()));
        result = ((result* 31)+((this.perPage == null)? 0 :this.perPage.hashCode()));
        result = ((result* 31)+((this.alternateUrl == null)? 0 :this.alternateUrl.hashCode()));
        result = ((result* 31)+((this.arguments == null)? 0 :this.arguments.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        result = ((result* 31)+((this.clusters == null)? 0 :this.clusters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectJson) == false) {
            return false;
        }
        ObjectJson rhs = ((ObjectJson) other);
        return ((((((((((this.found == rhs.found)||((this.found!= null)&&this.found.equals(rhs.found)))&&((this.pages == rhs.pages)||((this.pages!= null)&&this.pages.equals(rhs.pages))))&&((this.perPage == rhs.perPage)||((this.perPage!= null)&&this.perPage.equals(rhs.perPage))))&&((this.alternateUrl == rhs.alternateUrl)||((this.alternateUrl!= null)&&this.alternateUrl.equals(rhs.alternateUrl))))&&((this.arguments == rhs.arguments)||((this.arguments!= null)&&this.arguments.equals(rhs.arguments))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))))&&((this.clusters == rhs.clusters)||((this.clusters!= null)&&this.clusters.equals(rhs.clusters))));
    }

}
