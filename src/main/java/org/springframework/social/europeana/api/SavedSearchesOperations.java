package org.springframework.social.europeana.api;

import org.springframework.social.europeana.api.model.SavedSearchResults;
import org.springframework.social.europeana.api.model.UserModification;

public interface SavedSearchesOperations {
	
	SavedSearchResults getSavedSearches();
	
	UserModification addSavedSearch(String query, String[] refinements, Long start);

	void deleteBySavedSearchId(Long searchId);
}
