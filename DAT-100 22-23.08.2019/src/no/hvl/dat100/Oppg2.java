package no.hvl.dat100;

import java.util.Scanner;

public class Oppg2 {
	
	public static void main(String[] args) {
		
		int numb1	=0;
		int numb2	=0; 
		int numb3	=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write in three integer numbers, this program sort them in ascending ordr ");
		
		try {
			numb1= sc.nextInt();
			numb2= sc.nextInt();
			numb3= sc.nextInt();
			
						
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		if(numb1 >= numb2 && numb1 >= numb3 ) {
			if (numb2 >= numb3) {
				System.out.println(" The numbers are: "+ numb1 +" "+  numb2 +" "+ numb3);
					} else {
						System.out.println(" The numbers are:" + numb1 + " " + numb3 +" "+ numb2);
						
					}
	
		
		
	}
		if(numb2 >= numb1 && numb2 >= numb3 ) {
			if (numb1 >= numb2) {
				System.out.println(" The numbers are: "+ numb2 +" "+  numb3 +" "+ numb1);
					} else {
						System.out.println(" The numbers are:" + numb1 + " " + numb3 +" "+ numb2);
						
					}
	
		
		
	}
		if(numb1 >= numb2 && numb1 >= numb3 ) {
			if (numb2 >= numb3) {
				System.out.println(" The numbers are: "+ numb1 +" "+  numb2 +" "+ numb3);
					} else {
						System.out.println(" The numbers are:" + numb1 + " " + numb3 +" "+ numb2);
						
					}
	
		
		
	}
	
	}
	
}
