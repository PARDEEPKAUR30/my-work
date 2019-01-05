package applet;

import java.awt.*;
import java.applet.*;

/* <applet code="ScrollTheMessageRightToLeft" weight=200 height=300> </applet> */

public class ScrollTheMessageRightToLeft extends Applet implements Runnable {
  String s="Welcome To GNA University       ";
  boolean stopFlag;
  Thread t=null;
  public void init() {
	  setBackground(Color.black);
	  setForeground(Color.green);
	  }
  
	  public void paint(Graphics g) {  
	    g.setFont(new Font("TimesRoman",Font.PLAIN,32));
	    g.drawString(s, 50, 100);}
	  
	  public void start() {
	   t=new Thread(this);
		stopFlag=false;
		t.start();
	  }
	  public void run() {
		  char c;
		  for(;;) {
			  try {
				  repaint();
				  Thread.sleep(500);
				  c=s.charAt(0);
				  s=s.substring(1,s.length());
			  s+=c;
			  if(stopFlag)
				  break;
			  }
			  catch(InterruptedException e) {
				 System.out.println(e); 
			  }}}
			  public void stop() {
				  stopFlag=true;
				  t=null;
			  }	  
}
