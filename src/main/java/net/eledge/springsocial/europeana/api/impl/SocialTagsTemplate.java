package net.eledge.springsocial.europeana.api.impl;

import net.eledge.springsocial.europeana.api.SocialTagsOperations;
import net.eledge.springsocial.europeana.api.abstracts.AbstractEuropeanaOperations;

import org.springframework.web.client.RestTemplate;

public class SocialTagsTemplate extends AbstractEuropeanaOperations implements SocialTagsOperations {
	
	public SocialTagsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

}
