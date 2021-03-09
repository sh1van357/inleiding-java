package PraktijkOp;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastSheet extends Applet {

    //Declaratie

    Button Knop;
    int Counter;

    public void init() {

        Knop = new Button(" Klik op mij ");

        Counter = 1;

        //actionlistener
        Knop.addActionListener(new TekstToTerm());


        add(Knop);
    }

    public void paint(Graphics g) {

        Knop.setLocation(10,10);

    }

    class TekstToTerm implements ActionListener{

        public void actionPerformed(ActionEvent e) {


            System.out.println("klik" +Counter);
            getGraphics().drawString("Het scherm is" + Counter + "Keer ververst",20,100);

            Counter++;

        }
    }

}