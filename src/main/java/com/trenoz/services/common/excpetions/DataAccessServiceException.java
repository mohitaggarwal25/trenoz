package com.trenoz.services.common.excpetions;

import com.trenoz.services.common.model.response.RESTError;

public class DataAccessServiceException extends RestServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3165761041517144225L;
	/**
	 * ErrorCode of the error
	 */
	private RESTError restError;

	/**
	 * 
	 */
	public DataAccessServiceException() {
	}

	/**
	 * @param message
	 */
	public DataAccessServiceException(String message) {
		super(message);
	}

	/**
	 * @param restError
	 *            the object
	 */
	public DataAccessServiceException(RESTError restError) {
		super(restError.getMessage(), restError.getCode());
		this.restError = restError;
	}

	/**
	 * @param message
	 * @param errorCode
	 */
	public DataAccessServiceException(String message, String errorCode) {
		super(message, errorCode);
		restError.setCode(errorCode);
		restError.setMessage(message);
	}

	/**
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public DataAccessServiceException(String message, Throwable cause, String errorCode) {
		super(message, cause, errorCode);
		restError.setCode(errorCode);
		restError.setMessage(message);
	}
}