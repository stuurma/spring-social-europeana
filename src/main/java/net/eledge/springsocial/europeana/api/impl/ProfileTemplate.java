package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.ProfileOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;
import net.eledge.springsocial.europeana.model.Profile;

import org.springframework.web.client.RestTemplate;

public class ProfileTemplate extends AbstractEuropeanaOperations implements ProfileOperations {
	
	public ProfileTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	public Profile getProfile() {
		// TODO Auto-generated method stub
		return null;
	}

}
