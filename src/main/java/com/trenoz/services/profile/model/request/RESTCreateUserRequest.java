package com.trenoz.services.profile.model.request;

import com.trenoz.services.common.model.request.RESTCommonRequestParams;
import com.trenoz.services.profile.model.beans.User;

public class RESTCreateUserRequest extends RESTCommonRequestParams {

	private User user;

	/**
	 * @param user
	 */
	public RESTCreateUserRequest(User user) {
		this.user = user;
	}

	/**
	 * default
	 */
	public RESTCreateUserRequest() {
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
