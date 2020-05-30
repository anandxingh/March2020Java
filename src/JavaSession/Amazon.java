package JavaSession;

public class Amazon {

	//Method Overloading
	//Same method name
	//Different parameter of methods
	// atleast sequence of the method parameter should be different
	//Conclusion: Method signature should be different.
			//* Method Overloading is known as Compile time Polymorphism 
	//
	//Main method can be overloaded
	//Static method can be overloaded
	
	public void search() {//o parameter
		System.out.println("0 parameter search");
		
	}
	public void search(String name) {
		System.out.println("1 parameter search "+ name);
	}
	public void search(int price) {
		System.out.println("int parameter: "+ price);
	}
	public void search(String name, int price) {
		System.out.println("2 parameter: "+ name+ " "+ price);
	}
	public void search(int price, String name) {
		System.out.println("2 parameter: "+ price+" "+ name);
	}
	public static void main(String[] args) {
		
		Amazon am= new Amazon();
		am.search();
		am.search("Nike");
		am.search(10000);
		am.search("iPhone", 80000);
		
	}

}
