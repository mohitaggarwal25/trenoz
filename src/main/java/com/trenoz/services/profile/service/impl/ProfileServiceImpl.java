package com.trenoz.services.profile.service.impl;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trenoz.services.profile.data.ProfileTools;
import com.trenoz.services.profile.model.beans.User;
import com.trenoz.services.profile.service.ProfileService;
import com.trenoz.services.security.PasswordHasher;

@Singleton
@Service
public class ProfileServiceImpl implements ProfileService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileServiceImpl.class);
	@Autowired
	private ProfileTools profileTools;

	@Autowired
	private PasswordHasher passwordHasher;

	public String createUser(User user) {
		System.out.println(generatePassPhrase(user.getEmail(), user.getPassword()));
		profileTools.create(user);
		return "done";
	}

	private String generatePassPhrase(String login, String password) {
		return passwordHasher.encryptPassword(login + password);
	}
}
