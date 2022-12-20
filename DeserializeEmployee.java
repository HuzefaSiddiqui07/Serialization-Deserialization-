package com.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) {
		
		// Create Try & catch block
		try {
			// Create FileInputStream Object
			FileInputStream fis = new FileInputStream ("C:\\Users\\Stars\\Desktop\\JavaWorkSpace\\Java01.txt");
			// Create ObjectInputStream Object
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject(); // Read object
			ois.close();
			// Convert to Employee
			Employee emp = (Employee) obj;
			
			System.out.println(emp.firstName);
			System.out.println(emp.lastName);
			System.out.println(emp.city);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
