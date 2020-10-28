package H04;

import java.applet.Applet;
import java.awt.*;

public class H047 extends Applet {

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRoundRect(50,50,300,300,50,50);

        g.setColor(Color.black);
        g.fillOval(100,110,70,70);
        g.fillOval( 220,110,70,70);
        g.fillOval(100,220,70,70);
        g.fillOval(220,220,70,70);
    }

}
