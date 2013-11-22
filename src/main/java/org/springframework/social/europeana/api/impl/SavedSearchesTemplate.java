package org.springframework.social.europeana.api.impl;

import org.springframework.social.europeana.api.SavedSearchesOperations;
import org.springframework.social.europeana.api.model.SavedSearchResults;
import org.springframework.social.europeana.api.model.UserModification;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

public class SavedSearchesTemplate extends AbstractEuropeanaOperations implements SavedSearchesOperations {
	
	public SavedSearchesTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}
	
	@Override
	public SavedSearchResults getSavedSearches() {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("savedsearch.json"), SavedSearchResults.class);
	}

	@Override
	public UserModification addSavedSearch(String query, String[] refinements, Long start) {
		requireUserAuthorization();
		StringBuilder sb = new StringBuilder("savedsearch.json?query=");
		sb.append(query);
		if ((refinements != null) && (refinements.length > 0)) {
			for (String qf : refinements) {
				if (!StringUtils.isEmpty(qf)) {
					sb.append("&qf=").append(qf);
				}
			}
		}
		if (start != null) {
			sb.append("&start=").append(start);
		}
		return restTemplate.postForEntity(buildUri(sb.toString()), null, UserModification.class).getBody();
	}

	@Override
	public void deleteBySavedSearchId(Long searchId) {
		requireUserAuthorization();
		restTemplate.delete(buildUri("savedsearch.json?searchid="+searchId));
	}

}
