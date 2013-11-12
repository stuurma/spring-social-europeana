package org.springframework.social.europeana.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.europeana.api.impl.EuropeanaTemplate;
import org.springframework.test.web.client.MockRestServiceServer;

public abstract class AbstractEuropeanaApiTest {
	protected static final String ACCESS_TOKEN = "someAccessToken";

	protected EuropeanaTemplate europeana;
	protected MockRestServiceServer mockServer;

	@Before
	public void setup() {
		europeana = new EuropeanaTemplate(ACCESS_TOKEN);
		mockServer = MockRestServiceServer.createServer(europeana.getRestTemplate());
	}

	protected Resource jsonResource(String filename) {
		return new ClassPathResource(filename + ".json", getClass());
	}

}
