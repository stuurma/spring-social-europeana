package org.springframework.social.europeana.api.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_EMPTY)
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
