package JavaSession;

import java.util.ArrayList;

public class UniversityTest {
	
//	ArrayList<String> degreeCourse= new ArrayList<String>();
//	degreeCourse.add("english");
	
	public static void main(String[] args) {
		
		ArrayList<String> degreeCourse= new ArrayList<String>();
		degreeCourse.add("english");
		degreeCourse.add("Mathematics");
		degreeCourse.add("sociology");
		
		ArrayList<String> diplomaCourse= new ArrayList<String>();
		diplomaCourse.add("mobile");
		diplomaCourse.add("hardware");
		diplomaCourse.add("motor");
		
		University u1= new University("DU", "India",  degreeCourse);
		University u2= new University("DU", "India",  diplomaCourse);
		
		
		System.out.println(u1.getName()+" "+ u1.getCountry()+ " "+University.stablishedDate+ " "+ u1.coursesList);
		System.out.println(u1.getName()+" "+ u1.getCountry()+ " "+University.stablishedDate+ " "+ u2.coursesList);
		
	}

}
