package JavaSession;

import java.util.ArrayList;

public class WebPageTesting {

	public static void main(String[] args) {
		
		
		ArrayList<String> linksList= new ArrayList<String>();
		linksList.add("forgot password");
		linksList.add("reset password");
		linksList.add("sign up");
		
		ArrayList<String> homeLinksLists= new ArrayList<String>();
		
		WebPage loginPage= new WebPage("login", "http://Amazon.com/login", linksList);
		WebPage homePage= new WebPage("home", "http://Amazon.com/home",homeLinksLists );
		
		System.out.println(loginPage.title+" "+loginPage.url +" "+loginPage.linksList+ " " + WebPage.logo);
		System.out.println(homePage.title+" "+homePage.url +" "+homePage.linksList+ " " + WebPage.logo);
	}

}
