package dam.tan.beans;

import java.util.List;

public class Customer {
	private List<Person> lists;
	public List<Person> getLists() {
		return lists;
	}
	public void setLists(List<Person> lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "lists: "+lists;
	}
}
