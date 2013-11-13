package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SavedItemsOperations;
import org.springframework.social.europeana.api.model.SavedItemResults;
import org.springframework.social.europeana.api.model.UserModification;
import org.springframework.web.client.RestTemplate;

public class SavedItemsTemplate extends AbstractEuropeanaOperations implements SavedItemsOperations {
	
	public SavedItemsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	@Override
	public SavedItemResults getSavedItems() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("saveditem.json"), SavedItemResults.class);
	}

	@Override
	public SavedItemResults getSavedItemByEuropeanaId(String europeanaId) {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("saveditem.json?europeanaid="+europeanaId), SavedItemResults.class);
	}

	@Override
	public UserModification saveItem(String europeanaId) {
		requireUserAuthorization();
		return restTemplate.postForEntity(buildUri("saveditem.json?europeanaid="+europeanaId), null, UserModification.class).getBody();
	}

	@Override
	public void deleteBySavedItemId(Long itemId) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("saveditem.json?itemid="+itemId));
	}

	@Override
	public void deleteByEuropeanaId(String europeanaId) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("saveditem.json?europeanaid="+europeanaId));
	}

}
