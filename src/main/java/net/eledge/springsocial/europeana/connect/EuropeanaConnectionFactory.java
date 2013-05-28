package net.eledge.springsocial.europeana.connect;

import net.eledge.springsocial.europeana.api.Europeana;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;

public class EuropeanaConnectionFactory extends OAuth2ConnectionFactory<Europeana> {

	public EuropeanaConnectionFactory(String clientId, String clientSecret) {
        super("europeana", new EuropeanaServiceProvider(clientId, clientSecret), new EuropeanaAdaptor());
    }

}
