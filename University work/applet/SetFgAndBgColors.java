package applet;
import java.awt.*;
import java.applet.*;
/* <applet code="SetFgAndBgColors" weight=200 height=300> </applet> */

public class SetFgAndBgColors extends Applet {
public void init() {
 setBackground(Color.black);
 setForeground(Color.white);}
 public void paint(Graphics g) {
	 g.drawString("Welcome in Applet world",50,100);
	}

}
