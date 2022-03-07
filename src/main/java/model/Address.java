
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
    "city",
    "street",
    "building",
    "description",
    "lat",
    "lng",
    "raw",
    "metro",
    "metro_stations",
    "id"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("building")
    private String building;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("raw")
    private String raw;
    @JsonProperty("metro")
    private Metro metro;
    @JsonProperty("metro_stations")
    private List<MetroStation> metroStations = null;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param lng
     * @param city
     * @param street
     * @param metro
     * @param metroStations
     * @param description
     * @param raw
     * @param id
     * @param building
     * @param lat
     */
    public Address(String city, String street, String building, Object description, Double lat, Double lng, String raw, Metro metro, List<MetroStation> metroStations, String id) {
        super();
        this.city = city;
        this.street = street;
        this.building = building;
        this.description = description;
        this.lat = lat;
        this.lng = lng;
        this.raw = raw;
        this.metro = metro;
        this.metroStations = metroStations;
        this.id = id;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public Address withBuilding(String building) {
        this.building = building;
        return this;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    public Address withDescription(Object description) {
        this.description = description;
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

    public Address withLat(Double lat) {
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

    public Address withLng(Double lng) {
        this.lng = lng;
        return this;
    }

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    public Address withRaw(String raw) {
        this.raw = raw;
        return this;
    }

    @JsonProperty("metro")
    public Metro getMetro() {
        return metro;
    }

    @JsonProperty("metro")
    public void setMetro(Metro metro) {
        this.metro = metro;
    }

    public Address withMetro(Metro metro) {
        this.metro = metro;
        return this;
    }

    @JsonProperty("metro_stations")
    public List<MetroStation> getMetroStations() {
        return metroStations;
    }

    @JsonProperty("metro_stations")
    public void setMetroStations(List<MetroStation> metroStations) {
        this.metroStations = metroStations;
    }

    public Address withMetroStations(List<MetroStation> metroStations) {
        this.metroStations = metroStations;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Address withId(String id) {
        this.id = id;
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

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("street");
        sb.append('=');
        sb.append(((this.street == null)?"<null>":this.street));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("lng");
        sb.append('=');
        sb.append(((this.lng == null)?"<null>":this.lng));
        sb.append(',');
        sb.append("raw");
        sb.append('=');
        sb.append(((this.raw == null)?"<null>":this.raw));
        sb.append(',');
        sb.append("metro");
        sb.append('=');
        sb.append(((this.metro == null)?"<null>":this.metro));
        sb.append(',');
        sb.append("metroStations");
        sb.append('=');
        sb.append(((this.metroStations == null)?"<null>":this.metroStations));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.street == null)? 0 :this.street.hashCode()));
        result = ((result* 31)+((this.metro == null)? 0 :this.metro.hashCode()));
        result = ((result* 31)+((this.metroStations == null)? 0 :this.metroStations.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.raw == null)? 0 :this.raw.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return ((((((((((((this.lng == rhs.lng)||((this.lng!= null)&&this.lng.equals(rhs.lng)))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.street == rhs.street)||((this.street!= null)&&this.street.equals(rhs.street))))&&((this.metro == rhs.metro)||((this.metro!= null)&&this.metro.equals(rhs.metro))))&&((this.metroStations == rhs.metroStations)||((this.metroStations!= null)&&this.metroStations.equals(rhs.metroStations))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.raw == rhs.raw)||((this.raw!= null)&&this.raw.equals(rhs.raw))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
    }

}
