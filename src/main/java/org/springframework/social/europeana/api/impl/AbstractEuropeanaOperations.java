package org.springframework.social.europeana.api.impl;

import java.net.URI;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractEuropeanaOperations {

	private static final LinkedMultiValueMap<String, String> EMPTY_PARAMETERS = new LinkedMultiValueMap<String, String>();
	public static final String API_URL_BASE = "http://europeana.eu/api/user/";
	
	private final boolean isAuthorized;
	protected final RestTemplate restTemplate;

	public AbstractEuropeanaOperations(RestTemplate restTemplate, boolean isAuthorized) {
		this.restTemplate = restTemplate;
		this.isAuthorized = isAuthorized;
	}

	protected void requireUserAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("europeana");
		}
	}

	protected URI buildUri(String path) {
		return buildUri(path, EMPTY_PARAMETERS);
	}

	protected URI buildUri(String path, String parameterName, String parameterValue) {
		return URIBuilder.fromUri(API_URL_BASE + path).queryParam(parameterName, parameterValue).build();
	}

	protected URI buildUri(String path, MultiValueMap<String, String> parameters) {
		return URIBuilder.fromUri(API_URL_BASE + path).queryParams(parameters).build();
	}

}
