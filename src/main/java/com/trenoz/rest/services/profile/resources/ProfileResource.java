package com.trenoz.rest.services.profile.resources;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trenoz.services.authentication.model.request.RESTAuthRequest;
import com.trenoz.services.authentication.model.response.RESTAuthResponse;
import com.trenoz.services.common.model.response.RESTError;
import com.trenoz.services.profile.excpetions.ProfileCreateUpdateContactException;
import com.trenoz.services.profile.excpetions.ProfileCreateUserException;
import com.trenoz.services.profile.holder.ProfileInfoHolder;
import com.trenoz.services.profile.model.request.RESTCreateUpdateContactRequest;
import com.trenoz.services.profile.model.request.RESTCreateUserRequest;
import com.trenoz.services.profile.model.response.RESTProfileResponse;
import com.trenoz.services.profile.service.ProfileService;

@Component
@Path("/profile")
public class ProfileResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileResource.class);

	@Autowired
	private ProfileService profileService;

	@Autowired
	private ProfileInfoHolder profileHolder;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RESTAuthResponse getProfile(@Context final HttpServletRequest request, RESTAuthRequest authRequest) {

		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
		return response;
	}

	@POST
	@Path("/createUpdateContact")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUpdateContact(@Context final HttpServletRequest request, final RESTCreateUpdateContactRequest requestContact) {
		Response response = null;
		RESTProfileResponse responseEntity = new RESTProfileResponse();
		if (request.getRequestedSessionId() == null || !request.isRequestedSessionIdValid()) {
			LOGGER.info("User Session not found");
			requestContact.setSessionId(request.getSession(true).getId());
		}
		System.out.println(request.getSession(true).getId() + " " + new Date());
		try {
			if (requestContact != null && requestContact.getUser() != null) {
				responseEntity.setmessage(profileService.createUpdateContact(requestContact));
				response = Response.status(Response.Status.CREATED).entity(responseEntity).build();
			} else {
				throw new ProfileCreateUpdateContactException("Contact Object null", "PROF1002");
			}
		} catch (ProfileCreateUpdateContactException pcue) {
			LOGGER.error("ProfileCreateUpdateContactException occurred: {}", pcue.getMessage());
			RESTError error = new RESTError(pcue.getErrorCode(), pcue.getMessage());
			if (pcue.getCause() != null) {
				error.setDebugMessage(pcue.getCause().toString());
			}
			responseEntity.setError(error);
			response = Response.status(Response.Status.BAD_REQUEST).entity(responseEntity).build();
		} catch (Exception e) {
			LOGGER.error("Exception occurred: ", e);
			RESTError error = new RESTError("PROF4001", "Error creating contact", e.getMessage());
			responseEntity.setError(error);
			response = Response.status(Response.Status.BAD_REQUEST).entity(responseEntity).build();
		}
		return response;
	}

	@POST
	@Path("/createUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(@Context final HttpServletRequest request, final RESTCreateUserRequest requestUser) {
		Response response = null;
		RESTProfileResponse responseEntity = new RESTProfileResponse();
		if (request.getRequestedSessionId() == null || !request.isRequestedSessionIdValid()) {
			LOGGER.info("User Session not found");
			requestUser.setSessionId(request.getSession(true).getId());
		}
		System.out.println(request.getSession(true).getId() + " " + new Date());
		try {
			if (requestUser != null && requestUser.getUser() != null) {
				responseEntity.setmessage(profileService.createUser(requestUser));
				response = Response.status(Response.Status.CREATED).entity(responseEntity).build();
			} else {
				throw new ProfileCreateUserException("User Object null", "PROF1002");
			}
		} catch (ProfileCreateUserException pcue) {
			LOGGER.error("ProfileCreateUserException occurred: {}", pcue.getMessage());
			RESTError error = new RESTError(pcue.getErrorCode(), pcue.getMessage());
			if (pcue.getCause() != null) {
				error.setDebugMessage(pcue.getCause().toString());
			}
			responseEntity.setError(error);
			response = Response.status(Response.Status.BAD_REQUEST).entity(responseEntity).build();
		} catch (Exception e) {
			LOGGER.error("Exception occurred: ", e);
			RESTError error = new RESTError("PROF2001", "Error creating user", e.getMessage());
			responseEntity.setError(error);
			response = Response.status(Response.Status.BAD_REQUEST).entity(responseEntity).build();
		}
		if(profileHolder != null)
			profileHolder.isTransient();
		return response;
	}

	@POST
	@Path("/updateInfo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RESTAuthResponse updateProfile(@Context final HttpServletRequest request, RESTAuthRequest authRequest) {
		if (request.getRequestedSessionId() != null && !request.isRequestedSessionIdValid()) {

		}

		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
		return response;
	}
}
