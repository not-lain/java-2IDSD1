package project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Frame implements ActionListener {
	
	
	JButton numeros = new JButton("les numeros");
	JButton lettres = new JButton("les lettres");
	JButton exit = new JButton("exit");
	JLabel msg_intro;
	JPanel p_intro , content_intro ;
	JFrame frame ;
	public Frame() {
		
		frame = new JFrame("les lettres et les numeros");
		msg_intro = new JLabel("chose a game");
		p_intro = new JPanel(new BorderLayout());
		content_intro = new JPanel();
		numeros.addActionListener(this);
		lettres.addActionListener(this);
		exit.addActionListener(this);
		content_intro.setLayout(new GridLayout(3,0));
		content_intro.add(msg_intro);
		content_intro.add(numeros);
		content_intro.add(lettres);
		
		
		p_intro.add(content_intro,BorderLayout.NORTH);
		p_intro.add(exit,BorderLayout.SOUTH);
		
		frame.add(p_intro);
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit) {
			System.exit(0);
		}
		if(e.getSource()==numeros) {
			
		}
		if(e.getSource()==lettres) {
			
		}
	}
}
