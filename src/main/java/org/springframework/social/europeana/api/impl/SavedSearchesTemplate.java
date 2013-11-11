package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SavedSearchesOperations;
import org.springframework.web.client.RestTemplate;

public class SavedSearchesTemplate extends AbstractEuropeanaOperations implements SavedSearchesOperations {
	
	public SavedSearchesTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
