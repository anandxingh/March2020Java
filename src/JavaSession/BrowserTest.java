package JavaSession;

import java.util.ArrayList;

public class BrowserTest {

	public static void main(String[] args) {
		
		ArrayList<String> firefoxPlugin= new ArrayList<String>();
		firefoxPlugin.add("firebug");
		firefoxPlugin.add("inspactor");
		firefoxPlugin.add("addBlocker");
		firefoxPlugin.add("firepath");
		
		ArrayList<String> chromePlugin= new ArrayList<String>();
		
		
		Browser b1= new Browser("Firefox", "Google", 1.26, firefoxPlugin);
		
		System.out.println(b1.getBrowserName()+ " "+ b1.getVendor()+ " "+b1.getVersion()+ " "+ b1.plugInList);
		
	}

}
