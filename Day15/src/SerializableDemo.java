import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String [] args) {
		Student s1 = new Student(101, "Ram" , 86.5, "Student101");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/objectData.txt"));){
			oos.writeObject(s1);
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/objectData.txt"));){
			Student s = (Student) ois.readObject();
			
			s.display();
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
