/**
 * 
 */
package com.vidyo.moderatorapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllRequest;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllResponse;
import com.vidyo.moderatorapp.wsdl.LogInRequest;
import com.vidyo.moderatorapp.wsdl.LogInResponse;

/**
 * 
 */
@Service
public class SoapClient {

//	@Autowired
//	private Jaxb2Marshaller marshaller;

	@Autowired
	private WebServiceTemplate template;

	public LogInResponse getLogin(LogInRequest request) {
//		template = new WebServiceTemplate(marshaller);
		LogInResponse response = (LogInResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}

	public DisconnectConferenceAllResponse disconnectAll(DisconnectConferenceAllRequest request) {
//		template = new WebServiceTemplate(marshaller);
		DisconnectConferenceAllResponse response = (DisconnectConferenceAllResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}
}
