package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class ElevAndeler extends EasyGraphics {

	  public static void main(String[] args) {
		    launch(args);
		  }

		  public void run() {
		    int bredde = 600, høyde = 520;
		    makeWindow("Kjønnsfordeling", bredde, høyde);

		    int guttA = 28, guttB = 38, guttC = 46;
		    int jenteA = 100-guttA, jenteB = 100-guttB, jenteC = 100-guttC;

		    int y = høyde/7;

		    setFont("Arial", 18);
		    drawString("Gutter",0,y-5);
		    drawString("Jenter",bredde-50, y-5);

		    // Kjønnsfordeling i A-klassen
		    int figBreddeA = guttA*bredde/100;
		    setColor(0,255,0);  // Grønt for gutter
		    fillRectangle(0, y, figBreddeA, y);  
		    int restfigBreddeA = jenteA*bredde/100;    
		    setColor(255,0,0);  // Rødt for jenter
		    fillRectangle(figBreddeA, y, restfigBreddeA, y);
		    setColor(0,0,0);    // Svart ramme og prosentverdier
		    drawRectangle(0, y, bredde, y);  
		    drawString("A",bredde/2, y-5); 
		    drawString(guttA+"%",0, 5*y/2); 
		    drawString(jenteA+"%",bredde-35, 5*y/2); 

		    // Kjønnsfordeling i B-klassen
		    int figBreddeB = guttB*bredde/100;
		    setColor(0,255,0);
		    fillRectangle(0, 3*y, figBreddeB, y);  
		    int restfigBreddeB = jenteB*bredde/100;    
		    setColor(255,0,0);  
		    fillRectangle(figBreddeB, 3*y, restfigBreddeB, y);
		    setColor(0,0,0);
		    drawRectangle(0, 3*y, bredde, y);  
		    drawString("B",bredde/2, 3*y-5); 
		    drawString(guttB+"%",0, 9*y/2); 
		    drawString(jenteB+"%",bredde-35, 9*y/2); 

		    // Kjønnsfordeling i C-klassen
		    int figBreddeC = guttC*bredde/100;
		    setColor(0,255,0);
		    fillRectangle(0, 5*y, figBreddeC, y);  
		    int restfigBreddeC = jenteC*bredde/100;    
		    setColor(255,0,0);  
		    fillRectangle(figBreddeC, 5*y, restfigBreddeC, y);
		    setColor(0,0,0);
		    drawRectangle(0, 5*y, bredde, y);  
		    drawString("C",bredde/2, 5*y-5); 
		    drawString(guttC+"%",0, 13*y/2); 
		    drawString(jenteC+"%",bredde-35, 13*y/2); 
		  }
		}
	
	


