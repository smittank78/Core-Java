package designpattern.adapter;

public class Company {

	public static void main(String[] args) {
		UserDto userDto = new UserDto("smit",1,"Java");
		
		Service service = new ServiceImpl();
		service.persist(userDto);
		
	}
}
