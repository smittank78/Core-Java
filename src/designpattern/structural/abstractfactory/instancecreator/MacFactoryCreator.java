package designpattern.structural.abstractfactory.instancecreator;

import designpattern.structural.abstractfactory.dto.Mac;

public class MacFactoryCreator extends AbstrcatFactoryBuilder{

	@Override
	public designpattern.structural.abstractfactory.dto.Computer getInstance() {
		return (designpattern.structural.abstractfactory.dto.Computer) new Mac();
	}

	
	
}
