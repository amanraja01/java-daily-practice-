package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	int id ;
    String email;
    String name;
    transient String password;
    private static final long serialVrsionUI=-100l;
    
public static void main(String[] args)throws Exception {
	Person p = new Person();

  
	p.id=100;
	p.name= "Aman";
	p.email = "aman21012002@gmail.com";
	
	//File f = new File ("Person.ser");
	//f.createNewFile();
	System.out.println("===serialization process started===");
	FileOutputStream fos = new FileOutputStream("Person.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(p);
	oos.flush();
	oos.close();
	
	System.out.println("===Serialization Completed===");
	
	System.out.println("===De-Serilization Processn Started===");
	
	FileInputStream fis = new FileInputStream("Person.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object object = ois.readObject();
	
	
	
	Person p1 = (Person) object;

	System.out.println("ID:"+p1.id);
	System.out.println("Name:"+p1.name);
	System.out.println("Email:"+p1.email);
 	System.out.println("Password:"+p1.password);
 	ois.close();
 	
 	System.out.println("===De-Serializatin");
	
	
	
	
}
}
