package no.hvl.dat100;

import static java.lang.String.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class Oppg1 {

	public static void main(String[] args) {

		final double mva = 25.0;
		final double factor = (1 + mva / 100);
		String numbertxt = showInputDialog("Write in amount of money");
		double amount = parseDouble(numbertxt);
		double moms = amount * mva / 100;
		double wmva = amount * factor;
		double womva = factor / 100;

		String out1 = "Amount of money without mva is " + format("%4.2f", amount) + "\n" + "Amount of money with mva is "
				+ format("%4.2f", wmva) + "\n" + " The mva is " + format("%4.2f", mva) + " kroner";

		showMessageDialog(null, out1);
		
		
		System.out.println("The amount with mva will be " + format("%4.2f", wmva));
		System.out.println("The MVA will be " + womva);

		moms = amount - womva;

		String out2 = "Recipt: " + "\n" + "Amount of money with mva is " + format("%4.2f", wmva) + "\n" + "Amount of money without mva is "
				+ format("%4.2f", amount) + "\n" + " The mva is " + format("%.2f", mva) + " kroner";

		showMessageDialog(null, out2);

		System.out.println("The amount with mva will be " + format("%.2f", wmva));
		System.out.println("The mva will be " + format("%.2f", mva));

	}

}
