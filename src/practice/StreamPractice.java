package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
	public static void main(String[] args) {
		
		/*
		 * print stream
		 */
		Stream<Integer> intPrintStream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,0});
		intPrintStream.forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		

		/*
		 * find odd numbers from stream
		 */
		
		Stream<Integer> intFilterStream = Stream.of(1,2,3,4,5,6,7,8,9,0);
		intFilterStream.filter(a -> a % 2 != 0).forEach(a -> System.out.print(a + " "));
		System.out.println();

		/*
		 * find next 2 numbers from stream where number is gretarthan 5 and eliminate 1st after 5
		 */
		Stream<Integer> intgrtFilterStream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,0});
		intgrtFilterStream.filter(a -> a > 5)
						  .skip(1)
						  .limit(2)
						  .forEach(a -> System.out.print(a + " "));
		
		/*
		 * find 2nd and 3rd bigger number from stream where number is grtn 5
		 * if not found -1
		 */
		System.out.println();
		Stream<Integer> firstFilterStream = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,9,8});
		
		Integer orElse = firstFilterStream.filter(a -> a > 5)
						  .skip(2)
						  .limit(3)
						  .findFirst()
						  .orElse(-1);
		System.out.println(orElse);
		
		List<family> families = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			families.add(new family(String.valueOf(i),String.valueOf(i)));
		} 
		
		List<user> users = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			users.add(new user(String.valueOf(i),families));
		} 
		
		List<family> collect = users.stream()
///		.map(a -> a.getFamily().stream())
		/*
		 * if using FlatMap then it create one stream with elements of all streams
		 * like we have stream1 [1,2,3] Stream2 [4,5,6] Stream3 [7,8,9] then flatMap Return Stream { 1,2,...,9}
		 * and map returns 3 streams
		 */
			/*
			 * flatMap used to convert Stream<Stream> into single stream
			 */
		.flatMap(a -> a.getFamily().stream())
		.map(a -> {
			System.out.println("count is " +  a.getMember());
			return a;	
		}).collect(Collectors.toList());
		System.out.println("sixe : " + collect.size());
	}
}

class user{
	private String name;
	private List<family> family;
	
	public user(String name, List<practice.family> family) {
		super();
		this.name = name;
		this.family = family;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<family> getFamily() {
		return family;
	}
	public void setFamily(List<family> family) {
		this.family = family;
	}	
}

class family{
	private String member;
	private String relation;
	
	public family(String member, String relation) {
		super();
		this.member = member;
		this.relation = relation;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}