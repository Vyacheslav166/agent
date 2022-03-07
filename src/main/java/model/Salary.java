
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
    "from",
    "to",
    "currency",
    "gross"
})
@Generated("jsonschema2pojo")
public class Salary {

    @JsonProperty("from")
    private Long from;
    @JsonProperty("to")
    private Long to;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("gross")
    private Boolean gross;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Salary() {
    }

    /**
     * 
     * @param gross
     * @param from
     * @param currency
     * @param to
     */
    public Salary(Long from, Long to, String currency, Boolean gross) {
        super();
        this.from = from;
        this.to = to;
        this.currency = currency;
        this.gross = gross;
    }

    @JsonProperty("from")
    public Long getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Long from) {
        this.from = from;
    }

    public Salary withFrom(Long from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public Long getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Long to) {
        this.to = to;
    }

    public Salary withTo(Long to) {
        this.to = to;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Salary withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("gross")
    public Boolean getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(Boolean gross) {
        this.gross = gross;
    }

    public Salary withGross(Boolean gross) {
        this.gross = gross;
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

    public Salary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Salary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("gross");
        sb.append('=');
        sb.append(((this.gross == null)?"<null>":this.gross));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gross == null)? 0 :this.gross.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Salary) == false) {
            return false;
        }
        Salary rhs = ((Salary) other);
        return ((((((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gross == rhs.gross)||((this.gross!= null)&&this.gross.equals(rhs.gross))));
    }

}
