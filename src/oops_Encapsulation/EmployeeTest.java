package oops_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("anand", 25, 25000);

			System.out.println(e1.name);
			System.out.println(e1.age);
			System.out.println("salary can not be call out of the class as if it is private property");
			e1.getAddress();
			System.out.println(e1.getSalary());
			e1.getAccountInfo();
			
	}

}
