package dam.tan.setterinjection;

import dam.tan.bean.IOutputGenerator;

public class SetterInjectionOutput {
	IOutputGenerator outputGenerator;
	
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
