package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SavedSearchesOperations;
import org.springframework.social.europeana.api.model.SavedSearchResults;
import org.springframework.web.client.RestTemplate;

public class SavedSearchesTemplate extends AbstractEuropeanaOperations implements SavedSearchesOperations {
	
	public SavedSearchesTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	public SavedSearchResults getSavedSearches() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("savedsearch.json"), SavedSearchResults.class);
	}

}
