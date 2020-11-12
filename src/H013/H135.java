package H013;

import java.awt.*;
import java.applet.*;

public class H135 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        drawBoompie(g, 50, 50, 200, 500);
    }

    void drawBoompie(Graphics g, int x, int y, int w, int h) {
        if (h < w*1.6) {
            h = w/10*16;
        }

        g.setColor(new Color(110, 44, 31));
        g.fillRect(x + (w / 5 * 2), y + (w / 10 * 9), w / 5 * 1, h - (w / 10 * 9));
        g.setColor(new Color(50, 205, 76));
        g.fillOval(x, y, w, w);
    }
}
