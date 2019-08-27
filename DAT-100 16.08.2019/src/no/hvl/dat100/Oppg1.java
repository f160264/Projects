package no.hvl.dat100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oppg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number1 = 0;
		double number2 = 0;

		double sum;
		double area;
		Scanner sc = new Scanner(System.in);

		System.out.println("This ia a calculator that calculate the sum and area of a rectang");
		System.out.println(" ");
		System.out.println("Write in the first number and press enter between each number");
		System.out.println("Press enter then to calculate");
		
		System.out.println(" ");

		number1 = sc.nextDouble();
		number2 = sc.nextDouble();
		
		sum = number1 + number2;
		area = (number1 * number2);

		System.out.println(" ");
		System.out.print("Sum of the two numbers are " + sum);
		System.out.println(" ");
		System.out.println("The area of the square is " + area);
		sc.close();

	}

}
