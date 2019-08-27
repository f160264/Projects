package no.hvl.dat100;

import java.util.Scanner;


public class Oppg1 {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double answ = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Write in two numbers to divide: ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		answ = a / b;
		if (b <= 0) {
			System.out.println(" Yoy cant divide by 0");
		} else {
		System.out.println(answ);
		}

	}


}
