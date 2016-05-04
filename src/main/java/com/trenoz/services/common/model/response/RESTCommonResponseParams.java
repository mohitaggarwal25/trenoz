package com.trenoz.services.common.model.response;

public class RESTCommonResponseParams {

	private RESTError error;

	public RESTCommonResponseParams() {
	}

	/**
	 * @param error
	 */
	public RESTCommonResponseParams(RESTError error) {
		this.error = error;
	}

	/**
	 * @return the error
	 */
	public RESTError getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(RESTError error) {
		this.error = error;
	}

}
