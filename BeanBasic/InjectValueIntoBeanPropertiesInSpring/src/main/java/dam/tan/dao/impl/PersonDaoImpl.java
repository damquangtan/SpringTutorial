package dam.tan.dao.impl;

import dam.tan.bean.Person;
import dam.tan.dao.PersonDao;

public class PersonDaoImpl implements PersonDao{
	Person person;
	
	public void showJob() {
		person.printJob();
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
