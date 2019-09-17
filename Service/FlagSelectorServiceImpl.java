package com.apple.code.challenge.flagSelector.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apple.code.challenge.flagSelector.Exception.ResourceNotFoundException;
import com.apple.code.challenge.flagSelector.Model.Continent;
import com.apple.code.challenge.flagSelector.Model.Country;
import com.apple.code.challenge.flagSelector.ServiceInterface.FlagSelectorService;

@Component
public class FlagSelectorServiceImpl implements FlagSelectorService {

	@Autowired
	JsonService jsonService;

	@Override
	public List<Continent> getJSONData() {
		return jsonService.getContinentList();
	}

	@Override
	public List<Country> getByContinent(String continentName) {
		List<Country> countryList = null;
		List<Continent> continenetList = jsonService.getContinentList();
		for (Continent continent : continenetList) {
			if (continent.getContinent().equalsIgnoreCase(continentName)) {
				countryList = continent.getCountries();
				break;
			}
		}
		return countryList;
	}

	@Override
	public String getByCountry(String continentName, String countryName) {
		String flag = null;
		List<Country> countryList = null;
		List<Continent> continenetList = jsonService.getContinentList();
		for (Continent continent : continenetList) {
			if (continent.getContinent().equalsIgnoreCase(continentName)) {
				countryList = continent.getCountries();
				for (Country country : countryList) {
					if (country.getName().equalsIgnoreCase(countryName)) {
						flag = country.getFlag();
					}
				}
			}
		}

		return flag;
	}

	@Override
	public List<String> getFlagListByCountryList(String continentName, List<String> countryList) {
		List<String> flagList = null;
		List<Country> countryList1 = null;
		List<String> countires = new ArrayList<>();
		for (String eachCountry : countryList) {
			countires.add(eachCountry.toLowerCase());
		}
		List<Continent> continenetList = jsonService.getContinentList();
		for (Continent continent : continenetList) {
			if (continent.getContinent().equalsIgnoreCase(continentName)) {
				countryList1 = continent.getCountries();
				for (Country country : countryList1) {
					if (countires.contains(country.getName().toLowerCase())) {
						flagList.add(country.getFlag());
					}
				}
			}
		}

		return flagList;
	}
}
