package org.springframework.social.europeana.connect;

import org.springframework.social.europeana.api.Europeana;
import org.springframework.social.europeana.api.impl.EuropeanaTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

public class EuropeanaServiceProvider extends AbstractOAuth2ServiceProvider<Europeana> {

	public EuropeanaServiceProvider(String clientId, String clientSecret) {
		super(new OAuth2Template(clientId, clientSecret, 
				"http://europeana.eu/api/oauth/authorize",
				"http://europeana.eu/api/oauth/token"));
	}
	
	@Override
	public Europeana getApi(String accessToken) {
		return new EuropeanaTemplate(accessToken);
	}

}
