package H04;

import java.applet.Applet;
import java.awt.*;

public class H043 extends Applet{

    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50,50,5,150);
        g.setColor(Color.RED);
        g.fillRect(55,60,70,10);
        g.setColor(Color.white);
        g.fillRect(55,70,70,10);
        g.setColor(Color.blue);
        g.fillRect(55,80,70,10);

    }
}
