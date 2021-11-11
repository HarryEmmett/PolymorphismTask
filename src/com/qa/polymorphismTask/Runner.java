package com.qa.polymorphismTask;

public class Runner {
	public static void main(String[] args) {
		
		VWGolf g = new VWGolf();
		Car c = new VWGolf();
		Car f = new FordFocus();
		Object o = new VWGolf();
		
		System.out.println("======Golf Class can call all golf funtions and from Car class as inherited due to golf extending the Car class========");
		g.mainClassFunction();
		g.VWGolfClassFunction();
		System.out.println("======Golf Car object can only call from the Car class as the Car object only access Car===============================");
		c.mainClassFunction();
		System.out.println("=========================Default object can't call either without cast==================================================");
		
		
		System.out.println("============================================Casted objects==============================================================");
		c.mainClassFunction();
		((VWGolf) c).VWGolfClassFunction();
		System.out.println("========================================================================================================================");
		f.mainClassFunction();
		((FordFocus) f).fordFocusClassFunction();
		System.out.println("========================================================================================================================");
		((Car) o).mainClassFunction();
		((VWGolf) o).VWGolfClassFunction();
		
	}
}
