package com.trenoz.services.profile.service;

import com.trenoz.services.profile.model.request.RESTCreateUpdateContactRequest;
import com.trenoz.services.profile.model.request.RESTCreateUserRequest;
import com.trenoz.services.profile.model.request.RESTUpdateInfoRequest;

public interface ProfileService {

	public String createUser(final RESTCreateUserRequest requestUser);

	public String createUpdateContact(final RESTCreateUpdateContactRequest requestContact);

	public String UpdateInfo(final RESTUpdateInfoRequest requestContact);
}
