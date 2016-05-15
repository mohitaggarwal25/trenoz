package com.trenoz.services.profile.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trenoz.services.common.model.request.RESTCommonRequestParams;
import com.trenoz.services.profile.model.beans.User;

public class RESTCreateUpdateContactRequest extends RESTCommonRequestParams {

	@JsonProperty("contact")
	private User user;

	/**
	 * @param user
	 */
	public RESTCreateUpdateContactRequest(User user) {
		this.user = user;
	}

	/**
	 * default
	 */
	public RESTCreateUpdateContactRequest() {
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
