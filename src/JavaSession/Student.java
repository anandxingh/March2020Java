package JavaSession;

public class Student {

	String name;
	int age;
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {


		Student s1= new Student("anand", 30);
		Student s2= new Student("ashi", 2);
		Student s3= new Student("arti", 30);
		
		System.out.println("s1 name: "+ s1.name+ " "+ "s1 age: "+ " "+ s1.age );
		System.out.println("s2 name: "+ s2.name+ " "+ "s2 age: "+ " "+ s2.age );
		System.out.println("s3 name: "+ s3.name+ " "+ "s3 age: "+ " "+ s3.age );
	
		s1= s2;
		
		System.out.println("s1 name: "+ s1.name+ " "+ "s1 age: "+ " "+ s1.age );
		System.out.println("s2 name: "+ s2.name+ " "+ "s2 age: "+ " "+ s2.age );
		System.out.println("s3 name: "+ s3.name+ " "+ "s3 age: "+ " "+ s3.age );
	
		s2=s3;
		
		System.out.println("s1 name: "+ s1.name+ " "+ "s1 age: "+ " "+ s1.age );
		System.out.println("s2 name: "+ s2.name+ " "+ "s2 age: "+ " "+ s2.age );
		System.out.println("s3 name: "+ s3.name+ " "+ "s3 age: "+ " "+ s3.age );
		
		s3= s1;
		
		System.out.println("s1 name: "+ s1.name+ " "+ "s1 age: "+ " "+ s1.age );
		System.out.println("s2 name: "+ s2.name+ " "+ "s2 age: "+ " "+ s2.age );
		System.out.println("s3 name: "+ s3.name+ " "+ "s3 age: "+ " "+ s3.age );
	
	
	}

}
