package clockproject;
import java.awt.*;
import java.applet.Applet;


public class Event3 extends Applet //implements ActionListener
{
	Label clockl,timerl,existl,resultl,minute,hour,second;
	TextField time,minutet,hourt,secondt;
	Button ok,exit;
	public void init() {
		hour=new Label("Hour");
		minute=new Label("Minute");
		second=new Label("Second");
		hourt=new TextField();
		minutet=new TextField();
		secondt=new TextField();
		ok=new Button("OK");
		exit=new Button("Exit");
		setLayout(null);
		hour.setBounds(100,50,100,50);
		minute.setBounds(100,150,100,50);
		second.setBounds(100,250,100,50);
		hourt.setBounds(200,50,100,50);
		minutet.setBounds(200,150,100,50);
		secondt.setBounds(200,250,100,50);
		ok.setBounds(150,350,100,50);
		exit.setBounds(150,450,100,50);
	add(hour);
	add(minute);
	add(second);
	add(hourt);
	add(minutet);
	add(secondt);
	add(ok);
	add(exit);}
}


