package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.Europeana;
import net.eledge.springsocial.europeana.api.ProfileOperations;
import net.eledge.springsocial.europeana.api.SavedItemsOperations;
import net.eledge.springsocial.europeana.api.SavedSearchesOperations;
import net.eledge.springsocial.europeana.api.SocialTagsOperations;

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
