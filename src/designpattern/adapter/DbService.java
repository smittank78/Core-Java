package designpattern.adapter;

public class DbService {

	public void persist(User user) {
		System.out.println(user.name() + " is persisted inside the db...");
	}
	
}
