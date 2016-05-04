package com.trenoz.services.common.model.request;

public class RESTCommonUserRequestParams{

	private String userId;
	private String passPhrase;

	public RESTCommonUserRequestParams() {
	}

	/**
	 * @param userId
	 * @param password
	 * @param passPhrase
	 */
	public RESTCommonUserRequestParams(String userId, String passPhrase) {
		this.userId = userId;
		this.passPhrase = passPhrase;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the passPhrase
	 */
	public String getPassPhrase() {
		return passPhrase;
	}

	/**
	 * @param passPhrase the passPhrase to set
	 */
	public void setPassPhrase(String passPhrase) {
		this.passPhrase = passPhrase;
	}


}
