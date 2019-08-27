package no.hvl.dat100;

import java.util.Scanner;

public class Oppg3 {

	public static void main(String[] args) {
	
		double r	=0;
		double answ =0; 
		
		System.out.println("Write in a number to calculate the volum of a sphere");
		Scanner sc = new Scanner(System.in);
		
		r 		= sc.nextDouble(); 
		answ	= ((4*Math.PI*r*r*r)/3);
		
		System.out.println("The volum of the sphere is: " + answ);
		
		

	}

}
