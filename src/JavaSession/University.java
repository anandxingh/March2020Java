package JavaSession;

import java.util.ArrayList;

public class University {

	String name;
	String country;
	final static String stablishedDate="12/12/2012";
	ArrayList<String> coursesList;
	
	
	
	public University(String name, String country, ArrayList<String> coursesList) {
		
		this.name = name;
		this.country = country;
		this.coursesList = coursesList;
	}


	public String getName() {
		return this.name;
	}
	
	public String getCountry() {
		return this.country;
	}
	 
	

	
}
