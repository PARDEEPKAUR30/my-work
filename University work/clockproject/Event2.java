package clockproject;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="Applet event" weight=200 height=300> </applet> */

public class Event2 extends Applet //implements ActionListener
{
	Button autoclock,setclock,exit;
	public void init() {
	Button autoclock=new Button("AutoClock");
	Button setclock=new Button("SetClock");
	Button exit=new Button("exit");
	setLayout(null);
	autoclock.setBounds(150,50,100,50);
	setclock.setBounds(150,150,100,50);
	exit.setBounds(150,250,100,50);
	add(autoclock);
	add(setclock);
	add(exit);}
}

