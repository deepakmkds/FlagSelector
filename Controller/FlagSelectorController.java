package com.apple.code.challenge.flagSelector.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.code.challenge.flagSelector.Exception.ResourceNotFoundException;
import com.apple.code.challenge.flagSelector.Model.Continent;
import com.apple.code.challenge.flagSelector.Model.Country;
import com.apple.code.challenge.flagSelector.ServiceInterface.FlagSelectorService;

@RestController
@RequestMapping("/flagselector")
public class FlagSelectorController {
	@Autowired()
	FlagSelectorService flagSelectorService;
	
	@GetMapping("/continents")
	public List<Continent> getJSONData() throws ResourceNotFoundException{		
		List<Continent> continentList= flagSelectorService.getJSONData();
		if(continentList==null || continentList.isEmpty()){
			throw new ResourceNotFoundException("NO_DATA_FOUND");
		}else{
			return continentList;
		}
	}
	
	@GetMapping("/getByContinent/{continentName}")
	public List<Country> getByContinent(@PathVariable String continentName) throws ResourceNotFoundException{
		List<Country> countryList=flagSelectorService.getByContinent(continentName);
		if(countryList==null || countryList.isEmpty()){
			throw new ResourceNotFoundException("CONTINENT_NOT_FOUND");
		}else{
			return countryList;
		}			
	}
	
	@GetMapping("/getByCountry/{continentName}/{countryName}")
	public String getByCountry(@PathVariable String continentName,@PathVariable String countryName) throws ResourceNotFoundException{
				String flag=null;
				flag=flagSelectorService.getByCountry(continentName,countryName);
				if(flag==null || flag.equalsIgnoreCase("")){
					throw new ResourceNotFoundException("COUNTRY_NOT_FOUND");
				}else{
					return flag;
				}	
	}
	
	@GetMapping("/getByCountries/{continentName}/flagList/{countryList}")
	public List<String> getFlagListByCountryList(@PathVariable String continentName,@PathVariable List<String> countryList) throws ResourceNotFoundException{
				List<String> flagList=null;
				flagList=flagSelectorService.getFlagListByCountryList(continentName,countryList);
				if(flagList==null || flagList.isEmpty()){
					throw new ResourceNotFoundException("FLAGS_NOT_FOUND");
				}else {
					return flagList;
				}
									
	}

}
