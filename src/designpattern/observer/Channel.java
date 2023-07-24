package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String name;
	private String title;
	private List<Subscriber> listOfSubscriber = new ArrayList<>();
	
	public Channel(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	void subscribe(Subscriber subscriber) {
		subscriber.setChannel(this);
		listOfSubscriber.add(subscriber);
	}

	void unsubscribe(Subscriber subscriber) {
		subscriber.setChannel(null);
		listOfSubscriber.remove(subscriber);
	}
	
	void upload(String title) {
		this.title = title;
		notifyAllSubscribers();
	}
	
	void notifyAllSubscribers() {
		for(Subscriber subscriber :listOfSubscriber )
		{
			subscriber.notificationFromYoutube();
		}
	}
	
}
