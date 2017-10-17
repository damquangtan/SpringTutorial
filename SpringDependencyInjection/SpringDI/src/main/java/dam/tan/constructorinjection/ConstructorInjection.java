package dam.tan.constructorinjection;

import dam.tan.bean.IOutputGenerator;

public class ConstructorInjection {
	IOutputGenerator outputGenerator;

	public ConstructorInjection(IOutputGenerator outputGenerator) {
		super();
		this.outputGenerator = outputGenerator;
	}
}
