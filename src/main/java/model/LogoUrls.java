
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
    "original",
    "240",
    "90"
})
@Generated("jsonschema2pojo")
public class LogoUrls {

    @JsonProperty("original")
    private String original;
    @JsonProperty("240")
    private String _240;
    @JsonProperty("90")
    private String _90;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LogoUrls() {
    }

    /**
     * 
     * @param original
     * @param _240
     * @param _90
     */
    public LogoUrls(String original, String _240, String _90) {
        super();
        this.original = original;
        this._240 = _240;
        this._90 = _90;
    }

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    public LogoUrls withOriginal(String original) {
        this.original = original;
        return this;
    }

    @JsonProperty("240")
    public String get240() {
        return _240;
    }

    @JsonProperty("240")
    public void set240(String _240) {
        this._240 = _240;
    }

    public LogoUrls with240(String _240) {
        this._240 = _240;
        return this;
    }

    @JsonProperty("90")
    public String get90() {
        return _90;
    }

    @JsonProperty("90")
    public void set90(String _90) {
        this._90 = _90;
    }

    public LogoUrls with90(String _90) {
        this._90 = _90;
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

    public LogoUrls withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogoUrls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("original");
        sb.append('=');
        sb.append(((this.original == null)?"<null>":this.original));
        sb.append(',');
        sb.append("_240");
        sb.append('=');
        sb.append(((this._240 == null)?"<null>":this._240));
        sb.append(',');
        sb.append("_90");
        sb.append('=');
        sb.append(((this._90 == null)?"<null>":this._90));
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
        result = ((result* 31)+((this.original == null)? 0 :this.original.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._240 == null)? 0 :this._240 .hashCode()));
        result = ((result* 31)+((this._90 == null)? 0 :this._90 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogoUrls) == false) {
            return false;
        }
        LogoUrls rhs = ((LogoUrls) other);
        return (((((this.original == rhs.original)||((this.original!= null)&&this.original.equals(rhs.original)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._240 == rhs._240)||((this._240 != null)&&this._240 .equals(rhs._240))))&&((this._90 == rhs._90)||((this._90 != null)&&this._90 .equals(rhs._90))));
    }

}
