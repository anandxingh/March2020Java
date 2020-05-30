package oops_Abstract;

public class LoginPage extends Page{

	@Override
	public void header() {
		System.out.println("Amazon header");
		
	}

	@Override
	public void title() {
		System.out.println("Amazon title");
		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login page"+ un+ " "+ pwd);
	}

	public static void getPageInfo() {
		System.out.println("login page-----info");
	}
}