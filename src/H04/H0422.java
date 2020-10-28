package H04;

import org.omg.CosNaming.BindingIterator;

import java.applet.Applet;
import java.awt.*;

public class H0422 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }


    public void paint(Graphics g) {

        //main huis vorm
        g.setColor(Color.red);
        g.drawRect(50,200,400,300);

        //dak
        g.drawLine(50,200,250,100);
        g.drawLine(450,200,250,100);

        //deur
        g.drawRect(340,360,70,140);

        //raampie
        g.drawRect(100,370,130,60);

    }
}
