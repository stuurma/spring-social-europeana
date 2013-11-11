package org.springframework.social.europeana.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.europeana.api.impl.EuropeanaTemplate;
import org.springframework.test.web.client.MockRestServiceServer;

public abstract class AbstractEuropeanaApiTest {
	protected static final String ACCESS_TOKEN = "someAccessToken";

	protected EuropeanaTemplate europeana;
	protected EuropeanaTemplate unauthorizedEuropeana;
	protected MockRestServiceServer mockServer;
    protected MockRestServiceServer unauthorizedMockServer;

	@Before
	public void setup() {
		europeana = createFacebookTemplate();
		mockServer = MockRestServiceServer.createServer(europeana.getRestTemplate());
		unauthorizedEuropeana = new EuropeanaTemplate();
		unauthorizedMockServer = MockRestServiceServer.createServer(unauthorizedEuropeana.getRestTemplate());
	}

	protected EuropeanaTemplate createFacebookTemplate() {
		return new EuropeanaTemplate(ACCESS_TOKEN);
	}

	protected Resource jsonResource(String filename) {
		return new ClassPathResource(filename + ".json", getClass());
	}

}
