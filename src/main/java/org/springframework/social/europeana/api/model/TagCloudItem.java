package org.springframework.social.europeana.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonInclude(Include.NON_EMPTY)
public class TagCloudItem {
	
	private String label;
	
	private long count;
	
	public TagCloudItem(String label, Long count) {
		this.label = label;
		this.count = count.longValue();
	}
	
	public String getLabel() {
		return label;
	}
	
	public long getCount() {
		return count;
	}

}
