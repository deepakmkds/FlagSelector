package com.apple.code.challenge.flagSelector.Model;

public class Country {
	private String name;
	private String flag;
	
	public Country() {
	}
	
	public Country(String name, String flag) {
		super();
		this.name = name;
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

}
