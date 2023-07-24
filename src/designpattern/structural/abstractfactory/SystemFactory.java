package designpattern.structural.abstractfactory;

import designpattern.structural.abstractfactory.instancecreator.AbstrcatFactoryBuilder;

public class SystemFactory {
	
	designpattern.structural.abstractfactory.dto.Computer getInstance(AbstrcatFactoryBuilder factory)
	{
		return factory.getInstance();
	}

}
