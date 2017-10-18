package dam.tan.helper;

import dam.tan.service.PersonService;

public class PersonHelper {
	PersonService personService;
	
	public void showJobOfPerson() {
		personService.showJob();
	}

	public PersonHelper(PersonService personService) {
		super();
		this.personService = personService;
	}
}
