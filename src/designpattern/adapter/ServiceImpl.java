package designpattern.adapter;

public class ServiceImpl implements Service {

	private final DbService dbService;
	
	public ServiceImpl() {
		this.dbService = new DbService();
	}

	public void persist(UserDto dto) {
		/*
		 * adapter pattern works here
		 * need User object to perform main operation but we have Dto object so we are not convertiong into user and calling the method which having actual logic
		 */
		
		User user = convert(dto);
		this.dbService.persist(user);
	}

	private User convert(UserDto dto) {
		return new User(dto.name(), dto.phone(), dto.department());
	}

}
