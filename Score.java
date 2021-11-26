package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Score extends JFrame implements ActionListener{
	JLabel msg ;
	JButton menu,exit ;
	JPanel main,container,buttonfield ;
	public Score(int p1,int p2){
		if (p1>p2) {
			msg = new JLabel("player 1 has won");
		}else if (p1<p2) {
			msg = new JLabel("player 2 has won");
		}
		else {
			msg = new JLabel("egalite");
		}
		
		
		
		main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		main.add(msg);
		
		
		buttonfield = new JPanel();
		menu = new JButton("menu");
		exit = new JButton("exit");
		menu.addActionListener(this);
		exit.addActionListener(this);
		buttonfield.add(menu);
		buttonfield.add(exit);
		
		main.add(buttonfield);
		container = new JPanel();
		container.add(main);
		this.add(container);
		this.setTitle("Congrats");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==menu) {
			dispose();
			Frame f = new Frame();
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}
}
