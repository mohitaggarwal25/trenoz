package com.trenoz.services.profile.excpetions;

import com.trenoz.services.common.excpetions.RestServiceException;

public class ProfileCreateUserException extends RestServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8283473270329775443L;
	/**
	 * ErrorCode of the error
	 */
	private String errorCode;

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param message
	 * @param errorCode
	 */
	public ProfileCreateUserException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public ProfileCreateUserException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}
}
