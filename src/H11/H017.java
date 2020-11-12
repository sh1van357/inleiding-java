package H11;

import java.applet.Applet;
import java.awt.*;

public class H017
        extends Applet {

    public void paint(Graphics g) {
        int X = 10;
        int Y = 10;
        int H = 1020;
        int W = 1020;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;

        while (Aantal < 50) {
            Aantal++;
            H -= 20;
            W -= 20;
            X += 10;
            Y += 10;
            g.drawArc(X,Y,W,H,Arcstart,Arcangle);
        }
    }
}