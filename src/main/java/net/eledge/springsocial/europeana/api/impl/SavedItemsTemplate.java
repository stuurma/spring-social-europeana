package net.eledge.springsocial.europeana.api.impl;

import org.springframework.web.client.RestTemplate;

import net.eledge.springsocial.europeana.api.SavedItemsOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;

public class SavedItemsTemplate extends AbstractEuropeanaOperations implements SavedItemsOperations {
	
	public SavedItemsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
