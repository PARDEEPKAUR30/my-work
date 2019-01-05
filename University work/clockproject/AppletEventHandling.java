package clockproject;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="Applet event" weight=200 height=300> </applet> */

   
public class AppletEventHandling extends Applet//implements ActionListener
{
Button clock,timer,exit;
	
	public void init() {
		setBackground(Color.GRAY);
		Button clock=new Button("Clock");
		Button timer=new Button("Timer");
		Button exit=new Button("exit");
		setLayout(null);
		clock.setBounds(150,50,100,50);
		timer.setBounds(150,150,100,50);
		exit.setBounds(150,250,100,50);
		add(clock);
		add(timer);
		add(exit);
		//clock.addActionListener(this);
		//timer.addActionListener(this);
		//exit.addActionListener(this);
		}}
	
	//public void actionPerformed(ActionEvent e) {
		