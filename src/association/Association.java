package association;

import java.util.ArrayList;
import java.util.List;

public class Association {

	List<User> users;
	
	/*
	 * Aggregation : Not Dependent on any other objects
	 */
	public Association() {
		super();
		users = new ArrayList<>();
	}

	public static void main(String[] args) {
		
	Credentials credentials = new Credentials("test@gmail.com", "test",true);	
	/*
	 * Composition : Need Credentials Object to create object
	 */
	User user = new User(credentials);
	user.setId(1);
	user.setName("test");
	user.setPhone(111);
	user.setActive(true);

	System.out.println("User : " + user.toString());

	System.out.println("Delete User");
	/*
	 * Composition : when deleting user also credentials are deleted 
	 */
	user.inActiveUser();

	System.out.println("User : " + user.toString());

	
	Credentials credentials2 = new Credentials("test2@gmail.com", "test2",true);	
	/*
	 * Composition
	 */
	User user1 = new User(credentials2);
	user1.setId(2);
	user1.setName("test2");
	user1.setPhone(222);
	user1.setActive(true);

	Association association = new Association();
	association.users.add(user);
	association.users.add(user1);
	
	}
}


class User{
	private int id;
	private String name;
	private int phone;
	private boolean active;
	private Credentials credentials;

	public User(Credentials credentials) {
		super();
		this.credentials = credentials;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	void inActiveUser() {
		this.active = false;
		//compositions
		credentials.setActive(false);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", active=" + active + ", credentials="
				+ credentials + "]";
	}
	
	
}

class Credentials{
	private String email;
	private String password;
	private boolean active;
	
	public Credentials(String email, String password,boolean active) {
		super();
		this.email = email;
		this.password = password;
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "[email=" + email + ", password=" + password + ", active=" + active + "]";
	}
	
	
	
}