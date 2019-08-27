package no.hvl.dat100;

import java.util.Scanner;

public class Oppg2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int seconds	= 0;
		int minutes = 0;
		int hours 	= 0;
		int totmin 	= 0;

		System.out.println("Write in a number in seconds");
		int totsec = sc.nextInt();
		
		seconds = 	totsec % 60;
		totmin  = 	totsec / 60;
		minutes = 	totmin % 60;
		hours 	= 	totmin / 60;

		System.out.println("The time is: ");
		System.out.println(hours + "hours");
		System.out.println(minutes + "minutes");
		System.out.println(seconds + "seconds");

		// System.out.printf("%02.d%02.d%02.d", hours,minutes,seconds);

	}
}
