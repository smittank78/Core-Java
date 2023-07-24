package practice.InterviewBit;

public class Example1 
{
	
	static boolean flag;
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {		
		String s = "s";
		String s1 = "s";
		s = "hello";
		
		System.out.println(s);
		System.out.println(s1);
	}
	
	static class Insider{
		public void name() {
			System.out.println("public");
		}
		static void name1() {
			System.out.println("static");
		}
	}
}