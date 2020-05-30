package oops_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.start();
		b.stop();
		b.autoParking();
		b.refuel();
		b.engine();//calling grand parent method
		
		Audi a =new Audi();
		a.start();
		a.refuel();
		a.twoSeater();
		
		//top casting
		Car c= new BMW();
		c.start();
		c.stop();
		c.refuel();
		
		Car c1= new Car();
		c1.start();
		c1.engine();
	}
}