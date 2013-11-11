package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.Europeana;
import org.springframework.social.europeana.api.ProfileOperations;
import org.springframework.social.europeana.api.SavedItemsOperations;
import org.springframework.social.europeana.api.SavedSearchesOperations;
import org.springframework.social.europeana.api.SocialTagsOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

public class EuropeanaTemplate extends AbstractOAuth2ApiBinding implements Europeana {

	private ProfileOperations profileOperations;
	private SavedItemsOperations savedItemsOperations;
	private SavedSearchesOperations savedSearchesOperations;
	private SocialTagsOperations socialTagsOperations;

	public EuropeanaTemplate() {
		super();
		initSubApis();
	}

	public EuropeanaTemplate(String accessToken) {
		super(accessToken);
		initSubApis();
	}

	public ProfileOperations profileOperations() {
		return profileOperations;
	}

	public SavedItemsOperations savedItemsOperations() {
		return savedItemsOperations;
	}

	public SavedSearchesOperations savedSearchesOperations() {
		return savedSearchesOperations;
	}

	public SocialTagsOperations socialTagsOperations() {
		return socialTagsOperations;
	}

	private void initSubApis() {
		this.profileOperations = new ProfileTemplate(getRestTemplate(), isAuthorized());
		this.savedItemsOperations = new SavedItemsTemplate(getRestTemplate(), isAuthorized());
		this.savedSearchesOperations = new SavedSearchesTemplate(getRestTemplate(), isAuthorized());
		this.socialTagsOperations = new SocialTagsTemplate(getRestTemplate(), isAuthorized());
	}

}
