package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditFile {
	public static void main(String[] args) throws IOException {
		File file = new File("tryEdit.txt");
		
		FileWriter writer = new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		write(bufferedWriter);
		
		bufferedWriter.close();
		writer.close();		
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		read(bufferedReader);
		
	}
	static void write(BufferedWriter bufferedWriter) throws IOException
	{
		bufferedWriter.write("\nsender: send message");
		bufferedWriter.write("\nreceiver: receive message");
		System.out.println("write done");	
	}
	static void read(BufferedReader bufferedReader) throws IOException
	{
		String line = bufferedReader.readLine();
		boolean flag = true;
		while ((line = bufferedReader.readLine()) != null)
		{
			 System.out.println(line);
		}
		System.out.println("read done");	
	}
}