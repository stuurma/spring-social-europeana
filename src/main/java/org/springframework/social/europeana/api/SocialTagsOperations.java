package org.springframework.social.europeana.api;

import org.springframework.social.europeana.api.model.TagCloudResults;
import org.springframework.social.europeana.api.model.TagResults;

public interface SocialTagsOperations {
	
	TagResults getSocialTags();
	
	TagCloudResults getSocialTagCloud();

}
