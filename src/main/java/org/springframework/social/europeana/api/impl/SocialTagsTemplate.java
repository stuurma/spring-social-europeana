package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SocialTagsOperations;
import org.springframework.web.client.RestTemplate;

public class SocialTagsTemplate extends AbstractEuropeanaOperations implements SocialTagsOperations {
	
	public SocialTagsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
