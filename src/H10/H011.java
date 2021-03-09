package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H011 extends Applet{

    //declaratie
    TextField Tekstvak;
    double Tekst;
    double Getal;
    Label Label;
    String S;

    public void init() {
        //Initalisatie
        Getal = 7;
        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvaklistener());
        Label = new Label("Voer een getal in en drukop enter");

        add(Label);
        add(Tekstvak);
    }

    public void paint(Graphics g) {

        setBackground(Color.pink);
        g.drawString("het hoogste ingevoerde getal: " + Getal,20,50);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hallo ik ben shivan" + i);

        }
    }

    private class Tekstvaklistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Tekst = Double.parseDouble(S);
            if (Tekst > Getal) {
                Getal = Tekst;
            }
            repaint();
        }
    }

}