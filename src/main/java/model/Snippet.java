
package model;

import java.util.HashMap;
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
    "requirement",
    "responsibility"
})
@Generated("jsonschema2pojo")
public class Snippet {

    @JsonProperty("requirement")
    private String requirement;
    @JsonProperty("responsibility")
    private String responsibility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snippet() {
    }

    /**
     * 
     * @param responsibility
     * @param requirement
     */
    public Snippet(String requirement, String responsibility) {
        super();
        this.requirement = requirement;
        this.responsibility = responsibility;
    }

    @JsonProperty("requirement")
    public String getRequirement() {
        return requirement;
    }

    @JsonProperty("requirement")
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Snippet withRequirement(String requirement) {
        this.requirement = requirement;
        return this;
    }

    @JsonProperty("responsibility")
    public String getResponsibility() {
        return responsibility;
    }

    @JsonProperty("responsibility")
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public Snippet withResponsibility(String responsibility) {
        this.responsibility = responsibility;
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

    public Snippet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Snippet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requirement");
        sb.append('=');
        sb.append(((this.requirement == null)?"<null>":this.requirement));
        sb.append(',');
        sb.append("responsibility");
        sb.append('=');
        sb.append(((this.responsibility == null)?"<null>":this.responsibility));
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
        result = ((result* 31)+((this.requirement == null)? 0 :this.requirement.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.responsibility == null)? 0 :this.responsibility.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Snippet) == false) {
            return false;
        }
        Snippet rhs = ((Snippet) other);
        return ((((this.requirement == rhs.requirement)||((this.requirement!= null)&&this.requirement.equals(rhs.requirement)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.responsibility == rhs.responsibility)||((this.responsibility!= null)&&this.responsibility.equals(rhs.responsibility))));
    }

}
