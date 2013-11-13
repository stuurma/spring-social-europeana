package org.springframework.social.europeana.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.europeana.api.Europeana;
import org.springframework.social.europeana.api.model.Profile;

public class EuropeanaAdaptor implements ApiAdapter<Europeana> {

	@Override
	public boolean test(Europeana europeana) {
		try {
			europeana.profileOperations().getProfile();
            return true;
        } catch (ApiException e) {
            return false;
        }
	}

	@Override
	public void setConnectionValues(Europeana europeana, ConnectionValues values) {
		Profile profile = europeana.profileOperations().getProfile();
		values.setProviderUserId(profile.getEmail());
		values.setDisplayName(profile.getUserName());
	}

	@Override
	public UserProfile fetchUserProfile(Europeana europeana) {
		Profile profile = europeana.profileOperations().getProfile();
		return new UserProfileBuilder().setName(profile.getEmail()).setUsername(profile.getUserName()).build();
	}

	@Override
	public void updateStatus(Europeana api, String message) {
		// ignore, not supported by Europeana API
	}

}
