package newfeatures;

public class ImmutableClass {

	public static void main(String[] args) {

		Phone phone = new Phone(123);
		System.out.println("Phone number : " + phone.getPhoneNumber());

		User user = new User("smit", "password");
		System.out.println(user.username());		
	
	}

}


final class Phone{
	
	final int phoneNumber;

	public Phone(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}
	
}

record User (String username,String pass) {};
