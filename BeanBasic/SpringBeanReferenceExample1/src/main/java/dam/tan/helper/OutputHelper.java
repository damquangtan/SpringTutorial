package dam.tan.helper;

import dam.tan.service.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerate;

	public void setOutputGenerate(IOutputGenerator outputGenerate) {
		this.outputGenerate = outputGenerate;
	}
	
	public void generateOutput() {
		outputGenerate.generate();
	}
}
