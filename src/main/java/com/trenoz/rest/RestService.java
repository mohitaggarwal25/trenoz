package com.trenoz.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

public abstract class RestService <T, V> {
	
	static Logger log = Logger.getLogger(RestService.class.getName());
	
	/*public T processRequest(V request, String body, String context, String userName)
	{
		Date startDate = new Date();
		final String timestamp = new java.text.SimpleDateFormat("HH:mm:ss").format(startDate);			
		
		log.info("Call Start Time :-"+timestamp);
		
		String atgServiceXML = null;
		
		String atgResponseXML = null;
		
		String responseXMLForClient = "Something Wrong !! Check Logs. ";
		
		validateRequest();	
		
		boolean isSession = resolveSession(userName,context);
		        
		if(isSession)
		{
			atgServiceXML = transformRequest(body,context);
			
			log.info("Payload From Client :-");
			System.out.println(body);
			
			log.info("Payload After XSL Conversion :-");
			System.out.println(atgServiceXML);
			
			atgResponseXML = callServiceProvider(atgServiceXML,userName,context); 
			
			log.info("Response From ATG :-\n"+atgResponseXML);
			

			if(atgResponseXML!=null)
			{
				updateSessionInfo(context,userName);
				responseXMLForClient = transformResponse(atgResponseXML,context,userName);
			}
		}

		
		log.info("Response For Client After Conversion :-");
		
		System.out.println(responseXMLForClient);
		
		Date endDate = new Date();
		final String endTimestamp = new java.text.SimpleDateFormat("HH:mm:ss").format(endDate);			
		log.info("Call End Time :- " +endTimestamp);
		
		long diff = endDate.getTime() - startDate.getTime();
		
		log.info("Total Time Taken :"+ diff+" miliseconds");
		 
		return responseXMLForClient;
	}

	public void validateRequest() {
		
		getValidator().validate();
	}

	public String transformResponse(String atgResponseXML, String context, String userName) {
		return getResponseTransformManager().transform(atgResponseXML,context,userName);
	}

	public void updateSessionInfo(String context, String userName) {
		getSessionResolver().update(context,userName);
		
		
		
	}

	public String callServiceProvider(String atgServiceXML, String ipAddress, String context) {
		return getCallServiceProvider().callService(atgServiceXML,ipAddress,context);
	}

	public String transformRequest(String body, String context) {
		return getRequestTransformManager().transform(body,context);	
	}

	public boolean resolveSession(String userName, String context) {
		return getSessionResolver().resolve(userName,context);
		
	}

    public abstract Validator getValidator(); 
    
    public abstract SessionResolver getSessionResolver(); 
    
    public abstract RequestTransformManager getRequestTransformManager();
    
    public abstract CallServiceProvider getCallServiceProvider();
    
    public abstract ResponseTransformManager getResponseTransformManager();

	
*/
}


