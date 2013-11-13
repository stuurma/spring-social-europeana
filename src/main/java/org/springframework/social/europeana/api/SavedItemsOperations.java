package org.springframework.social.europeana.api;

import org.springframework.social.europeana.api.model.SavedItemResults;
import org.springframework.social.europeana.api.model.UserModification;

public interface SavedItemsOperations {

	SavedItemResults getSavedItems();

	SavedItemResults getSavedItemByEuropeanaId(String europeanaId);
	
	UserModification saveItem(String europeanaId);
	
	void deleteBySavedItemId(Long itemId);
	
	void deleteByEuropeanaId(String europeanaId);

	
}
