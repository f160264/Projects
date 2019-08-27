package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg1 {

	public static void main(String[] args) {

		String message = " Result of dice rolling";

		final int LIMIT = 20;
		int number = 0;
		int sum = 0;
		int value;

		do {
			value = Integer.parseInt(showInputDialog(message));
			if (1 <= value && 6 >= value) {
				sum += value;
				number++;
			} else {
				showMessageDialog(null, " Illegal value, throw are annulled");
			}

		} while (sum <= LIMIT);

		showMessageDialog(null, "Sum of trows" + number);
	}
}
