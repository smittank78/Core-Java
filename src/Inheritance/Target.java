package Inheritance;

public class Target extends Team
{
	public Target() 
	{
		System.out.println("Target Constructor Crated");
	}
	public Target(String Name) 
	{
		System.out.println("Parameterized Target Constructor Crated");
	}
	void target()
	{
		System.out.println("Target - IPL");
	}
	public static void main(String[] args) 
	{
		System.out.println("------------------Target------------------");
		Target target = new Target("smit");
		System.out.println("Target Object Created from Target");
		target.target();
		target.team();
		
		Meeting meeting = new Meeting();
		System.out.println("Meeting Object Created from Target");
		meeting.meeting(meeting);
    }
}