package com.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


public class RegistrationService {

	@Autowired
	private RegistrationDAO registrationDao;
	
	@Bean
	public RegistrationService registrationService(){
		return new RegistrationService();
	}

	public boolean createRegistration(Registration registration) {
		boolean isSaved;

		if (registrationDao.createRegistration(registration) == true) {
			isSaved = true;

		} else {
			isSaved = false;
		}
		return isSaved;
	}

}
