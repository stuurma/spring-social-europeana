/*
 * Copyright 2007-2012 The Europeana Foundation
 *
 *  Licenced under the EUPL, Version 1.1 (the "Licence") and subsequent versions as approved 
 *  by the European Commission;
 *  You may not use this work except in compliance with the Licence.
 *  
 *  You may obtain a copy of the Licence at:
 *  http://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under 
 *  the Licence is distributed on an "AS IS" basis, without warranties or conditions of 
 *  any kind, either express or implied.
 *  See the Licence for the specific language governing permissions and limitations under 
 *  the Licence.
 */

package org.springframework.social.europeana.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Willem-Jan Boogerd <www.eledge.net/contact>
 */
@JsonSerialize
@JsonInclude(Include.NON_EMPTY)
public class SavedSearch {

	public Long id;

	public String query;

	public String queryString;

	public Date dateSaved;

	public Long getId() {
		return id;
	}

	public String getQuery() {
		return query;
	}

	public String getQueryString() {
		return "query="+queryString;
	}

	public Date getDateSaved() {
		return dateSaved;
	}
}
