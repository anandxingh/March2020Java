package JavaSession;

public class FacebookLogin {

	public static void main(String[] args) {
	
		Credential cred= new Credential("anand@gmail.com", "Anand@123");
		Credential seller= new Credential("anubhav@gmail.com", "test123");
		Credential vendor= new Credential("rama@gmail.com", "Ramayan123");
		
//		System.out.println(cred.getUserName());
//		System.out.println(cred.getPassword());
		
		cred.doLogin(cred.getUserName(), cred.getPassword() );
		seller.doLogin(seller.getUserName(), seller.getPassword());
		vendor.doLogin(vendor.getUserName(), vendor.getPassword());
	}

}
