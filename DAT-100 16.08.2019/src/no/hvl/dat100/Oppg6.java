package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class Oppg6 extends EasyGraphics  {

    public static void main(String[] args) {
        launch(args);
    }
 
    public void run() {
        int x0 = 50;
        int y0 = 50;
        int x1 = 700;
        int y1 = 500;
        int height = (int)(1/3.0 * (y1));
 
        makeWindow("Det Tyske flagget");
        drawRectangle(x0, y0, x1, y1);
        setColor(0, 0, 0);
        fillRectangle(x0, y0, x1, height);
        y0 += height;
        setColor(255, 0, 0);
        fillRectangle(x0, y0, x1, height);
        y0 += height;
        setColor(255, 255, 0);
        fillRectangle(x0, y0, x1, height);
    }
}

