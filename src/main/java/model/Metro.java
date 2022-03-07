
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
    "station_name",
    "line_name",
    "station_id",
    "line_id",
    "lat",
    "lng"
})
@Generated("jsonschema2pojo")
public class Metro {

    @JsonProperty("station_name")
    private String stationName;
    @JsonProperty("line_name")
    private String lineName;
    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("line_id")
    private String lineId;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metro() {
    }

    /**
     * 
     * @param lng
     * @param lineName
     * @param lineId
     * @param stationName
     * @param lat
     * @param stationId
     */
    public Metro(String stationName, String lineName, String stationId, String lineId, Double lat, Double lng) {
        super();
        this.stationName = stationName;
        this.lineName = lineName;
        this.stationId = stationId;
        this.lineId = lineId;
        this.lat = lat;
        this.lng = lng;
    }

    @JsonProperty("station_name")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("station_name")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Metro withStationName(String stationName) {
        this.stationName = stationName;
        return this;
    }

    @JsonProperty("line_name")
    public String getLineName() {
        return lineName;
    }

    @JsonProperty("line_name")
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Metro withLineName(String lineName) {
        this.lineName = lineName;
        return this;
    }

    @JsonProperty("station_id")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("station_id")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Metro withStationId(String stationId) {
        this.stationId = stationId;
        return this;
    }

    @JsonProperty("line_id")
    public String getLineId() {
        return lineId;
    }

    @JsonProperty("line_id")
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Metro withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Metro withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Metro withLng(Double lng) {
        this.lng = lng;
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

    public Metro withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metro.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stationName");
        sb.append('=');
        sb.append(((this.stationName == null)?"<null>":this.stationName));
        sb.append(',');
        sb.append("lineName");
        sb.append('=');
        sb.append(((this.lineName == null)?"<null>":this.lineName));
        sb.append(',');
        sb.append("stationId");
        sb.append('=');
        sb.append(((this.stationId == null)?"<null>":this.stationId));
        sb.append(',');
        sb.append("lineId");
        sb.append('=');
        sb.append(((this.lineId == null)?"<null>":this.lineId));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("lng");
        sb.append('=');
        sb.append(((this.lng == null)?"<null>":this.lng));
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
        result = ((result* 31)+((this.lng == null)? 0 :this.lng.hashCode()));
        result = ((result* 31)+((this.lineName == null)? 0 :this.lineName.hashCode()));
        result = ((result* 31)+((this.lineId == null)? 0 :this.lineId.hashCode()));
        result = ((result* 31)+((this.stationName == null)? 0 :this.stationName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        result = ((result* 31)+((this.stationId == null)? 0 :this.stationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metro) == false) {
            return false;
        }
        Metro rhs = ((Metro) other);
        return ((((((((this.lng == rhs.lng)||((this.lng!= null)&&this.lng.equals(rhs.lng)))&&((this.lineName == rhs.lineName)||((this.lineName!= null)&&this.lineName.equals(rhs.lineName))))&&((this.lineId == rhs.lineId)||((this.lineId!= null)&&this.lineId.equals(rhs.lineId))))&&((this.stationName == rhs.stationName)||((this.stationName!= null)&&this.stationName.equals(rhs.stationName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))))&&((this.stationId == rhs.stationId)||((this.stationId!= null)&&this.stationId.equals(rhs.stationId))));
    }

}
