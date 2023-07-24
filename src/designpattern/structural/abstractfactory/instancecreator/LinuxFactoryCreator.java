package designpattern.structural.abstractfactory.instancecreator;

import designpattern.structural.abstractfactory.dto.Linux;

public class LinuxFactoryCreator extends AbstrcatFactoryBuilder{

	@Override
	public designpattern.structural.abstractfactory.dto.Computer getInstance() {
		return (designpattern.structural.abstractfactory.dto.Computer) new Linux();
	}

	
	
}
