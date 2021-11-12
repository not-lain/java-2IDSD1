package project;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
	JLabel msg ;
	public Score(int p1,int p2){
		if (p1>p2) {
			msg = new JLabel("player 1 has won");
		}else {
			msg = new JLabel("player 2 has won");
		}
		
		this.add(msg);
		this.setTitle("Congrats");
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
