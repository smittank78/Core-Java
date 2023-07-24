package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;

public class SerializeExample 
{
	public static void main(String[] args) {
		Student s1 = new Student(1,"smit");

		String file = "/home/qtech/serial";
		try {
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream op = new ObjectOutputStream(fo);
			op.writeObject(s1);

			op.flush();
			op.close();
			System.out.println(s1);

			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student student = (Student)oi.readObject();
			System.out.println(student.getName() + " : " + student.getId());
		} catch (ClassNotFoundException | InputMismatchException | IOException e) {
				e.printStackTrace();
		}
	}
}