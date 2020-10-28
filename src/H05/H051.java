package H05;

import java.applet.Applet;
import java.awt.*;

public class H051 extends Applet {

    //kleur rechthoek
    Color rechthoekkleur =Color.magenta;

    //hoek van ovaal
    int getal30;

    //int getallen
    int getal1, getal2, getal3, getal4, getal5;
    public void init() {
        getal1 = 200;
        getal2 = 100;
        getal3 = 50;
        getal30 = 30;
        getal4 = 0;
        getal5 = 45;

        setBackground(Color.white);

    }


    public void paint(Graphics g) {
        g.setColor(rechthoekkleur);
        g.fillArc(50,50,getal1,getal2,getal4,getal5);
        g.setColor(Color.black);
        g.drawArc(50,50,getal1,getal2,getal4,360);
    }

}
