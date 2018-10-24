package controller;

public class ExemploTypeCast {
	

public static void main(String[] args) {
		
		int  a= 5 , b=2;
		int c;
		
		c= a/b;
		System.out.println("Valor de c: " + c);
				
		double d;
		d=a/b;
		System.out.println("Valor de D: " + d);
		
		
		double e;
		// conversão explicita
		e= (double) a/b;
		System.out.println("Valor de E: " + e);
		
		
		float f = 14.5f;
		//conversao implicita
		e = f;
		System.out.println("Valor de E: " + e);
		
		
		
	}
	
	
	

}
