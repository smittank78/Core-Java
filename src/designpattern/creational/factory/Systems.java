package designpattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Systems {

	private List<Computer> systems = new ArrayList<>();

	void add(Computer computer) {
		systems.add(computer);
	}

	void findAll() {
		for (Computer cmp : systems) {
			System.out.println(cmp.toString());
			
		}
	}

}
