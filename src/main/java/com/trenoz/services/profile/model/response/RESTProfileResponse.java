package com.trenoz.services.profile.model.response;

import com.trenoz.services.common.model.response.RESTCommonResponseParams;

public class RESTProfileResponse extends RESTCommonResponseParams {

	private String passPhrase;

	public RESTProfileResponse() {
	}

	/**
	 * @param message
	 */
	public RESTProfileResponse(String message) {
		this.passPhrase = message;
	}

	/**
	 * @return the message
	 */
	public String getmessage() {
		return passPhrase;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setmessage(String message) {
		this.passPhrase = message;
	}

}
