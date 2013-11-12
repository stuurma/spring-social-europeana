package org.springframework.social.europeana.api;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.header;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.social.europeana.api.impl.AbstractEuropeanaOperations;
import org.springframework.social.europeana.api.model.Profile;

public class ProfileTemplateTest extends AbstractEuropeanaApiTest {

	@Test
	public void getProfileTest() {
		mockServer.expect(requestTo(AbstractEuropeanaOperations.API_URL_BASE + "profile.json"))
				.andExpect(method(GET))
				.andExpect(header("Authorization", "OAuth someAccessToken"))
				.andRespond(withSuccess(jsonResource("profile"), MediaType.APPLICATION_JSON));
		
		Profile profile = europeana.profileOperations().getProfile();
		assertEquals("Email does not match", profile.getEmail(), "example@europeana.eu");
	}

}
