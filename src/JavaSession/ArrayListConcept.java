package JavaSession;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//
		//
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("selenium");
		ar.add(1.22);
		ar.add('a');
		ar.add(true);
		
		ar.add(600);
		ar.add(700);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(0));
		//System.out.println(ar.get(8));//IndexOutOfBoundsException
		
		ar.remove(4);
		
		System.out.println(ar.get(4));
		System.out.println(ar.size());
		
		//To print all the value of the arraylist:
		System.out.println("-*-*-*-*-*- increasing order");
		for(int i=0; i< ar.size(); i++) {
//			System.out.println("---------------");
			System.out.println(ar.get(i));
		}
		System.out.println("----Decreasing order******-----");
		for(int i= ar.size()-1; i>=0; i-- ) {
			System.out.println(ar.get(i));
		}
		
	// Arraylist of generic daata type:
		//String type
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("anand");
		student.add("ashi");
		student.add("singham");
		
		System.out.println(student.size());
		System.out.println(student.get(1));
		
		//Integer type:
		ArrayList<Integer> studentMark= new ArrayList<Integer>();
		
		studentMark.add(100);
		studentMark.add(200);
		studentMark.add(500);
		
		System.out.println(studentMark.size());
		System.out.println(studentMark.get(0));
		System.out.println(studentMark.get(1));
		
		//For storing different data types
		//Object type ArrayList:
		
//		ArrayList<Object> 
			
		
	}

}
