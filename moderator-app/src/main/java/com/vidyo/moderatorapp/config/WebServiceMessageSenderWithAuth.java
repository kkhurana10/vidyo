package com.vidyo.moderatorapp.config;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Base64;

import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

public class WebServiceMessageSenderWithAuth extends HttpUrlConnectionMessageSender {
	
	@Override
	protected void prepareConnection(HttpURLConnection connection)
			throws IOException {
		
		
		
//		BASE64Encoder enc = new BASE64Encoder();
		String userpassword = "portal2:1234";
		String encodedAuthorization = Base64.getEncoder().encodeToString(userpassword.getBytes());
		connection.setRequestProperty("Authorization", "Basic " + encodedAuthorization);

		super.prepareConnection(connection);
	}

}
