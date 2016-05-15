package com.trenoz.services.profile.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trenoz.services.profile.constants.ProfileConstants;
import com.trenoz.services.profile.data.ProfileTools;
import com.trenoz.services.profile.excpetions.ProfileCreateUpdateContactException;
import com.trenoz.services.profile.excpetions.ProfileCreateUserException;
import com.trenoz.services.profile.holder.ProfileInfoHolder;
import com.trenoz.services.profile.model.beans.User;
import com.trenoz.services.profile.model.request.RESTCreateUpdateContactRequest;
import com.trenoz.services.profile.model.request.RESTCreateUserRequest;
import com.trenoz.services.profile.model.request.RESTUpdateInfoRequest;
import com.trenoz.services.profile.service.ProfileService;
import com.trenoz.services.security.PasswordHasher;

@Singleton
@Service
public class ProfileServiceImpl implements ProfileService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileServiceImpl.class);
	@Autowired
	private ProfileTools profileTools;

	@Autowired
	private ProfileInfoHolder profileHolder;

	@Autowired
	private PasswordHasher passwordHasher;

	public String createUser(final RESTCreateUserRequest requestUser) {
		User user = requestUser.getUser();

		Set<String> sessionIds = new HashSet<String>();
		sessionIds.add(requestUser.getSessionId());
		user.setSessionIds(sessionIds);

		// setting the passPhrase for the User
		final String passPhrase = generatePassPhrase(user.getEmail(), user.getPassword());
		LOGGER.info("PassPhrase generated");
		user.setPassPhrase(passPhrase);

		// mark user as registered
		user.setRegistered(true);

		try {
			profileTools.create(user);
		} catch (Exception e) {
			if (e instanceof ProfileCreateUserException) {
				throw e;
			} else {
				LOGGER.error("Exception occurred: ", e);
				throw new ProfileCreateUserException("Error creating user", "PROF4001", e);
			}
		}
		if (profileHolder != null) {
			profileHolder.put(ProfileConstants.PROFILE_ID, user.getId());
		}
		return "User Account created successfully";
	}

	private String generatePassPhrase(String login, String password) {
		return passwordHasher.encryptPassword(login + password);
	}

	@Override
	public String createUpdateContact(RESTCreateUpdateContactRequest requestContact) {
		User user = requestContact.getUser();

		Set<String> sessionIds = new HashSet<String>();
		sessionIds.add(requestContact.getSessionId());
		user.setSessionIds(sessionIds);

		try {
			profileTools.createUpdateContact(user);
		} catch (Exception e) {
			if (e instanceof ProfileCreateUpdateContactException) {
				throw e;
			} else {
				LOGGER.error("Exception occurred: ", e);
				throw new ProfileCreateUpdateContactException("Error creating Contact", "PROF3001", e);
			}
		}
		return "User Account created successfully";
	}

	@Override
	public String UpdateInfo(RESTUpdateInfoRequest requestContact) {
		// TODO Auto-generated method stub
		return null;
	}
}
