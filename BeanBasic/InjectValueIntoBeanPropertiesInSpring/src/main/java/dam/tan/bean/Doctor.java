package dam.tan.bean;

public class Doctor extends Person{

	public Doctor() {
		super();
	}

	public Doctor(String name, String job) {
		super(name, job);
	}

	@Override
	public void printJob() {
		System.out.println("I'm a doctor.");
	}
}
