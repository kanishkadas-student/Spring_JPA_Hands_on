package com.cognizant.ormlearn.Service.Exception;

public class CountryNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CountryNotFoundException(String message) {
		System.out.println(message);
	}
}
