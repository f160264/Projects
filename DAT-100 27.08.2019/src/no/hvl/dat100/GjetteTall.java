package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


import static java.lang.Integer.*;

public class GjetteTall {

  public static void main( String[] args ) {
	  
	  final int HEMMELIG = 745;
	  
	  int number = 0; 
	  int lowlimit = 0;
	  int highlimit = 20;
	  int suggestion = 0;
	  int right = 0;
	  boolean correct = false; 
	  
	 number = Integer.parseInt(showInputDialog("Hemmelig tall"));
	  
	  
	  do {
		  suggestion = ((lowlimit+highlimit)/2);
		  showMessageDialog(null, "Suggestion: ( press -1 for less than, 0 for right and 1 for larger" );
		  correct = (suggestion == number);
		  int answ=Integer.parseInt(showInputDialog("Svar? "));
		  correct = (answ ==0);
		  if (right < 0 ) {
			  lowlimit = suggestion;
		  }
		  
			  else {
				  
			  }
			 
			
		}
		
	} while (!right);
	  
	  
	  
	  showMessageDialog(null, " " + );
	  
	  
	  
    int laveste = 0, høyeste = 1000;
    String melding = "Tenk på et tall i området " +
                     laveste + " -- " + høyeste + ".";
    showMessageDialog(null, melding);
    int tall = (laveste + høyeste) / 2;
    boolean riktigGjettet = false;
    while ( !riktigGjettet ) {
      melding = "Tenkte du på " + tall + "? "
              + "Skriv 0 for ja, -1 hvis for høyt, "
              + "1 hvis for lavt:";
      int svar = parseInt( showInputDialog(melding) );    

      if ( svar == 0 )
        riktigGjettet = true;
      else if ( svar == -1 )
        høyeste = tall - 1;
      else
        laveste = tall + 1;    

      if ( laveste == høyeste )
        riktigGjettet = true;     

      tall = (laveste + høyeste) / 2;
    }

    melding = "Du tenkte på " + tall + "!";
    showMessageDialog(null, melding);
  }

}