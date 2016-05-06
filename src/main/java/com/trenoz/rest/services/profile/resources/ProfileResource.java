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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trenoz.services.authentication.model.request.RESTAuthRequest;
import com.trenoz.services.authentication.model.response.RESTAuthResponse;
import com.trenoz.services.profile.model.beans.User;
import com.trenoz.services.profile.service.ProfileService;

@Component
@Path("/profile")
public class ProfileResource {
	

	@Autowired
	private ProfileService profileService;


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RESTAuthResponse getProfile(@Context final HttpServletRequest request,
			RESTAuthRequest authRequest) {
		
		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
		return response;
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(@Context final HttpServletRequest request,
			RESTAuthRequest authRequest) {
		if (request.getRequestedSessionId() != null && !request.isRequestedSessionIdValid()) {
			
		}

		System.out.println(request.getSession(true).getId() + " " + new Date());
		Response response = Response.ok().entity(profileService.createUser(
				new User(authRequest.getCredential().getUserId(), authRequest.getCredential().getPassword()))).build();
		return response;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RESTAuthResponse updateProfile(@Context final HttpServletRequest request,
			RESTAuthRequest authRequest) {
		if (request.getRequestedSessionId() != null && !request.isRequestedSessionIdValid()) {
			
		}

		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
		return response;
	}
}
