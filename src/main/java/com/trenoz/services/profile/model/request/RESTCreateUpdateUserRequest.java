package com.trenoz.services.profile.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trenoz.services.common.model.request.RESTCommonRequestParams;
import com.trenoz.services.profile.model.beans.User;

public class RESTCreateUpdateUserRequest extends RESTCommonRequestParams {

	@JsonProperty("user")
	private User user;

	/**
	 * @param user
	 */
	public RESTCreateUpdateUserRequest(User user) {
		this.user = user;
	}

	/**
	 * default
	 */
	public RESTCreateUpdateUserRequest() {
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
