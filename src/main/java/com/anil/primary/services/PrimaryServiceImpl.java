/**
 * 
 */
package com.anil.primary.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Primary
public class PrimaryServiceImpl implements GreetingService {

	public static final String PRIMARY_SERVICE = "Primary Service Impl !!!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.primary.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return PRIMARY_SERVICE;
	}

}
