package oop_polymorphism2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor dr = new Doctor();
		dr.treatPatient();
		
		Surgen sr = new Surgen();
		sr.treatPatient();
	}

}
