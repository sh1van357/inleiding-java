package H05;

import java.applet.Applet;
import java.awt.*;

public class H052 extends Applet {

    //variable staaf diagram
    int hoogtegrafiek;

    public void init() {


        hoogtegrafiek =70;
        setBackground(Color.gray);

    }

    public void paint(Graphics g) {
        g.drawRect(50,50,400,400);
        g.drawLine(20,450,50,450);
        g.drawLine(20,350,50,350);
        g.drawLine(20,250,50,250);
        g.drawLine(20,150,50,150);
        g.drawLine(20,50,50,50);

        g.drawLine(50,450,50,80);
        g.drawLine(150,450,150,480);
        g.drawLine(250,450,250,480);
        g.drawLine(350,450,350,480);
        g.drawLine(450,450,450,480);
        g.drawLine(50,480,50,450);

        g.drawString("0KG",20,445);
        g.drawString("33KG",20,345);
        g.drawString("66KG",20,245);
        g.drawString("99KG",20,145);
        g.drawString("130KG",20,45);

        g.drawString("valerie",85,470);
        g.drawString("jeroen",185,470);
        g.drawString("Hans",285,470);
        g.drawString("shivan",385,470);

        g.setColor(Color.red);
        g.drawRect(80,320,35,130);
        g.setColor(Color.blue);
        g.drawRect(180,150,35,300);
        g.setColor(Color.yellow);
        g.drawRect(280,210,35,240);
        g.setColor(Color.orange);
        g.drawRect(380,100,35,350);
    }
}
