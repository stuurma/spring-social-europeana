package org.springframework.social.europeana.api.model.abstracts;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Willem-Jan Boogerd <www.eledge.net/contact>
 */
@JsonSerialize
@JsonInclude(Include.NON_EMPTY)
public abstract class UserObject {

	public Long id;
	
	public String europeanaId;

	public String guid;

	public String link;
	
	public String title;

	public String edmPreview;

	public String type;

	public Date dateSaved;
	
	// GETTERS & SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEuropeanaId() {
		return europeanaId;
	}

	public void setEuropeanaId(String europeanaId) {
		this.europeanaId = europeanaId;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdmPreview() {
		return edmPreview;
	}

	public void setEdmPreview(String edmPreview) {
		this.edmPreview = edmPreview;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateSaved() {
		return dateSaved;
	}

	public void setDateSaved(Date dateSaved) {
		this.dateSaved = dateSaved;
	}

}
