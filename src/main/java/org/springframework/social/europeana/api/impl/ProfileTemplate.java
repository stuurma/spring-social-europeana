package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.ProfileOperations;
import org.springframework.social.europeana.api.model.Profile;
import org.springframework.web.client.RestTemplate;

public class ProfileTemplate extends AbstractEuropeanaOperations implements ProfileOperations {
	
	public ProfileTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	@Override
	public Profile getProfile() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("profile.json"), Profile.class);
	}

}
