package com.vidyo.portalapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.vidyo.portalapp.wsdl.CreateScheduledRoomRequest;
import com.vidyo.portalapp.wsdl.CreateScheduledRoomResponse;

@Service
public class SoapClient {
	
	@Autowired
	private WebServiceTemplate template;
	
	public CreateScheduledRoomResponse createScheduledRoom(CreateScheduledRoomRequest request) {
		CreateScheduledRoomResponse response = (CreateScheduledRoomResponse) template.marshalSendAndReceive(
				"https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService", request);
		return response;
	}
	
}
