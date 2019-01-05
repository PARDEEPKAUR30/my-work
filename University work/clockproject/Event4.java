package clockproject;

import java.applet.Applet;
import java.awt.*;
public class Event4 extends Applet //implements ActionListener
{
	Label time;
	TextField timet;
	Button exit;
	public void init() {
		//setBackground(Color.gray);
		time=new Label("Time");
		timet=new TextField();
		exit=new Button("Exit");
		setLayout(null);
		time.setBounds(100,100,50,50);
		timet.setBounds(200,100,100,50);
		exit.setBounds(100,200,100,50);
	add(time);
	add(timet);
	add(exit);
}
}
