package com.registration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RegistrationDAO {

	private Session currentSession;
	private SessionFactory sessionFactory;

	public RegistrationDAO() {

	}
	
/**The method saves the registration entity
 * 
 * @param registration
 * @return boolean true if save is successful and false if not
 * @exception throws runtime exception if the saving is not successful 
 */
	public boolean createRegistration(Registration registration) {

		boolean isSaved;
		currentSession = sessionFactory.openSession();// opens a session
		try {
			currentSession.save(registration);// save registration
			isSaved = true;
		} catch (RuntimeException e) {
			isSaved = false;
		}

		currentSession.close();// close the session

		return isSaved;

	}

}
