package JavaSession;

import java.util.ArrayList;

public class Employee {

	String name;
	int age;
	String department;
	boolean ispermanent;
	String laptop[];
	ArrayList<String> deviceList;
	
	
	
	
	
	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		emp.name="Tom";
		emp.age=25;
		emp.department="admin";
		emp.ispermanent=true;
		emp.laptop= new String[3];
		
		emp.deviceList= new ArrayList<String>();
		emp.deviceList.add("Apple iPhone");
		emp.deviceList.add("Samsung S8");
		emp.deviceList.add("Windows 10");
	
		
//		System.out.println(deviceLists.get(0));
		System.out.println(emp.deviceList.get(0));
		System.out.println(emp.deviceList);
		
		
		
       Employee emp1 = new Employee();
		
		emp1.name="anand";
		emp1.age=32;
		emp1.department="QA";
		emp1.ispermanent=true;
		
		System.out.println(emp.name+" "+emp.age+" "+emp.department+" "+emp.ispermanent);
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.department+" "+emp1.ispermanent);
		
//		new Employee().name= "bhasskar";
//		System.gc();
//		System.out.println(new Employee().name);
		//public static void gc()
//		Runs the garbage collector. 
//		Calling the gc method suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for quick reuse. When control returns from the method call, the Java Virtual Machine has made a best effort to reclaim space from all discarded objects. 
//
//		The call System.gc() is effectively equivalent to the call: 
//
//		 Runtime.getRuntime.gc();

		Employee emp3= new Employee();
		System.out.println(emp3.name);
		System.out.println(emp3.age);
		System.out.println(emp3.department);
		System.out.println(emp3.ispermanent);
		System.out.println(emp3.laptop);
		System.out.println(emp3.deviceList);
	}

}
