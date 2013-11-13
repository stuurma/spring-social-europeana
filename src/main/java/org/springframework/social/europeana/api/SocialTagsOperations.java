package org.springframework.social.europeana.api;

import org.springframework.social.europeana.api.model.TagCloudResults;
import org.springframework.social.europeana.api.model.TagResults;
import org.springframework.social.europeana.api.model.UserModification;

public interface SocialTagsOperations {
	
	TagResults getSocialTags();
	
	TagCloudResults getSocialTagCloud();
	
	UserModification saveSocialTag(String europeanaId, String tag);

}
