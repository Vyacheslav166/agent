
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
    "id",
    "premium",
    "name",
    "department",
    "has_test",
    "response_letter_required",
    "area",
    "salary",
    "type",
    "address",
    "response_url",
    "sort_point_distance",
    "published_at",
    "created_at",
    "archived",
    "apply_alternate_url",
    "insider_interview",
    "url",
    "alternate_url",
    "relations",
    "employer",
    "snippet",
    "contacts",
    "schedule",
    "working_days",
    "working_time_intervals",
    "working_time_modes",
    "accept_temporary"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("name")
    private String name;
    @JsonProperty("department")
    private Object department;
    @JsonProperty("has_test")
    private Boolean hasTest;
    @JsonProperty("response_letter_required")
    private Boolean responseLetterRequired;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("salary")
    private Salary salary;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("response_url")
    private Object responseUrl;
    @JsonProperty("sort_point_distance")
    private Object sortPointDistance;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("apply_alternate_url")
    private String applyAlternateUrl;
    @JsonProperty("insider_interview")
    private Object insiderInterview;
    @JsonProperty("url")
    private String url;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("relations")
    private List<Object> relations = null;
    @JsonProperty("employer")
    private Employer employer;
    @JsonProperty("snippet")
    private Snippet snippet;
    @JsonProperty("contacts")
    private Object contacts;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("working_days")
    private List<Object> workingDays = null;
    @JsonProperty("working_time_intervals")
    private List<Object> workingTimeIntervals = null;
    @JsonProperty("working_time_modes")
    private List<Object> workingTimeModes = null;
    @JsonProperty("accept_temporary")
    private Boolean acceptTemporary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param snippet
     * @param sortPointDistance
     * @param responseLetterRequired
     * @param workingDays
     * @param hasTest
     * @param alternateUrl
     * @param salary
     * @param type
     * @param createdAt
     * @param archived
     * @param premium
     * @param insiderInterview
     * @param employer
     * @param id
     * @param department
     * @param workingTimeIntervals
     * @param area
     * @param address
     * @param publishedAt
     * @param acceptTemporary
     * @param url
     * @param responseUrl
     * @param schedule
     * @param applyAlternateUrl
     * @param name
     * @param workingTimeModes
     * @param relations
     * @param contacts
     */
    public Item(String id, Boolean premium, String name, Object department, Boolean hasTest, Boolean responseLetterRequired, Area area, Salary salary, Type type, Address address, Object responseUrl, Object sortPointDistance, String publishedAt, String createdAt, Boolean archived, String applyAlternateUrl, Object insiderInterview, String url, String alternateUrl, List<Object> relations, Employer employer, Snippet snippet, Object contacts, Schedule schedule, List<Object> workingDays, List<Object> workingTimeIntervals, List<Object> workingTimeModes, Boolean acceptTemporary) {
        super();
        this.id = id;
        this.premium = premium;
        this.name = name;
        this.department = department;
        this.hasTest = hasTest;
        this.responseLetterRequired = responseLetterRequired;
        this.area = area;
        this.salary = salary;
        this.type = type;
        this.address = address;
        this.responseUrl = responseUrl;
        this.sortPointDistance = sortPointDistance;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.archived = archived;
        this.applyAlternateUrl = applyAlternateUrl;
        this.insiderInterview = insiderInterview;
        this.url = url;
        this.alternateUrl = alternateUrl;
        this.relations = relations;
        this.employer = employer;
        this.snippet = snippet;
        this.contacts = contacts;
        this.schedule = schedule;
        this.workingDays = workingDays;
        this.workingTimeIntervals = workingTimeIntervals;
        this.workingTimeModes = workingTimeModes;
        this.acceptTemporary = acceptTemporary;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public Item withPremium(Boolean premium) {
        this.premium = premium;
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

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    public Item withDepartment(Object department) {
        this.department = department;
        return this;
    }

    @JsonProperty("has_test")
    public Boolean getHasTest() {
        return hasTest;
    }

    @JsonProperty("has_test")
    public void setHasTest(Boolean hasTest) {
        this.hasTest = hasTest;
    }

    public Item withHasTest(Boolean hasTest) {
        this.hasTest = hasTest;
        return this;
    }

    @JsonProperty("response_letter_required")
    public Boolean getResponseLetterRequired() {
        return responseLetterRequired;
    }

    @JsonProperty("response_letter_required")
    public void setResponseLetterRequired(Boolean responseLetterRequired) {
        this.responseLetterRequired = responseLetterRequired;
    }

    public Item withResponseLetterRequired(Boolean responseLetterRequired) {
        this.responseLetterRequired = responseLetterRequired;
        return this;
    }

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    public Item withArea(Area area) {
        this.area = area;
        return this;
    }

    @JsonProperty("salary")
    public Salary getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Item withSalary(Salary salary) {
        this.salary = salary;
        return this;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Item withType(Type type) {
        this.type = type;
        return this;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Item withAddress(Address address) {
        this.address = address;
        return this;
    }

    @JsonProperty("response_url")
    public Object getResponseUrl() {
        return responseUrl;
    }

    @JsonProperty("response_url")
    public void setResponseUrl(Object responseUrl) {
        this.responseUrl = responseUrl;
    }

    public Item withResponseUrl(Object responseUrl) {
        this.responseUrl = responseUrl;
        return this;
    }

    @JsonProperty("sort_point_distance")
    public Object getSortPointDistance() {
        return sortPointDistance;
    }

    @JsonProperty("sort_point_distance")
    public void setSortPointDistance(Object sortPointDistance) {
        this.sortPointDistance = sortPointDistance;
    }

    public Item withSortPointDistance(Object sortPointDistance) {
        this.sortPointDistance = sortPointDistance;
        return this;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Item withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Item withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Item withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    @JsonProperty("apply_alternate_url")
    public String getApplyAlternateUrl() {
        return applyAlternateUrl;
    }

    @JsonProperty("apply_alternate_url")
    public void setApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
    }

    public Item withApplyAlternateUrl(String applyAlternateUrl) {
        this.applyAlternateUrl = applyAlternateUrl;
        return this;
    }

    @JsonProperty("insider_interview")
    public Object getInsiderInterview() {
        return insiderInterview;
    }

    @JsonProperty("insider_interview")
    public void setInsiderInterview(Object insiderInterview) {
        this.insiderInterview = insiderInterview;
    }

    public Item withInsiderInterview(Object insiderInterview) {
        this.insiderInterview = insiderInterview;
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

    public Item withUrl(String url) {
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

    public Item withAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
        return this;
    }

    @JsonProperty("relations")
    public List<Object> getRelations() {
        return relations;
    }

    @JsonProperty("relations")
    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    public Item withRelations(List<Object> relations) {
        this.relations = relations;
        return this;
    }

    @JsonProperty("employer")
    public Employer getEmployer() {
        return employer;
    }

    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Item withEmployer(Employer employer) {
        this.employer = employer;
        return this;
    }

    @JsonProperty("snippet")
    public Snippet getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public Item withSnippet(Snippet snippet) {
        this.snippet = snippet;
        return this;
    }

    @JsonProperty("contacts")
    public Object getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(Object contacts) {
        this.contacts = contacts;
    }

    public Item withContacts(Object contacts) {
        this.contacts = contacts;
        return this;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Item withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    @JsonProperty("working_days")
    public List<Object> getWorkingDays() {
        return workingDays;
    }

    @JsonProperty("working_days")
    public void setWorkingDays(List<Object> workingDays) {
        this.workingDays = workingDays;
    }

    public Item withWorkingDays(List<Object> workingDays) {
        this.workingDays = workingDays;
        return this;
    }

    @JsonProperty("working_time_intervals")
    public List<Object> getWorkingTimeIntervals() {
        return workingTimeIntervals;
    }

    @JsonProperty("working_time_intervals")
    public void setWorkingTimeIntervals(List<Object> workingTimeIntervals) {
        this.workingTimeIntervals = workingTimeIntervals;
    }

    public Item withWorkingTimeIntervals(List<Object> workingTimeIntervals) {
        this.workingTimeIntervals = workingTimeIntervals;
        return this;
    }

    @JsonProperty("working_time_modes")
    public List<Object> getWorkingTimeModes() {
        return workingTimeModes;
    }

    @JsonProperty("working_time_modes")
    public void setWorkingTimeModes(List<Object> workingTimeModes) {
        this.workingTimeModes = workingTimeModes;
    }

    public Item withWorkingTimeModes(List<Object> workingTimeModes) {
        this.workingTimeModes = workingTimeModes;
        return this;
    }

    @JsonProperty("accept_temporary")
    public Boolean getAcceptTemporary() {
        return acceptTemporary;
    }

    @JsonProperty("accept_temporary")
    public void setAcceptTemporary(Boolean acceptTemporary) {
        this.acceptTemporary = acceptTemporary;
    }

    public Item withAcceptTemporary(Boolean acceptTemporary) {
        this.acceptTemporary = acceptTemporary;
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

    public Item withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("premium");
        sb.append('=');
        sb.append(((this.premium == null)?"<null>":this.premium));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("hasTest");
        sb.append('=');
        sb.append(((this.hasTest == null)?"<null>":this.hasTest));
        sb.append(',');
        sb.append("responseLetterRequired");
        sb.append('=');
        sb.append(((this.responseLetterRequired == null)?"<null>":this.responseLetterRequired));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("responseUrl");
        sb.append('=');
        sb.append(((this.responseUrl == null)?"<null>":this.responseUrl));
        sb.append(',');
        sb.append("sortPointDistance");
        sb.append('=');
        sb.append(((this.sortPointDistance == null)?"<null>":this.sortPointDistance));
        sb.append(',');
        sb.append("publishedAt");
        sb.append('=');
        sb.append(((this.publishedAt == null)?"<null>":this.publishedAt));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("applyAlternateUrl");
        sb.append('=');
        sb.append(((this.applyAlternateUrl == null)?"<null>":this.applyAlternateUrl));
        sb.append(',');
        sb.append("insiderInterview");
        sb.append('=');
        sb.append(((this.insiderInterview == null)?"<null>":this.insiderInterview));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("alternateUrl");
        sb.append('=');
        sb.append(((this.alternateUrl == null)?"<null>":this.alternateUrl));
        sb.append(',');
        sb.append("relations");
        sb.append('=');
        sb.append(((this.relations == null)?"<null>":this.relations));
        sb.append(',');
        sb.append("employer");
        sb.append('=');
        sb.append(((this.employer == null)?"<null>":this.employer));
        sb.append(',');
        sb.append("snippet");
        sb.append('=');
        sb.append(((this.snippet == null)?"<null>":this.snippet));
        sb.append(',');
        sb.append("contacts");
        sb.append('=');
        sb.append(((this.contacts == null)?"<null>":this.contacts));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("workingDays");
        sb.append('=');
        sb.append(((this.workingDays == null)?"<null>":this.workingDays));
        sb.append(',');
        sb.append("workingTimeIntervals");
        sb.append('=');
        sb.append(((this.workingTimeIntervals == null)?"<null>":this.workingTimeIntervals));
        sb.append(',');
        sb.append("workingTimeModes");
        sb.append('=');
        sb.append(((this.workingTimeModes == null)?"<null>":this.workingTimeModes));
        sb.append(',');
        sb.append("acceptTemporary");
        sb.append('=');
        sb.append(((this.acceptTemporary == null)?"<null>":this.acceptTemporary));
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
        result = ((result* 31)+((this.snippet == null)? 0 :this.snippet.hashCode()));
        result = ((result* 31)+((this.sortPointDistance == null)? 0 :this.sortPointDistance.hashCode()));
        result = ((result* 31)+((this.responseLetterRequired == null)? 0 :this.responseLetterRequired.hashCode()));
        result = ((result* 31)+((this.workingDays == null)? 0 :this.workingDays.hashCode()));
        result = ((result* 31)+((this.hasTest == null)? 0 :this.hasTest.hashCode()));
        result = ((result* 31)+((this.alternateUrl == null)? 0 :this.alternateUrl.hashCode()));
        result = ((result* 31)+((this.salary == null)? 0 :this.salary.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.premium == null)? 0 :this.premium.hashCode()));
        result = ((result* 31)+((this.insiderInterview == null)? 0 :this.insiderInterview.hashCode()));
        result = ((result* 31)+((this.employer == null)? 0 :this.employer.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.workingTimeIntervals == null)? 0 :this.workingTimeIntervals.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.publishedAt == null)? 0 :this.publishedAt.hashCode()));
        result = ((result* 31)+((this.acceptTemporary == null)? 0 :this.acceptTemporary.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.responseUrl == null)? 0 :this.responseUrl.hashCode()));
        result = ((result* 31)+((this.schedule == null)? 0 :this.schedule.hashCode()));
        result = ((result* 31)+((this.applyAlternateUrl == null)? 0 :this.applyAlternateUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.workingTimeModes == null)? 0 :this.workingTimeModes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.relations == null)? 0 :this.relations.hashCode()));
        result = ((result* 31)+((this.contacts == null)? 0 :this.contacts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return ((((((((((((((((((((((((((((((this.snippet == rhs.snippet)||((this.snippet!= null)&&this.snippet.equals(rhs.snippet)))&&((this.sortPointDistance == rhs.sortPointDistance)||((this.sortPointDistance!= null)&&this.sortPointDistance.equals(rhs.sortPointDistance))))&&((this.responseLetterRequired == rhs.responseLetterRequired)||((this.responseLetterRequired!= null)&&this.responseLetterRequired.equals(rhs.responseLetterRequired))))&&((this.workingDays == rhs.workingDays)||((this.workingDays!= null)&&this.workingDays.equals(rhs.workingDays))))&&((this.hasTest == rhs.hasTest)||((this.hasTest!= null)&&this.hasTest.equals(rhs.hasTest))))&&((this.alternateUrl == rhs.alternateUrl)||((this.alternateUrl!= null)&&this.alternateUrl.equals(rhs.alternateUrl))))&&((this.salary == rhs.salary)||((this.salary!= null)&&this.salary.equals(rhs.salary))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.premium == rhs.premium)||((this.premium!= null)&&this.premium.equals(rhs.premium))))&&((this.insiderInterview == rhs.insiderInterview)||((this.insiderInterview!= null)&&this.insiderInterview.equals(rhs.insiderInterview))))&&((this.employer == rhs.employer)||((this.employer!= null)&&this.employer.equals(rhs.employer))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.workingTimeIntervals == rhs.workingTimeIntervals)||((this.workingTimeIntervals!= null)&&this.workingTimeIntervals.equals(rhs.workingTimeIntervals))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.publishedAt == rhs.publishedAt)||((this.publishedAt!= null)&&this.publishedAt.equals(rhs.publishedAt))))&&((this.acceptTemporary == rhs.acceptTemporary)||((this.acceptTemporary!= null)&&this.acceptTemporary.equals(rhs.acceptTemporary))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.responseUrl == rhs.responseUrl)||((this.responseUrl!= null)&&this.responseUrl.equals(rhs.responseUrl))))&&((this.schedule == rhs.schedule)||((this.schedule!= null)&&this.schedule.equals(rhs.schedule))))&&((this.applyAlternateUrl == rhs.applyAlternateUrl)||((this.applyAlternateUrl!= null)&&this.applyAlternateUrl.equals(rhs.applyAlternateUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.workingTimeModes == rhs.workingTimeModes)||((this.workingTimeModes!= null)&&this.workingTimeModes.equals(rhs.workingTimeModes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.relations == rhs.relations)||((this.relations!= null)&&this.relations.equals(rhs.relations))))&&((this.contacts == rhs.contacts)||((this.contacts!= null)&&this.contacts.equals(rhs.contacts))));
    }

}
