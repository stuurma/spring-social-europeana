package org.springframework.social.europeana.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.europeana.api.Europeana;
import org.springframework.social.europeana.api.Profile;

public class EuropeanaAdaptor implements ApiAdapter<Europeana> {

	public boolean test(Europeana europeana) {
		try {
			europeana.profileOperations().getProfile();
            return true;
        } catch (ApiException e) {
            return false;
        }
	}

	public void setConnectionValues(Europeana europeana, ConnectionValues values) {
		// TODO Auto-generated method stub
		
	}

	public UserProfile fetchUserProfile(Europeana europeana) {
		Profile profile = europeana.profileOperations().getProfile();
		return new UserProfileBuilder().setName(profile.getEmail()).setUsername(profile.getUserName()).build();
	}

	public void updateStatus(Europeana api, String message) {
		// ignore, not supported by Europeana API
	}

}
