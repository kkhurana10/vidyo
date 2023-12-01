/**
 * 
 */
package com.vidyo.moderatorapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * 
 */
@Configuration
public class BeanConfig {

	@Bean
	Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.vidyo.moderatorapp.wsdl");
		return marshaller;
	}

	@Bean
	WebServiceTemplate webService(Jaxb2Marshaller marshaller) {
		WebServiceTemplate ws = new WebServiceTemplate();
		ws.setMarshaller(marshaller());
		ws.setUnmarshaller(marshaller());
		ws.setDefaultUri("https://natantest.alpha.vidyo.com/services/v1_1/VidyoPortalUserService");
//		HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
//		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("portal2", "1234");
//		messageSender.setCredentials(credentials); // Set your username and password
		
		ws.setMessageSender(new WebServiceMessageSenderWithAuth());

		return ws;
	}

//	
//	@Bean
//	WebServiceMessageSender messageSender(Credentials credentials) throws Exception{
//	    HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
//	    messageSender.setCredentials(credentials);
//	    return messageSender;
//	}
//
//	@Bean
//	Credentials credentials(){
//	    UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("portal2", "1234");
//	    return credentials;
//
//	}
}
