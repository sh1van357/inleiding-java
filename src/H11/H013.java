package H11;

import java.applet.Applet;
import java.awt.*;

public class H013 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int Getal = 1;
        int Getal2 = 1;
        int X = 10;

        while (Getal < 100) {
            X += 40;
            g.drawString("" + " " + Getal2,X,10);
            Getal += Getal2;
            Getal2 += Getal;
        }
    }
}
