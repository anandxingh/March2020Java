package JavaSession;

import java.util.ArrayList;

public class WebPage {

	String title;

	String url;
	ArrayList<String> linksList;
	static String logo="Amazon";	
	
	public WebPage(String title, String url, ArrayList<String> linksList) {
		
		this.title = title;
		this.url = url;
		this.linksList = linksList;
	}

	public WebPage(String title, String url) {
		
		this.title = title;
		this.url = url;
	}
	
	
	
	
}
