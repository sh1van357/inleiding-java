package PraktijkOp;

import com.sun.deploy.security.SelectableSecurityManager;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheIfs extends Applet {

    TextField tekstvak;
    String Greeting;
    int[] getallen = {4,6,8,1,4,7,2};

    public void init() {

        tekstvak = new TextField();
        add(tekstvak);
        tekstvak.addActionListener(new Tekstlistener());

        Greeting = "...";



    }

    public void paint(Graphics g) {

        getGraphics().drawString("Kies uit: ochtend, Middag, Avond. ", 50,50);

        g.drawString( Greeting, 50,70 );

        g.drawString("Op index 4 staat" + getallen[2] + ". " ,50,80);



        tekstvak.setSize(200,50);
        tekstvak.setLocation(50,150);

    }

    class Tekstlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("Klik!");

            for (int i = 0; i < 10; i++) {
                System.out.println("princess");


                String Userinput = tekstvak.getText();
            System.out.println(Userinput);

            switch (Userinput) {

                case "ochtend": Greeting = "goedenmorgen"; break;
                case "middag" : Greeting = "goedenmiddag"; break;
                case "avond" : Greeting = "goedenavond"; break;
                default: Greeting = "...";


                    }

            }

            repaint();
        }

    }


}
