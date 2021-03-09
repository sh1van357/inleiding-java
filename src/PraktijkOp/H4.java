package PraktijkOp;

import java.applet.Applet;
import java.awt.*;

public class H4 extends Applet {

    public void init() {
        setSize(1000,700);

    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        //liker helft figuren
        g.drawLine(50,50,250,50);
        g.drawRect(50,100,200,200);
        g.drawRoundRect(50, 350,200,200,20,20);

        //mid figuren
        g.setColor(Color.magenta);
        g.fillRect(300,100,300,200);
        g.fillOval(300,350,300,200);

        g.setColor(Color.black);
        g.drawOval(300,350,300,200);
        g.drawOval(300, 100,300,200);

        g.setColor(Color.magenta);
        g.fillOval(700,350,200,200);
        g.fillArc(650,100,300,200,45,30);

        //rechter helft figuren
        g.setColor(Color.black);
        g.drawOval(650,100,300,200);
        g.drawOval(700,350,200,200);


        g.drawString("lijn", 150,70);
        g.drawString("Rechthoek",130,320);
        g.drawString("Afgeronde Driehoek",100,570);

        g.drawString("Gevulde Rechthoek Met Ovaal",350,320);
        g.drawString("Gevulde Ovaal",400,580);
        g.drawString("Taartpunt Met Ovaal Eromheen",720,320);
        g.drawString("cirkel",780,580);

    }
}
