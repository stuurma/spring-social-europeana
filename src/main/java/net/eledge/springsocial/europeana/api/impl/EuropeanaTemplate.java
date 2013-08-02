package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.Europeana;
import net.eledge.springsocial.europeana.api.SavedItemsOperations;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

public class EuropeanaTemplate extends AbstractOAuth2ApiBinding implements Europeana {

	private SavedItemsOperations savedItemsOperations;

	public EuropeanaTemplate() {
		super();
		initSubApis();
	}

	public EuropeanaTemplate(String accessToken) {
		super(accessToken);
		initSubApis();
	}

	public SavedItemsOperations savedItemsOperations() {
		return savedItemsOperations;
	}

	private void initSubApis() {
		this.savedItemsOperations = new SavedItemsTemplate(getRestTemplate(), isAuthorized());
	}

}
