package com.trenoz.services.common.model.response;

public class RESTError {

	private String code;
	private String message;
	private String debugMessage;

	public RESTError() {
	}

	/**
	 * @param code
	 * @param message
	 * @param debugMessage
	 */
	public RESTError(String code, String message, String debugMessage) {
		this.code = code;
		this.message = message;
		this.debugMessage = debugMessage;
	}

	/**
	 * @param code
	 * @param message
	 */
	public RESTError(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the debugMessage
	 */
	public String getDebugMessage() {
		return debugMessage;
	}

	/**
	 * @param debugMessage
	 *            the debugMessage to set
	 */
	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

}
