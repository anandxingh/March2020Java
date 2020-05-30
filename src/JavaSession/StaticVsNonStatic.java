package JavaSession;

public class StaticVsNonStatic {
	
	String name;
	static int age;
	
	public void getName() {
		System.out.println("get name");
	}
		public static void getEmail(){
			System.out.println("getEmail");
		}
	
	
	
	//Non Static members can be accessed by creating Object
			//Static member can be called "Directly" or by Class name.
			
	
	public static void main(String[] args) {
		
		//Non Static members can be accessed by creating Object
		//Static member can be called "Directly" or by Class name.
		StaticVsNonStatic obj= new StaticVsNonStatic();
		obj.name="anand";
		System.out.println(obj.name);
		obj.getName();
		
		obj.age = 45;
		obj.getEmail();
		
		//2. how to access static stuff:
		//a. call them directly
		getEmail();
		age = 20;
		System.out.println(age);
		
		//b. call them by class name:
		StaticVsNonStatic.age = 30;
		System.out.println(age);
		StaticVsNonStatic.getEmail();
		

		
		

	}

}
