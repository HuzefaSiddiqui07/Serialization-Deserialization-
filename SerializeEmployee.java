package com.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
	// Create an Object to Call Global Variable From Employee Class
		Employee emp = new Employee ();
		
		// Call By Object & Assign Values
		emp.firstName = "Sujit";
		
		emp.lastName = "Galande";
		
		emp.city = "Pune";
		
		// Create Try & Catch Block 01 to Write User Input in File
		try {
			// Create an Object Of FileOutputStream
			FileOutputStream fos = new FileOutputStream ("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\Java01.txt");
			// Create ObjectOutputStream 
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			// Call by Write Object Through oos Object
			oos.writeObject(emp);
			oos.flush();
			
			System.out.println("Serialization Success!!!");
		}
		catch (Exception e1) {
			
			System.out.println(e1);
			// e.printStackTrace(); // Second Alternate Way
		}
	}
 }
