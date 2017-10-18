package dam.tan.helper;

import dam.tan.service.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerate;

	public OutputHelper(IOutputGenerator outputGenerate) {
		super();
		this.outputGenerate = outputGenerate;
	}
	
	public void generateOutput() {
		outputGenerate.generate();
	}
}
