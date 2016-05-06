package com.trenoz.services.profile.holder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.trenoz.services.profile.constants.ProfileConstants;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProfileInfoHolder {

	private Map<String, Object> profileInfo = new HashMap<>();

	/**
	 * @return the profileInfo
	 */
	public Map<String, Object> getProfileInfo() {
		return profileInfo;
	}

	/**
	 * @param profileInfo
	 *            the profileInfo to set
	 */
	public void setProfileInfo(Map<String, Object> profileInfo) {
		this.profileInfo = profileInfo;
	}

	/**
	 * @return false when the profile is inTransient (profileInfo contains
	 *         profileId)
	 */
	public boolean isTransient() {
		return profileInfo.get(ProfileConstants.PROFILE_ID) == null;
	}

	/**
	 * @param profileId
	 *            sets the profileId
	 */
	public void setDataSource(String profileId) {
		profileInfo.put(ProfileConstants.PROFILE_ID, profileId);
	}
}
