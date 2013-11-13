package org.springframework.social.europeana.api;

import org.springframework.social.europeana.api.model.TagCloudResults;
import org.springframework.social.europeana.api.model.TagResults;
import org.springframework.social.europeana.api.model.UserModification;

public interface SocialTagsOperations {
	
	TagResults getSocialTags();
	
	TagResults getSocialTagsByEuropeanaId(String europeanaId);

	TagResults getSocialTagsByTag(String tag);
	
	TagCloudResults getSocialTagCloud();
	
	UserModification saveSocialTag(String europeanaId, String tag);
	
	void deleteByTagId(Long tagId);
	
	void deleteByEuropeanaId(String europeanaId);
	
	void deleteByTag(String tag);

}
