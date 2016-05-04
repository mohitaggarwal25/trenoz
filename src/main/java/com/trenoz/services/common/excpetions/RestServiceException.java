package com.trenoz.services.common.excpetions;

public class RestServiceException extends Exception {

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
	 * 
	 */
	public RestServiceException() {
	}

	/**
	 * @param message
	 */
	public RestServiceException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param errorCode
	 */
	public RestServiceException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * @param cause
	 */
	public RestServiceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public RestServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param errorCode
	 */
	public RestServiceException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}
}
