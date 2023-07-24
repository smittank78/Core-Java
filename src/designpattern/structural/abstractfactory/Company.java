package designpattern.structural.abstractfactory;

import designpattern.structural.abstractfactory.dto.Computer;
import designpattern.structural.abstractfactory.instancecreator.LinuxFactoryCreator;
import designpattern.structural.abstractfactory.instancecreator.MacFactoryCreator;
import designpattern.structural.abstractfactory.instancecreator.WindowsFactoryCreator;

/*
 * Company : SystemFactory.getInstance(new WindowsFactoryCreator())
 * Computer :	1.Window , 2.Linux , 3.Mac
 * SystemFactory : getInstance(AbstractFactoryCreator factory)
 * AbstractFactoryCreator :  	  1. windowsFactoryCreator  : return Windows Object
 * 								  2. linuxFactoryCreator	: return Linux Object
 * 								  3. macFactoryCreator		: return Mac Object
 */

public class Company {

	public static void main(String[] args) {
		Computer computer = new SystemFactory().getInstance(new WindowsFactoryCreator());
		System.out.println(computer.geInformation());
		
		Computer computer1 = new SystemFactory().getInstance(new LinuxFactoryCreator());
		System.out.println(computer1.geInformation());
		
		Computer computer2 = new SystemFactory().getInstance(new MacFactoryCreator());
		System.out.println(computer2.geInformation());
		
		
	}
}
