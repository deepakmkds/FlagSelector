package com.apple.code.challenge.flagSelector.Model;

import java.util.List;

public class ResponseJson {
	public ResponseJson(List<Continent> continents) {
		super();
		this.continents = continents;
	}

	private List<Continent> continents=null;
	
	

	public List<Continent> getContinents() {
		return continents;
	}

	public void setContinents(List<Continent> continents) {
		this.continents = continents;
	}
	
	

}
