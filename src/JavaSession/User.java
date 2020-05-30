package JavaSession;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;

public class User {

	String name;
	int age;
	String email;
	boolean isActive;
	char gender;
	long phone;
	ArrayList<String> paymentOptions;
	
	public User(){
		System.out.println("default constructer");
	}
	
	public User(String name, int age) {
		this.name =name;
		this.age =age;
		System.out.println("name: "+name+" "+ "age: "+ age);
	}
	
	public User(String name, int age, String email, boolean isActive, char gender, long phone,
			ArrayList<String> paymentOptions) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
		this.gender = gender;
		this.phone = phone;
		this.paymentOptions = paymentOptions;
	}
	
	
	
	public User(String name, String email, boolean isActive) {
		
		this.name = name;
		this.email = email;
		this.isActive = isActive;
		System.out.println("User name: "+name+" "+ "User Email: "+email+ " "+ "User is active/passive: "+" "+ isActive);
	}

	
	public User(String name, long phone, ArrayList<String> paymentOptions) {
		this.name = name;
		this.phone = phone;
		this.paymentOptions = paymentOptions;
		
		System.out.println("payment option: "+ paymentOptions);
	}

	public static void main(String[] args) {
		User u1= new User();
		User u2=new User("anand", 30);
		User u3= new User("anand","anand@gmail.com", true);
		
		ArrayList<String> paymentMethods= new ArrayList<String>();
		paymentMethods.add("paytm");
		paymentMethods.add("gPay");
		paymentMethods.add("debitCard");
		User u4=new User("anand", 979695, paymentMethods);
		System.out.println(u4.name+ " "+u4.phone+" "+u4.paymentOptions);
			
		

	}

}
