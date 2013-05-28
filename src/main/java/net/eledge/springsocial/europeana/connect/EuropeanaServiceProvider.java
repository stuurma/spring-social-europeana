package net.eledge.springsocial.europeana.connect;

import net.eledge.springsocial.europeana.api.Europeana;
import net.eledge.springsocial.europeana.api.impl.EuropeanaTemplate;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

public class EuropeanaServiceProvider extends AbstractOAuth2ServiceProvider<Europeana> {

	public EuropeanaServiceProvider(String clientId, String clientSecret) {
		super(new OAuth2Template(clientId, clientSecret, 
				"https://graph.facebook.com/oauth/authorize",
				"https://graph.facebook.com/oauth/access_token"));
	}
	
	@Override
	public Europeana getApi(String accessToken) {
		return new EuropeanaTemplate(accessToken);
	}

}
