/**
 * 
 */
package com.vidyo.moderatorapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.vidyo.moderatorapp.wsdl.CreateScheduledRoomRequest;
import com.vidyo.moderatorapp.wsdl.CreateScheduledRoomResponse;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllRequest;
import com.vidyo.moderatorapp.wsdl.DisconnectConferenceAllResponse;
import com.vidyo.moderatorapp.wsdl.LogInRequest;
import com.vidyo.moderatorapp.wsdl.LogInResponse;

/**
 * 
 */
@Service
public class SoapClient {

	@Autowired
	private WebServiceTemplate template;

	public LogInResponse getLogin(LogInRequest request) {
		LogInResponse response = (LogInResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}

	public DisconnectConferenceAllResponse disconnectAll(DisconnectConferenceAllRequest request) {
		DisconnectConferenceAllResponse response = (DisconnectConferenceAllResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}
	
	public CreateScheduledRoomResponse createScheduledRoom(CreateScheduledRoomRequest request) {
		CreateScheduledRoomResponse response = (CreateScheduledRoomResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}
}
