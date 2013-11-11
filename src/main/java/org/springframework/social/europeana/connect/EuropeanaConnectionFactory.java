package org.springframework.social.europeana.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.europeana.api.Europeana;

public class EuropeanaConnectionFactory extends OAuth2ConnectionFactory<Europeana> {

	public EuropeanaConnectionFactory(String clientId, String clientSecret) {
        super("europeana", new EuropeanaServiceProvider(clientId, clientSecret), new EuropeanaAdaptor());
    }

}
