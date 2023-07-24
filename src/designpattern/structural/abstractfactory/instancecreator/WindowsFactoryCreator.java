package designpattern.structural.abstractfactory.instancecreator;

import designpattern.structural.abstractfactory.dto.Windows;

public class WindowsFactoryCreator extends AbstrcatFactoryBuilder{

	@Override
	public designpattern.structural.abstractfactory.dto.Computer getInstance() {
		return (designpattern.structural.abstractfactory.dto.Computer) new Windows();
	}

	
	
}
