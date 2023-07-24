package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckFile extends Thread 
{
	public static void main(String[] args) throws IOException 
	{		
		File file = new File("tryEdit.txt");
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		
		int sender = 0;
		int receiver = 0;
		//System.out.println(bufferedReader.lines().count());
		String match;
		while((match = bufferedReader.readLine()) != null)
		{
			if(match.contains("greetings"))
			{
				if(match.startsWith("sender :"))
				{
					sender += 1;
				}
				if(match.startsWith("receiver :"))
				{
					receiver += 1;
				}
			}
		}
		
		System.out.println("sender : " + sender);
		System.out.println("receiver : " + receiver);
	}	
}