package oops_Encapsulation;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company comp = new Company();
		
		comp.setName("IBM");
		comp.setLogo("IBM Logo");
		comp.setTenderAmount(10000);
		comp.setTotalEmp(2000);
		comp.setInformation("Contract1");
		
		System.out.println(comp.getName());
		System.out.println(comp.getLogo());
		System.out.println(comp.getTotalEmp());
		System.out.println(comp.getTenderAmount());
		System.out.println(comp.getInformation());
		
		//instead of using paramiterized constructor we use getter and setter
		//we can change or add value at run time when ever required.
		comp.setInformation("Contract2");
		
		System.out.println(comp.getInformation());
	}

}
