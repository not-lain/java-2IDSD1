package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Score extends JFrame implements ActionListener{
	JLabel msg ;
	JButton menu ;
	JPanel main ;
	public Score(int p1,int p2){
		if (p1>p2) {
			msg = new JLabel("player 1 has won");
		}else {
			msg = new JLabel("player 2 has won");
		}
		
		
		menu = new JButton("menu");
		menu.addActionListener(this);
		main = new JPanel();
		main.add(msg);
		main.add(menu);
		this.add(main);
		this.setTitle("Congrats");
		this.pack();
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
	}
}
