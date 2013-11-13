package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SocialTagsOperations;
import org.springframework.social.europeana.api.model.TagCloudResults;
import org.springframework.social.europeana.api.model.TagResults;
import org.springframework.social.europeana.api.model.UserModification;
import org.springframework.web.client.RestTemplate;

public class SocialTagsTemplate extends AbstractEuropeanaOperations implements SocialTagsOperations {
	
	public SocialTagsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	@Override
	public TagResults getSocialTags() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json"), TagResults.class);
	}
	
	@Override
	public TagCloudResults getSocialTagCloud() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json?action=TAGCLOUD"), TagCloudResults.class);
	}
	
	@Override
	public UserModification saveSocialTag(String europeanaId, String tag) {
		requireUserAuthorization();
		return restTemplate.postForEntity("tag.json?europeanaid"+europeanaId+"&tag="+tag, null, UserModification.class).getBody();
	}

}
