package oops_Abstract;

public abstract class Page {

	// can not create the object of abstract class but can create the
		// constructor
		// page abstract class const.. will be called when you create the object of
		// child class

		// can have abstract methods and non abstract methods also

	
	public abstract void header();
	public abstract void title();
	
	
	public static void getPageInfo() {
		System.out.println("page info");
	}
	
	public final void logo()
	{
		System.out.println("Logo of the company remain same");
	}
	
}