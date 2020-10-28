package H04;

import java.applet.Applet;
import java.awt.*;

public class H045 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100,70,180,200);
    }
}
