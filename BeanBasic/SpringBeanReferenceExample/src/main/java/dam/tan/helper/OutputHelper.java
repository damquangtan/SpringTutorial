package dam.tan.helper;

import dam.tan.service.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerate;
	
	public void generateOutput() {
		outputGenerate.generate();
	}
	
	public OutputHelper(IOutputGenerator outputGenerate) {
		this.outputGenerate = outputGenerate;
	}
}
