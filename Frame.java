package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener {

	JButton numeros = new JButton("les numeros");
	JButton lettres = new JButton("les lettres");
	JButton exit = new JButton("exit");
	JLabel msg_intro;
	JPanel p_intro, content_intro;
	

	public Frame() {

		this.setTitle("les lettres et les numeros");
		p_intro = new JPanel(new FlowLayout());
		content_intro = new JPanel();

		content_intro.setLayout(new GridLayout(6, 0));
		numeros.addActionListener(this);
		lettres.addActionListener(this);
		exit.addActionListener(this);
		msg_intro = new JLabel("chose a game");
		content_intro.add(msg_intro);
		content_intro.add(lettres);
		content_intro.add(numeros);
		content_intro.add(new JLabel(""));
		content_intro.add(new JLabel(""));
		content_intro.add(exit);

		p_intro.add(content_intro, BorderLayout.NORTH);

		this.add(p_intro);
		this.setSize(300, 400);
		this.setLocation(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			System.exit(0);
		}
		if (e.getSource() == lettres) {
			dispose();
			Lettres l = new Lettres();
		}
		
		
		
		
		
		
		
		if (e.getSource() == numeros) {
			dispose();
			Chiffres c = new Chiffres();
		}

	}
}
