package oops_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp= new LoginPage();
		lp.doLogin("anand@gmail.com", "test2213");
		lp.title();
		LoginPage.getPageInfo();
		
		Page p= new LoginPage();
		p.logo();
		Page.getPageInfo();
		p.header();
		p.title();
		
			
			
	}

}
