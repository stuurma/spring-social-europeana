package org.springframework.social.europeana.api.model.abstracts;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class ApiResponse implements Serializable {
	private static final long serialVersionUID = -1144141526716028555L;

	public boolean success;

	public String error;
	
	// GETTERS & SETTERS

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
