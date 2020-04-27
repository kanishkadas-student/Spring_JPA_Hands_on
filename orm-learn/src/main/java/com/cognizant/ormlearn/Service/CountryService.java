package com.cognizant.ormlearn.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Service.Exception.CountryNotFoundException;
import com.cognizant.ormlearn.Repository.CountryRepository;
import com.cognizant.ormlearn.model.Country;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);
		if(!result.isPresent()) {
			throw new CountryNotFoundException("Country Not Found");
		}
		return result.get();
	}
	
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	
	@Transactional
	public void updateCountry(String countryCode, String countryName) throws CountryNotFoundException{
		Optional<Country> result = countryRepository.findById(countryCode);
		if(!result.isPresent()) {
			throw new CountryNotFoundException("Country Not Found");
		}
		Country c = result.get();
		c.setName(countryName);
		countryRepository.save(c);
	}
	
	@Transactional
	public void deleteCountry(String countryCode) {
		countryRepository.deleteById(countryCode);
	}
	
	@Transactional
	public List<Country> findByNameOrderBy(String name){
		return countryRepository.findByOrderByName(name);
	}
	
	@Transactional
	public List<Country> findByAlphaOrderBy(String name){
		return countryRepository.findByOrderByAlpha(name);
	}
}
