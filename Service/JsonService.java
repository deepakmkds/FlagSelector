package com.apple.code.challenge.flagSelector.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.apple.code.challenge.flagSelector.Model.Continent;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonService {
	List<Continent> continentList = new ArrayList<Continent>();
	
	
	@PostConstruct
    public void init() throws IOException {
        ObjectMapper jsonMapper = new ObjectMapper();
        TypeReference<List<Continent>> mapType = new TypeReference<List<Continent>>() {};
        InputStream is = TypeReference.class.getResourceAsStream("/json/continents.json");
        continentList = jsonMapper.readValue(is, mapType);
    	
    }


	public List<Continent> getContinentList() {
		return continentList;
	}
	
	


}
