package dam.tan.service.impl;

import dam.tan.dao.PersonDao;
import dam.tan.service.PersonService;

public class PersonServiceImpl implements PersonService{
	PersonDao personDao;

	public void showJob() {
		personDao.showJob();
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
