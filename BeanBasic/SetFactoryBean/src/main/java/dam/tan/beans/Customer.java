package dam.tan.beans;

import java.util.Set;

public class Customer {
	private Set<Person> sets;

	public Set<Person> getSets() {
		return sets;
	}

	public void setSets(Set<Person> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "sets: "+sets;
	}
}
