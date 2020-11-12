package H11;

import java.applet.Applet;
import java.awt.*;

public class H012 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        for(int i=11;  i<20; i++) {
            g.drawString("" + i,50,i*10);
        }
    }
}
