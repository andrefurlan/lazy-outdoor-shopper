package com.example.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Name {


	    private String name;
	    
	    public Name() {
	        this.name = "andre";
	    }

	    public Name(String ln) {
	    	this.name = "andre" + " " + ln;
	    }

		public String getName() {
			return name;
		}

}
