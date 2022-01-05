package Test;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
	
	private int id;
	private String name;
	private String username;
	private String email;
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private String lat;
	private String lng;
	private String compName;
	private String catchPhrase;
	private String bs;	
	private String phone;
	private String website;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public String getBs() {
		return bs;
	}
	public void setBs(String bs) {
		this.bs = bs;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@SuppressWarnings("unchecked")
    @JsonProperty("address")
    public void unpackAddress(Map<String,Object> address) {
        this.street = (String)address.get("street");
        this.suite = (String)address.get("suite");
        this.city = (String)address.get("city");
        this.zipcode = (String)address.get("zipcode");
        Map<String,String> geo = (Map<String,String>)address.get("geo");
        this.lat = geo.get("lat");
        this.lng = geo.get("lng");
    }
	
	@JsonProperty("company")
    public void unpackCompany(Map<String,Object> company) {
        this.compName = (String)company.get("name");
        this.catchPhrase = (String)company.get("catchPhrase");
        this.bs = (String)company.get("bs");
    }
	
}
