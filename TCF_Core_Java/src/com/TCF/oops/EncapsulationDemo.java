package com.TCF.oops;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Encapsulation e1=new Encapsulation();
		e1.setId(1);
		e1.setName("Karthik Raja");
		e1.setAddress("Pondy");
		Encapsulation e2=new Encapsulation();
		e2.setId(2);
		e2.setName("Karthik Raja");
		e2.setAddress("sdakfsdf");
		System.out.println(e1+"\n"+ e2);
	}

}
