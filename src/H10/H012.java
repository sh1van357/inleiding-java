package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H012 extends Applet {

    //Declaratie
    TextField Tekstvak;
    double Tekst;
    double Getal;
    String S;
    Label Label;
    double Laagstegetal;

    public void init() {


        //Initalisatie
        Getal = 7;
        Laagstegetal = 7;

        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvaklistener());
        Label = new Label("Voer een getal in en druk op enter!");

        add(Label);
        add(Tekstvak);

        setBackground(Color.cyan);
        setSize(800,500);

    }

    public void paint(Graphics g) {

        g.setColor(Color.gray);


        g.drawString("Het hoogste getal dat ingevoerd is: " + Getal,20,40);
        g.drawString("het laagste getal dat ingevoerd is: " + Laagstegetal,20,60);
    }

    private class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Tekst = Double.parseDouble(S);
            if (Tekst > Getal ) {
                Getal = Tekst;
            }
            if (Tekst < Laagstegetal) {
                Laagstegetal = Tekst;
            }
            repaint();
        }
    }
}