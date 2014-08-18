package com.example.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Name {


	    private String firstName;
	    private String lastName;
	    
	    public Name() {
	        this.firstName = "andre";
	    }

	    public Name(String ln) {
	    	this.firstName = "andre";
	    	this.lastName = firstName + " " + ln;
	    }

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

	    
}
