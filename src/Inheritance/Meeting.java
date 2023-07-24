package Inheritance;

class Meeting extends Squad
{
	public Meeting() 
	{
		System.out.println("Meeting Constructor Crated");
	}
	public Meeting(String name) 
	{
		System.out.println("Parameterized Meeting Constructor Crated");
	}
	void meeting(Meeting call)
	{
		call.team();
		call.captain();
		call.Coach();
	}
	public static void main(String[] args) 
	{
		System.out.println("------------------Meeting------------------");
		Meeting call = new Meeting();
		System.out.println("Target Object Created from Meeting");
		call.team();
		call.captain();
		call.Coach();
	}
}