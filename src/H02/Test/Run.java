package H02.Test;

import H02.Applet;

import java.awt.*;

public class Run {

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

    //een klasse met de naam Show van het type Applet
    public class Show extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {

        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.drawString("Welcome to Java!!", 50, 60 );
        }

    }
}
