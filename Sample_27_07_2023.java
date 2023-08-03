package com.gqt.advance.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * Once the execution of the program is completed the activation record for
 * the main method will be deleted and hence the object also deleted.
 * As a result the object in the heap segment will become garbage which 
 * is collected by garbage collector
 * 
 * if we have to make the object get stored in the HDD permanently 
 * then we must make use of the concept of "Serialization"  
 */

/*
 * Serialization is the process of converting an object into a stream of bytes,
 * and deserialization is the process of reconstructing the object from that stream of bytes.
 * 
 * 
 * Persistence: By making objects Serializable,
 * you can save their state to a file or database
 * , allowing you to persist the data even after 
 * the program has terminated.This is useful for data storage and retrieval.

		Network Communication: Serializable objects can be easily 
		transmitted over a network as a stream of bytes. This is
		commonly used in distributed systems, client-server architectures
		and web services.
		
		Caching: Serializable objects can be cached in memory or on disk,
		which can help improve performance by reducing the need to recreate
		complex objects frequently.
		
		Cloning or Deep Copying: Serialization can be used to create copies of 
		objects, sometimes referred to as deep copies, by first serializing the
		object and then deserializing it to produce an independent copy.
		
		Versioning: When you need to update your software, having serializable objects
		allows you to handle versioning issues more easily. You can deserialize older
		versions of objects and migrate them to the latest version of the class.
		
		It's worth noting that while serialization can be very convenient, it also has some considerations:
		
		Security: Serialized data can be potentially tampered with, so it's essential 
		to consider security measures, like encryption and digital signatures, when 
		transmitting serialized data over the network
		
		
		
 * Steps to serialize an object
 * 
 * creates an FileOutputStream with a path to which the object must be stored
 * create an objectOutputStream to crush the object in the bytecode format
 * pass this fileOutputStream to objectOutputStream
 * writeObject() to write the object using objectoutputstream
 * 
 * 
 * 
 * Steps to deserialize an object
 * 
 * create an fileInputStream with a path from which the object must be created
 * create an objectInputStream to convert the crushed object into the real time object
 * pass this fileInputstream to objectInputStream
 * read the object using objectInputstream 
 * 
 */
class Employee implements Serializable {
	int id;
	String name;
	int exp;
	int salary;
	String company;

	Employee(int empId, String empName, int empExp, int empSalary, String empCompany) {
		this.id = empId;
		this.name = empName;
		this.exp = empExp;
		this.salary = empSalary;
		this.company = empCompany;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(exp);
		System.out.println(company);
	}
}

public class Sample_27_07_2023 {
	public static void main(String... args) throws FileNotFoundException, IOException,ClassNotFoundException {
		Employee e = new Employee(10, "Yalini", 2, 50000, "Infosys");
		e.display();

		//Serialization
		
		String path = "C:\\GQT\\Employee.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		
		//Deserialization
		String path1="C:\\GQT\\Employee.txt";
		FileInputStream f=new FileInputStream(path1);
		ObjectInputStream o=new ObjectInputStream(f);
		Employee e1=(Employee)o.readObject();
		e1.display();
	}

}
