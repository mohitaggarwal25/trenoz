package com.trenoz.services.authentication.model.request;

public class RESTCredential{

	private String userId;
	private String password;
	private String passPhrase;

	public RESTCredential() {
	}

	/**
	 * @param userId
	 * @param password
	 * @param passPhrase
	 */
	public RESTCredential(String userId, String password, String passPhrase) {
		this.userId = userId;
		this.password = password;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
