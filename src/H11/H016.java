package H11;

import java.applet.Applet;
import java.awt.*;

public class H016 extends Applet {

    public void paint(Graphics g) {
        int X = 50;
        int Y = 50;
        int H = 120;
        int W = 120;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;

        while (Aantal < 5) {
            Aantal++;
            H -= 20;
            W -= 20;
            X += 10;
            Y += 10;
            g.drawArc(X,Y,W,H,Arcstart,Arcangle);
        }
    }
}
