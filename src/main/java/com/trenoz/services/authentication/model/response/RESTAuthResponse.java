package com.trenoz.services.authentication.model.response;

import com.trenoz.services.common.model.response.RESTCommonResponseParams;

public class RESTAuthResponse extends RESTCommonResponseParams {

	private String message;

	public RESTAuthResponse() {
	}

	/**
	 * @param message
	 */
	public RESTAuthResponse(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getmessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setmessage(String message) {
		this.message = message;
	}

}
