package com.trenoz.rest.services.authentication.resources;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.trenoz.services.authentication.model.request.RESTAuthRequest;
import com.trenoz.services.authentication.model.response.RESTAuthResponse;

@Component
@Path("/authenticate")
public class AuthenticationResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public RESTAuthResponse authenticate(@Context final HttpServletRequest request,
			RESTAuthRequest authRequest) {
		if (request.getRequestedSessionId() != null && !request.isRequestedSessionIdValid()) {
			
		}

		System.out.println(request.getSession(true).getId() + " " + new Date());
		RESTAuthResponse response = null;
		return response;
	}
}