package oops_Encapsulation;

public class Employee {

	public String name;
	public int age;
	private int salary;
	
	
	public Employee(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	public void getAddress() {
		System.out.println("employee address");
	}
	
	private void getBankAccount() {
	
		System.out.println("get account details");
	}
	// rapper(public layer) created over private property to access the private properties in child class
	public void getAccountInfo() {
		getBankAccount();
	}
}
