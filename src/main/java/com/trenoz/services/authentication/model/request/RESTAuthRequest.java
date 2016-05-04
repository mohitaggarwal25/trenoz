package com.trenoz.services.authentication.model.request;

import com.trenoz.services.common.model.request.RESTCommonRequestParams;

public class RESTAuthRequest extends RESTCommonRequestParams {

	private RESTCredential credential;

	public RESTAuthRequest() {
	}

	/**
	 * @param credential
	 */
	public RESTAuthRequest(RESTCredential credential) {
		this.credential = credential;
	}

	/**
	 * @return the credential
	 */
	public RESTCredential getCredential() {
		return credential;
	}

	/**
	 * @param credential
	 *            the credential to set
	 */
	public void setCredential(RESTCredential credential) {
		this.credential = credential;
	}
}
