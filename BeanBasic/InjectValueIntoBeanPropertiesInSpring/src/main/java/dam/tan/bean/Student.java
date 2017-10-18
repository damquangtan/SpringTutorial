package dam.tan.bean;

public class Student extends Person{

	public Student() {
		super();
	}

	public Student(String name, String job) {
		super(name, job);
	}

	@Override
	public void printJob() {
		System.out.println("I'm a student.");
	}
}
