package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.ProfileOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;

import org.springframework.web.client.RestTemplate;

public class ProfileTemplate extends AbstractEuropeanaOperations implements ProfileOperations {
	
	public ProfileTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
