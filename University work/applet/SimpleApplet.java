package applet;
import java.awt.*;
import java.applet.*;
/* <applet code="SimpleApplet" weight=200 height=300> </applet> */

public class SimpleApplet extends Applet {

  public void paint(Graphics g) {
	g.drawString("This is my applet", 50, 100);  
	//showStatus("Display Message");
  }
}

