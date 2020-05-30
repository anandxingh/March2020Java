package JavaSession;

public class FunctionInJava {

//	FunctionInJava obj= new FunctionInJava();
	
//	obj.test();
	public static void main(String[] args) {
		FunctionInJava obj= new FunctionInJava();
		obj.test();
		String n1= obj.getTrainerName();
		System.out.println(n1);
		
		int n2= obj.getScore();
		System.out.println(n2);
		
		int n3= obj.add(20,40);
		System.out.println(n3);
		int n4= obj.add(500, 400);
		System.out.println(n4);
		
		int n5= obj.getMarks("Rajendra prasad");
		System.out.println(n5);
		
		String cap=obj.getCapital("India");
		System.out.println(cap);
		
		
	}
	public void test() {
		System.out.println("test method");
		return;
	}
	
	public String getTrainerName() {
		System.out.println("getTrainerName");
		String name="Naveen" ;
		return name;
		
	}
	
	public int getScore() {
		System.out.println("get Score");
		int p1=20;
		int p2=30;
		int total=p1+p2;
		return total;
	}

	public int add(int a, int b) {
		System.out.println("add Method");
		int sum= a+b;
		return sum;
	}

	public int getMarks(String studentName) {
		System.out.println("getMarks for"+ studentName);
		int mark=-1;
		 if(studentName.equals("Anand")) {
			 mark= 90;
		 }
		
		 else if(studentName.equals("Sonam")) {
			 mark=100;
		 }
		 
		 else if(studentName.equals("Rajendra prasad")) {
			 mark=105;
		 }
		 
		 else {
			 System.out.println("Student does not exists");
		 }
		 
		 return mark;
		
	}
	
	public String getCapital(String Country) {
		System.out.println("Capital Name for: "+ Country);
		String capital=null;
		
		if(Country.equals("India")) {
			capital="New Delhi";
		}
		else if(Country.equals("USA")) {
			capital="DC";
			
		}
		else if(Country.equals("France")) {
			Country="Paris";
			
		}
		else {
			System.out.println("Country does not exixts");
		}
		return capital;
	}
	
}
