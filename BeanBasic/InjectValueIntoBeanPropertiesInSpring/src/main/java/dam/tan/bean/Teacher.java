package dam.tan.bean;

public class Teacher extends Person{

	public Teacher() {
		super();
	}

	public Teacher(String name, String job) {
		super(name, job);
	}

	@Override
	public void printJob() {
		System.out.println("I'm a teacher.");
	}
}