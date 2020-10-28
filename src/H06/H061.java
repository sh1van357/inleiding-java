package H06;

import java.applet.Applet;
import java.awt.*;

public class H061 extends Applet {

    int getal1, getal2, getal3, product;

    public void init() {
        setBackground(Color.gray);

        getal1 = 28;
        getal2 = 0;
        getal3 = 113;
        product = 113;

        product = getal1 + getal1 + getal1 + getal1;

    }

    public void paint(Graphics g) {

        //namen van iedereen
        g.drawString("jan",50,50);
        g.drawString("ali",50,65);
        g.drawString("jeanette",50,80);
        g.drawString("shivan",50,95);

        //de som
        g.drawString("113 delen over 4 mensen",50,120);

        g.drawString("",50,150);



    }

}