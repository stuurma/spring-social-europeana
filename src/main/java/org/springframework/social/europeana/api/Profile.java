package org.springframework.social.europeana.api;

import java.util.Date;

public class Profile extends ApiResponse {
	
	private String email;

	private String userName;

	private Date registrationDate;

	private Date lastLogin;

	private String firstName;

	private String lastName;

	private String company;

	private String country;

	private String phone;

	private String address;

	private String website;

	private String fieldOfWork;
	
	private int nrOfSavedItems;
	
	private int nrOfSavedSearches;
	
	private int nrOfSocialTags;
	
	// GETTERS & SETTERS

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFieldOfWork() {
		return fieldOfWork;
	}

	public void setFieldOfWork(String fieldOfWork) {
		this.fieldOfWork = fieldOfWork;
	}

	public int getNrOfSavedItems() {
		return nrOfSavedItems;
	}

	public void setNrOfSavedItems(int nrOfSavedItems) {
		this.nrOfSavedItems = nrOfSavedItems;
	}

	public int getNrOfSavedSearches() {
		return nrOfSavedSearches;
	}

	public void setNrOfSavedSearches(int nrOfSavedSearches) {
		this.nrOfSavedSearches = nrOfSavedSearches;
	}

	public int getNrOfSocialTags() {
		return nrOfSocialTags;
	}

	public void setNrOfSocialTags(int nrOfSocialTags) {
		this.nrOfSocialTags = nrOfSocialTags;
	}
	
	

}
