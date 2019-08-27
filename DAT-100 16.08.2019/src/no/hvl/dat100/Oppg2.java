package no.hvl.dat100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oppg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1 = 0; 
		double number2 = 0; 
		double number3 = 0; 
		double number4 = 0; 
		double smallest1 = 0;
		double smallest2= 0; 
		int leastnumber = 0; 
					
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" This program writes out the least number out of four numbers written in");
		System.out.println(" Please write in four numbers");
			
		try {
			number1 = sc.nextDouble();
			number2 = sc.nextDouble();
			number3 = sc.nextDouble();
			number4 = sc.nextDouble();
			
			smallest1 = Math.min(number1, number2); 
			smallest2 = Math.min(number3, number4);
			
			leastnumber = (int) Math.min(smallest1, smallest2);	 			
			System.out.println("The smallest number is: " + leastnumber);
		
		}
		catch(InputMismatchException e) {
			System.out.println("Please write in a number");
					
		}
		sc.close(); 
		
		
		
		

	}

}
