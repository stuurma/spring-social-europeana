package net.eledge.springsocial.europeana.api.impl;

import org.springframework.web.client.RestTemplate;

import net.eledge.springsocial.europeana.api.FavoriteOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;

public class FavoriteTemplate extends AbstractEuropeanaOperations implements FavoriteOperations {
	
	public FavoriteTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
