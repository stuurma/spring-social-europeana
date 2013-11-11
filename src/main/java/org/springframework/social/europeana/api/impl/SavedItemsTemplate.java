package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SavedItemsOperations;
import org.springframework.web.client.RestTemplate;

public class SavedItemsTemplate extends AbstractEuropeanaOperations implements SavedItemsOperations {
	
	public SavedItemsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
