package H04;

import java.applet.Applet;
import java.awt.*;

public class H046 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        g.fillRect(300,350,15,300);
        g.drawArc(300,300,80,140,180,180);
    }
}
