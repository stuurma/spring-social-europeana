package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.SavedSearchesOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;

import org.springframework.web.client.RestTemplate;

public class SavedSearchesTemplate extends AbstractEuropeanaOperations implements SavedSearchesOperations {
	
	public SavedSearchesTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
