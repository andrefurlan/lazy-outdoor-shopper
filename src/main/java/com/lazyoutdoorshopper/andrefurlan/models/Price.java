package com.lazyoutdoorshopper.andrefurlan.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Price {


	    private String value;
	    
	    public Price() {
	        this.value = "0";
	    }

	    public Price(String vl) {
	    	this.value = vl;
	    }

		public String getValue() {
			return value;
		}

}
