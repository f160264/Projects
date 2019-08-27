package no.hvl.dat100;

import java.util.Scanner;

public class Oppg4 {

	public static void main(String[] args) {
		
		double salary 	= 0; 
		
			
		 double step0 = 0.0; 
		 double step1 = 0.93; 
		 double step2 = 2.41;
		 double step3 = 11.52;
		 double step4 = 14.52;
		
		 double outcome1 = 0;
		 double outcome2 = 0;
		 double outcome3 = 0;
		 double outcome4 = 0;
		 double outcome5 = 0;
		 
		 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Write in gross salary in 6 numbers");
		
		salary = sc.nextDouble();
		
		if (salary <= 164100) {
			outcome1 = salary*(step0/100); 
			System.out.println("The outcome are: " + outcome1 );	
		}
		else if (salary <= 164101 && salary >= 230950) {
			outcome2 = salary*(step1/100); 
			System.out.println(" The outcome are: " + outcome2);
		}
		else if (salary <= 230951 && salary >= 58650) {
			outcome3 = salary*(step2/100); 
			System.out.println(" The outcome are: " + outcome3);
		}
		else if (salary <=58651 && salary >= 934505) {
			outcome4 = salary*step3/100; 
			System.out.println(" The outcome are: " + outcome4);
		} 
		else if (salary >= 934050 ){
			outcome5 = salary*step4/100; 
			System.out.println(" The outcome are: " + outcome5);
		}
			
		sc.close();
		
		
		}

}
