package H02;

import java.awt.*;

public class H022 extends Applet {

    public void init() {

        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Shivan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Badloe", 50, 70 );
    }

}
