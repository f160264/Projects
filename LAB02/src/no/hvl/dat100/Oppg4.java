package no.hvl.dat100;

import java.util.Scanner;

public class Oppg4 {

	public static void main(String[] args) {
		
		double salary = 0; 
		
		final double STEP0 = 0;
		final double STEP1 = 0.93;
		final double STEP2 = 2.41;
		final double STEP3 = 11.52;
		final double STEP4 = 14.52;
		
		double outcome1 =0; 
		double outcome2 =0;
		double outcome3 =0;
		double outcome4 =0;
		double outcome5 =0;
		
		Scanner sc = new Scanner(System.in);
		
		salary = sc.nextDouble();
		
		System.out.println("Write in gross salay please, 6 numbers");
		
		if (salary <= 164100) {
			outcome1 = salary*(STEP0/100);
			System.out.println("The outcome are: " + outcome1);
			System.out.println("The tax are: " + (outcome1-salary));
		}
		else if (salary >= 164100 && salary <= 230950) {
			outcome1 = salary*(STEP1/100);
			System.out.println("The outcome are: " + outcome2);
			System.out.println("The tax are: " + (outcome2-salary));
		}
		else if (salary >= 230951 && salary <= 58650) {
			outcome1 = salary*(STEP2/100);
			System.out.println("The outcome are: " + outcome3);
			System.out.println("The tax are: " + (outcome3-salary));
		}
		else if (salary >= 58650 && salary <= 934505) {
			outcome1 = salary*(STEP3/100);
			System.out.println("The outcome are: " + outcome4);
			System.out.println("The tax are: " + (outcome4-salary));
		}
		else if (salary >= 934505) {
			outcome1 = salary*(STEP4/100);
			System.out.println("The outcome are: " + outcome5);
			System.out.println("The tax are: " + (outcome5-salary));
		}
				
	}

}
