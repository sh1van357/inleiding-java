package PraktijkOp;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HOefen extends Applet {

    Button Knop;
    TextField tekstvak;
    int Counter;
    Label label;

    Color BackgroundColor;

    public void init() {

        label = new Label("");
        add(label);
        label.setSize(200,200);

        BackgroundColor = Color.RED;
        Counter = 100;

        Knop = new Button();
        add(Knop);

        tekstvak = new TextField("",50);
        tekstvak.setSize(200,100);
        add(tekstvak);


        Knop.addActionListener(new TextToTerminalListener());


    }

    public void paint(Graphics g) {
        setBackground(BackgroundColor);
        tekstvak.setText("Dit is een Bericht Nummer" + Counter);
        tekstvak.setSize(200,200);

        Knop.setLocation(50,200);
        Knop.setSize(200,100);
    }

    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = tekstvak.getText();
            Knop.setLabel(message);


        }

    }


}
