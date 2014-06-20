package org.springframework.social.europeana.api.model.abstracts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Willem-Jan Boogerd <www.eledge.net/contact>
 */
@JsonSerialize
@JsonInclude(Include.NON_EMPTY)
public abstract class AbstractSearchResults<T> extends ApiResponse {
	private static final long serialVersionUID = -7819738532192065506L;

	public long itemsCount;

	public long totalResults;

	public List<T> items;
	
	// GETTERS & SETTERS

	public long getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public long getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(long totalResults) {
		this.totalResults = totalResults;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

}
