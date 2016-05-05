package com.trenoz.rest.services.profile;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.trenoz.services.authentication.model.request.RESTAuthRequest;
import com.trenoz.services.authentication.model.response.RESTAuthResponse;

@Path("/profile")
public class ProfileService {

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
	public RESTAuthResponse create(@Context final HttpServletRequest request,
			RESTAuthRequest authRequest) {
		if (request.getRequestedSessionId() != null && !request.isRequestedSessionIdValid()) {
			
		}

		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
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
