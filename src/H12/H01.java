package H12;

import java.applet.Applet;
import java.awt.*;

public class H01 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        TekenVijfhoek(g,10,10,80,90,130,100,220,110,310,85);
    }

    public void TekenVijfhoek(Graphics g,int x1, int y1, int x2, int y2, int x3, int y3, int x4,int y4, int x5, int y5){

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x5,y5);
        g.drawLine(x5,y5,x1,y1);

    }

}
