package jsonObject;

public class convertJson
{
	public static void main(String[] args) 
	{
		String a = "{\"num\":\"172\",\"name\":\"smit\",\"age\":\"21\"}";
		
		try {
			System.out.println("exception thrown");
			//throw new Exception();
		}
		catch (Exception e) {
			System.out.println("handled");
		}
		finally
		{
			System.out.println("finally");
		}
	}
}