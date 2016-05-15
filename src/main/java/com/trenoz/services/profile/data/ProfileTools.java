package com.trenoz.services.profile.data;

import com.trenoz.services.profile.model.beans.User;

public interface ProfileTools {
	public void create(User user);

	public void updateInfo(User user);

	public void createUpdateContact(User user);
}