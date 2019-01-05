package clockproject;


	import java.awt.*;
	import java.applet.*;
	import java.awt.event.*;

	/* <applet code="Applet event" weight=200 height=300> </applet> */

	public class FinalAction extends Applet implements ActionListener{
		
			public void init() {				
			setBackground(Color.DARK_GRAY);
			Button clock=new Button("Clock");
			Button timer=new Button("Timer");
			Button exit=new Button("exit");
			setLayout(null);
			clock.setBounds(150,50,100,50);
			timer.setBounds(150,150,100,50);
			exit.setBounds(150,250,100,50);
			add(clock);
			add(timer);
			add(exit);}
			clock.addActionListener(this);
			//timer.addActionListener(this);
			//exit.addActionListener(this);
			
		   public void actionPerformed(ActionEvent e) {
			if(e.getSource()==clock) 
		private void repaint(new Action()) {
		}}
		   }
		   
			
	class Action extends Applet{
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
			

	
	
	/*class Event2 extends Applet //implements ActionListener
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
	}*/