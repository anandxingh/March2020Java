package oops_Encapsulation;

public class Browser {

	public String name;
	public double version;
	
	private String plugIN;
	
	
	
	public String getPlugIN() {
		return plugIN;
	}

	public void setPlugIN(String plugIN) {
		this.plugIN = plugIN;
	}

	public void launchBrowser() {
		System.out.println("launch Browser---");
		checkOSCompatibility();
		System.out.println("Browser is Launched;;;;;;");
		
	}
	
	private void checkOSCompatibility() {
		System.out.println("Browser compatibility checked----");
		checkBrowserExecutable();
		
	}
	private void checkBrowserExecutable() {
		System.out.println("check browser executable");
		browserVersionCheck();
	}
	
	private void browserVersionCheck() {
		System.out.println("browser version check");
	}
}
