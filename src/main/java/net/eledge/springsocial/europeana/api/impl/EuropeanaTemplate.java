package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.Europeana;
import net.eledge.springsocial.europeana.api.FavoriteOperations;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

public class EuropeanaTemplate extends AbstractOAuth2ApiBinding implements Europeana {

	private FavoriteOperations favoriteOperations;

	public EuropeanaTemplate() {
		super();
		initSubApis();
	}

	public EuropeanaTemplate(String accessToken) {
		super(accessToken);
		initSubApis();
	}

	public FavoriteOperations favoriteOperations() {
		return favoriteOperations;
	}

	private void initSubApis() {
		this.favoriteOperations = new FavoriteTemplate(getRestTemplate(), isAuthorized());
	}

}
