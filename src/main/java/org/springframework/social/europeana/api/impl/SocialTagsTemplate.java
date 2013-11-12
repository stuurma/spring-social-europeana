package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SocialTagsOperations;
import org.springframework.social.europeana.api.model.TagCloudResults;
import org.springframework.social.europeana.api.model.TagResults;
import org.springframework.web.client.RestTemplate;

public class SocialTagsTemplate extends AbstractEuropeanaOperations implements SocialTagsOperations {
	
	public SocialTagsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	public TagResults getSocialTags() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json"), TagResults.class);
	}
	
	public TagCloudResults getSocialTagCloud() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json?action=TAGCLOUD"), TagCloudResults.class);
	}

}
