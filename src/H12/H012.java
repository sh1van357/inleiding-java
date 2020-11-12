package H12;

import java.applet.Applet;
import java.awt.*;

public class H012 extends Applet {

    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        TekenBaksteen(g,100,100,200,100,100,200,300,200);
    }

    public void TekenBaksteen(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){

       g.setColor(Color.red);
       g.fillRect(x1,y1,x2,y2);
       g.fillRect(x1,y1,x2,y2);

       g.setColor(Color.black);
        g.drawRect(x1,y1,x2,y2);

    }

}
