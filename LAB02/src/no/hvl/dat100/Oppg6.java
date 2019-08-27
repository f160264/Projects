package no.hvl.dat100;

import java.util.Scanner;


public class Oppg6 {
	
	public static int readNumber () {
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean ready = false; 
		
		do {
			try {
				number = sc.nextInt(); 
				ready = true; 
			} catch (Exception e) {
				
			}
		} while(!ready);
		return number; 
		
	}
	
	public static int readGrade() {
		
		int gradesum = 0; 

		return gradesum;
		
		
	}
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int numOfStud = 0; // Number of students
	double gradesum = 0; 
	
	System.out.println("Write in the number of students that you want to grade");
	numOfStud= sc.nextInt(); 
	
	readNumber(); 
	readGrade();
	
	
	
	// System that is working but not good programming:
	
	/* Scanner sc = new Scanner(System.in);

	System.out.println(" Write in the gradesum: ");

	double gradesum = 0;

	int n = 0; // Number of students

	System.out.println(" Please write in the number of students that you want to add grades to");
	n = sc.nextInt();
	
	do {
		System.out.println(" Please write in the students grade");
		for (int i = 0; i < n; i++) {

			gradesum = sc.nextInt();
			if (gradesum >= 90 && gradesum <= 100) {
				System.out.println(" The grade is A ");
			} else if (gradesum >= 80 && gradesum <= 89) {
				System.out.println(" The grade is B ");
			} else if (gradesum >= 60 && gradesum <= 79) {
				System.out.println(" The grade is C ");
			} else if (gradesum >= 50 && gradesum <= 59) {
				System.out.println(" The grade is D ");
			} else if (gradesum >= 40 && gradesum <= 49) {
				System.out.println(" The grade is E ");
			} else if (gradesum <= 39) {
				System.out.println(" The grade is F ");
			}
		}

	} while (gradesum < 0 && gradesum >= 100);

	System.out.printf("You have now entered the grades of " + n + " students");
	
	*/
	
	
	
	
}

}
