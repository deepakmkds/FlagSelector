package com.apple.code.challenge.flagSelector.ServiceInterface;

import java.util.List;

import org.springframework.stereotype.Component;

import com.apple.code.challenge.flagSelector.Exception.ResourceNotFoundException;
import com.apple.code.challenge.flagSelector.Model.Continent;
import com.apple.code.challenge.flagSelector.Model.Country;

@Component
public interface FlagSelectorService {
	public List<Continent> getJSONData();
	public List<Country> getByContinent(String continentName) throws ResourceNotFoundException;
	public String getByCountry(String continentName,String countryName);
	public  List<String> getFlagListByCountryList(String continentName,List<String>countryList);

}
