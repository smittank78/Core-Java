package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class writeFile extends Thread {
	public static void main(String[] args) throws IOException 
	{		
		Thread sender = new Thread(){
			@Override
			public void run() 
			{
				try {
					BufferedWriter bufferedWriter = getBufferWriter();
					int j = new Random().nextInt(50, 60);
					System.out.println("sender : " + j);
					for(int k=j;k<=100;k++)
					{
						write(bufferedWriter,"sender","receiver",k);
					}
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		Thread receiver = new Thread(){
			@Override
			public void run() 
			{
				try {
					BufferedWriter bufferedWriter = getBufferWriter();
					int j = new Random().nextInt(50, 60);
					System.out.println("receiver : " + j);
					for(int k=j;k<=100;k++)
					{
						write(bufferedWriter,"receiver","sender",k);
					}
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
									};
		sender.start();
		receiver.start();
	}
	static BufferedWriter getBufferWriter() throws IOException
	{
		File file = new File("tryEdit.txt");
		FileWriter writer = new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		return bufferedWriter;
	}
	static void write(BufferedWriter bufferedWriter) throws IOException
	{
		bufferedWriter.write("\nsender: send message");
		bufferedWriter.write("\nreceiver: receive message");
		System.out.println("write done");	
	}
	static void write(BufferedWriter bufferedWriter,String from,String to,int num) throws IOException
	{
		bufferedWriter.append("\n" + from + " : greetings");
		bufferedWriter.append("\n" + to + ": receive message " + num);
		bufferedWriter.append("\n" + from + " : send message " + num);
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