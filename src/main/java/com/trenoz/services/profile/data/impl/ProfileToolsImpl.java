package com.trenoz.services.profile.data.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.trenoz.services.profile.constants.ProfileConstants;
import com.trenoz.services.profile.data.ProfileTools;
import com.trenoz.services.profile.excpetions.ProfileCreateUserException;
import com.trenoz.services.profile.model.beans.User;

@Component
public class ProfileToolsImpl implements ProfileTools {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void create(User user) {
		Query query = new Query();
		query.addCriteria(Criteria.where(ProfileConstants.CRITERIA_EMAIL).is(user.getEmail()));
		Iterator<User> u = mongoTemplate.find(query, User.class).iterator();

		String date = new SimpleDateFormat(ProfileConstants.DATE_FORMAT_DD_MM_YYYY_HH_MM_SS).format(new Date());
		if (u.hasNext()) {
			User dbUser = u.next();
			if (!dbUser.isRegistered()) {
				user.setId(dbUser.getId());
				user.setModifiedDate(date);

				Set<String> sessionIds = dbUser.getSessionIds();
				if (sessionIds == null) {
					sessionIds = new HashSet<String>();
				}
				sessionIds.addAll(user.getSessionIds());
				user.setSessionIds(sessionIds);

				Set<String> phoneNos = dbUser.getPhoneNos();
				if (phoneNos == null) {
					phoneNos = new HashSet<String>();
				}
				phoneNos.addAll(user.getPhoneNos());
				user.setPhoneNos(phoneNos);

				mongoTemplate.save(user);
			} else {
				throw new ProfileCreateUserException("User already exists", "PROF1001");
			}
		} else {
			user.setCreatedDate(date);
			mongoTemplate.save(user);
		}
	}

	@Override
	public void createUpdateContact(User contact) {
		Query query = new Query();
		query.addCriteria(Criteria.where(ProfileConstants.CRITERIA_EMAIL).is(contact.getEmail()));
		Iterator<User> c = mongoTemplate.find(query, User.class).iterator();

		String date = new SimpleDateFormat(ProfileConstants.DATE_FORMAT_DD_MM_YYYY_HH_MM_SS).format(new Date());
		if (c.hasNext()) {
			User dbContact = c.next();
			contact.setId(dbContact.getId());
			contact.setModifiedDate(date);

			Set<String> sessionIds = dbContact.getSessionIds();
			if (sessionIds == null) {
				sessionIds = new HashSet<String>();
			}
			sessionIds.addAll(contact.getSessionIds());
			contact.setSessionIds(sessionIds);

			Set<String> phoneNos = dbContact.getPhoneNos();
			if (phoneNos == null) {
				phoneNos = new HashSet<String>();
			}
			phoneNos.addAll(contact.getPhoneNos());
			contact.setPhoneNos(phoneNos);

			mongoTemplate.save(contact);
		} else {
			contact.setCreatedDate(date);
			mongoTemplate.save(contact);
		}
	}

	@Override
	public void updateInfo(User user) {
		// TODO Auto-generated method stub
		// now user object got the created id.
		System.out.println("1. user : " + user);

		// query to search user
		Query searchUserQuery = new Query(Criteria.where("email").is("mkyong"));

		// find the saved user again.
		User savedUser = mongoTemplate.findOne(searchUserQuery, User.class);
		System.out.println("2. find - savedUser : " + savedUser);

		// update password
		mongoTemplate.updateFirst(searchUserQuery, Update.update("password", "new password"), User.class);

		// find the updated user object
		User updatedUser = mongoTemplate.findOne(new Query(Criteria.where("email").is("mkyong")), User.class);

		System.out.println("3. updatedUser : " + updatedUser);

		// delete
		// mongoTemplate.remove(searchUserQuery, User.class);

		// List, it should be empty now.
		List<User> listUser = mongoTemplate.findAll(User.class);
		System.out.println("4. Number of user = " + listUser.size());
	}

}