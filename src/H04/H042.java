package H04;

import java.applet.Applet;
import java.awt.*;

public class H042 extends Applet {

    public void init() {

        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
       g.drawRect(100,100,200,150);
        g.drawRect(230,140,60,110);
        g.drawRect(135, 160, 55, 55);

        g.drawLine(300,100,200,50);
        g.drawLine(100,100,200,50);

    }
}
