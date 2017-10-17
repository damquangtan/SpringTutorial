package dam.tan.utils;

import dam.tan.service.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public void generateOutput() {
		outputGenerator.generator();
	}
	
	//DI via constructor
	public OutputHelper(IOutputGenerator outputGenerator) {
		super();
		this.outputGenerator = outputGenerator;
	}
}
