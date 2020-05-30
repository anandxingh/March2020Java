package JavaSession;

import java.util.ArrayList;

public class Browser {

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> plugInList;
	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> plugInList) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugInList = plugInList;
	}
	
	public String getBrowserName() {
		return this.browserName;
	}
	public String getVendor() {
		return this.vendorName;
	}
	
	public double getVersion() {
		return this.currentVersion;
	}
}
