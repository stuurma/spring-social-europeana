package org.springframework.social.europeana.api;

import org.springframework.social.ApiBinding;

public interface Europeana extends ApiBinding {
	
	ProfileOperations profileOperations();
	
	SavedItemsOperations savedItemsOperations();
	
	SavedSearchesOperations savedSearchesOperations();
	
	SocialTagsOperations socialTagsOperations();

}
