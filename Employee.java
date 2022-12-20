package com.serializationanddeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	// Declare
	
	String firstName;
	
    String lastName;
    
 // transient String lastName; // Won't be Serialize 
	
	String city;

	

 }
