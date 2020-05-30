package oops_Interface;

public class FortisHospital extends WHO implements USMedical, UKMedical, IndianMedical {

	
	@Override
	public void orthoServices() {

System.out.println("FS----ortho");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FS----cardio");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FS----neuro");
		
	}

	@Override
	public void service911() {
		System.out.println("FS----911");
		
	}

	@Override
	public void physioService() {
		System.out.println("FS----physio");
		
	}

	@Override
	public void padiarticServices() {
		// TODO Auto-generated method stub
		
	}

	
	public void optServices() {
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pathoServices() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
