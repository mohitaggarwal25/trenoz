package com.trenoz.services.common.model.request;

public class RESTCommonRequestParams extends RESTCommonUserRequestParams {

	private String correlationId;
	private String channel;
	private String sessionId;

	public RESTCommonRequestParams() {
	}

	/**
	 * @param correlationId
	 * @param channel
	 */
	public RESTCommonRequestParams(String correlationId, String channel, String sessionId) {
		this.correlationId = correlationId;
		this.channel = channel;
		this.sessionId = sessionId;
	}

	/**
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * @param correlationId
	 *            the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId
	 *            the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
