package designpattern.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel channel = new Channel("java-by-smit");
		
		Subscriber subscriber1 = new Subscriber("smit9"); 
		Subscriber subscriber2 = new Subscriber("smit67"); 
		Subscriber subscriber3 = new Subscriber("smit34"); 
		Subscriber subscriber4 = new Subscriber("smit42"); 
		Subscriber subscriber5 = new Subscriber("smit100"); 

		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);
		channel.subscribe(subscriber3);
		channel.subscribe(subscriber4);
		channel.subscribe(subscriber5);
		
		channel.upload("Observer Design Pattern In Simple Way");
		
	}
	
}
