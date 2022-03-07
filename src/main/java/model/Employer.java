
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
    "id",
    "name",
    "url",
    "alternate_url",
    "logo_urls",
    "vacancies_url",
    "trusted"
})
@Generated("jsonschema2pojo")
public class Employer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("logo_urls")
    private LogoUrls logoUrls;
    @JsonProperty("vacancies_url")
    private String vacanciesUrl;
    @JsonProperty("trusted")
    private Boolean trusted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Employer() {
    }

    /**
     * 
     * @param logoUrls
     * @param trusted
     * @param name
     * @param alternateUrl
     * @param id
     * @param vacanciesUrl
     * @param url
     */
    public Employer(String id, String name, String url, String alternateUrl, LogoUrls logoUrls, String vacanciesUrl, Boolean trusted) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
        this.alternateUrl = alternateUrl;
        this.logoUrls = logoUrls;
        this.vacanciesUrl = vacanciesUrl;
        this.trusted = trusted;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Employer withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Employer withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Employer withUrl(String url) {
        this.url = url;
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

    public Employer withAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
        return this;
    }

    @JsonProperty("logo_urls")
    public LogoUrls getLogoUrls() {
        return logoUrls;
    }

    @JsonProperty("logo_urls")
    public void setLogoUrls(LogoUrls logoUrls) {
        this.logoUrls = logoUrls;
    }

    public Employer withLogoUrls(LogoUrls logoUrls) {
        this.logoUrls = logoUrls;
        return this;
    }

    @JsonProperty("vacancies_url")
    public String getVacanciesUrl() {
        return vacanciesUrl;
    }

    @JsonProperty("vacancies_url")
    public void setVacanciesUrl(String vacanciesUrl) {
        this.vacanciesUrl = vacanciesUrl;
    }

    public Employer withVacanciesUrl(String vacanciesUrl) {
        this.vacanciesUrl = vacanciesUrl;
        return this;
    }

    @JsonProperty("trusted")
    public Boolean getTrusted() {
        return trusted;
    }

    @JsonProperty("trusted")
    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    public Employer withTrusted(Boolean trusted) {
        this.trusted = trusted;
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

    public Employer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("alternateUrl");
        sb.append('=');
        sb.append(((this.alternateUrl == null)?"<null>":this.alternateUrl));
        sb.append(',');
        sb.append("logoUrls");
        sb.append('=');
        sb.append(((this.logoUrls == null)?"<null>":this.logoUrls));
        sb.append(',');
        sb.append("vacanciesUrl");
        sb.append('=');
        sb.append(((this.vacanciesUrl == null)?"<null>":this.vacanciesUrl));
        sb.append(',');
        sb.append("trusted");
        sb.append('=');
        sb.append(((this.trusted == null)?"<null>":this.trusted));
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
        result = ((result* 31)+((this.logoUrls == null)? 0 :this.logoUrls.hashCode()));
        result = ((result* 31)+((this.trusted == null)? 0 :this.trusted.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.alternateUrl == null)? 0 :this.alternateUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vacanciesUrl == null)? 0 :this.vacanciesUrl.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employer) == false) {
            return false;
        }
        Employer rhs = ((Employer) other);
        return (((((((((this.logoUrls == rhs.logoUrls)||((this.logoUrls!= null)&&this.logoUrls.equals(rhs.logoUrls)))&&((this.trusted == rhs.trusted)||((this.trusted!= null)&&this.trusted.equals(rhs.trusted))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.alternateUrl == rhs.alternateUrl)||((this.alternateUrl!= null)&&this.alternateUrl.equals(rhs.alternateUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vacanciesUrl == rhs.vacanciesUrl)||((this.vacanciesUrl!= null)&&this.vacanciesUrl.equals(rhs.vacanciesUrl))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
