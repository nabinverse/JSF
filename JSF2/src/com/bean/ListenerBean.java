package com.bean;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="listenerBean")
@RequestScoped
public class ListenerBean {
	
	@ManagedProperty(value="#{welBean}")
	WelcomeBean welBean;
	
	public void setWelBean(WelcomeBean welBean) {
		this.welBean = welBean;
	}
	
	private String mobcode;
	
	public String getMobcode() {
		return mobcode;
	}

	public void setMobcode(String mobcode) {
		this.mobcode = mobcode;
	}

	private String country;
	
	private static Map<String,String> countries;
	
	public Map<String,String> getCountryInMap() {
		return this.countries;
	}

	static{
		countries = new LinkedHashMap<String,String>();
		countries.put("Please Select", "Please Select"); //label, value
		countries.put("India", "IN");
		countries.put("UK", "uk");
		countries.put("USA", "us");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
