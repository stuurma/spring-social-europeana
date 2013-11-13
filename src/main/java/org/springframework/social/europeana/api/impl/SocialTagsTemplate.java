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
	public TagResults getSocialTagsByEuropeanaId(String europeanaId) {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json?europeanaid="+europeanaId), TagResults.class);
	}

	@Override
	public TagResults getSocialTagsByTag(String tag) {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json?tag="+tag), TagResults.class);
	}
	
	@Override
	public TagCloudResults getSocialTagCloud() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("tag.json?action=TAGCLOUD"), TagCloudResults.class);
	}
	
	@Override
	public UserModification saveSocialTag(String europeanaId, String tag) {
		requireUserAuthorization();
		return restTemplate.postForEntity(buildUri("tag.json?europeanaid"+europeanaId+"&tag="+tag), null, UserModification.class).getBody();
	}

	@Override
	public void deleteByTagId(Long tagId) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("tag.json?tagid="+tagId));
	}

	@Override
	public void deleteByEuropeanaId(String europeanaId) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("tag.json?europeanaid="+europeanaId));
	}

	@Override
	public void deleteByTag(String tag) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("tag.json?tag="+tag));
	}

}
