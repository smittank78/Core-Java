package designpattern.observer;

public class Subscriber {

	private String name;
	private Channel channel;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	void notificationFromYoutube() {
		System.out.println("Hey " + name + " , video uploaded from " + this.channel.getName() + " : " + this.channel.getTitle() );
	}
	
}
