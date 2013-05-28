package net.eledge.springsocial.europeana.connect;

import net.eledge.springsocial.europeana.api.Europeana;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

public class EuropeanaAdaptor implements ApiAdapter<Europeana> {

	public boolean test(Europeana api) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setConnectionValues(Europeana api, ConnectionValues values) {
		// TODO Auto-generated method stub
		
	}

	public UserProfile fetchUserProfile(Europeana api) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStatus(Europeana api, String message) {
		// TODO Auto-generated method stub
		
	}

}
