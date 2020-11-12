package H08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H081 extends Applet {

    // Declareren
    TextField TestTextField;
    Button okKnop;
    Button resetKnop;
    Label label;


    public void init() {
        setBackground(Color.lightGray);

        TestTextField = new TextField("",20);

        okKnop = new Button();
        okKnop.setLabel("OK");
        label = new Label("hier komt iets");

        resetKnop = new Button();
        resetKnop.setLabel("Reset");

        add(okKnop);
        add(resetKnop);
        add(TestTextField);
        add(label);

        okKnop.addActionListener(new OkKnopListener());
        resetKnop.addActionListener(new ResetknopListener());


    }

    public void paint(Graphics g) {

        TestTextField.setSize(400,150);
        TestTextField.setLocation(50,150);
        okKnop.setLocation(50,100);
        resetKnop.setLocation(200,100);
        okKnop.setSize(100,40);
        resetKnop.setSize(100,40);
        label.setLocation(50,350);



    }

    class OkKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = TestTextField.getText();
            label.setText(message);
            repaint();

        }
    }

    class ResetknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            TestTextField.setText("");

        }
    }

}
