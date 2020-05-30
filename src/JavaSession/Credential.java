package JavaSession;

public class Credential {

	String username;
	String password;
	
	//set the value
	public Credential(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	//getter class:
	public String getUserName() {
		return this.username;
		
	}
	public String getPassword() {
		return this.password;
		
	}
	public void doLogin(String un, String pwd) {
		System.out.println("login with: "+ un+ " "+"and password: "+ pwd);
	}
	
}
