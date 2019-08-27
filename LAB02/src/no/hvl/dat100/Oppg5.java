package no.hvl.dat100;

import java.util.Scanner;

public class Oppg5 {

	public static int readNumber() {

		Scanner sc = new Scanner(System.in);
		int number = 0;

		boolean ready = false;
		do {
			try {
				number = sc.nextInt();
				ready = true;
			} catch (Exception e) {
			}
		} while (!ready);

		return number;

	}

	static long faculty(int x) {
		int a = 1;

		faculty(x);

		if (x < 1) {
			return 1;

		}
//	            for (int i = 1; i <= x; i++) {
//	                a = a*i; 
//	            }

		return faculty(x - 1) * 1;
//	            return a; 
	}

	public static void main(String[] args) {

		int x = readNumber();

	}
}