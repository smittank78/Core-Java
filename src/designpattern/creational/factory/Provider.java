package designpattern.creational.factory;

class Provider {
	
	Computer getInstance(String obj) {
		
		if(obj.equals("Linux"))
		{
			return new Linux();
		}
		if(obj.equals("Windows"))
		{
			return new Windows();
		}if(obj.equals("Mac"))
		{
			return new Mac();
		}
		return null;	
	}

}
