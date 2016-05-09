package com.trenoz.services.profile.data.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.trenoz.services.profile.data.ProfileTools;
import com.trenoz.services.profile.model.beans.User;

@Component
public class ProfileToolsImpl implements ProfileTools {
	@Autowired
	private MongoTemplate mongoTemplate;

	public void create(User user) {

		user = new User("mkyong", "password123");

		// save
		mongoTemplate.save(user);

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
//		mongoTemplate.remove(searchUserQuery, User.class);

		// List, it should be empty now.
		List<User> listUser = mongoTemplate.findAll(User.class);
		System.out.println("4. Number of user = " + listUser.size());

	}

}