package project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lettres extends JFrame implements KeyListener{
	JLabel word ;
	JTextField t1 , t2 , t3 ,t4 , t5 ,t6 ,t7;
	JCheckBox c1 ;
	JPanel p1 ;
	Lettres(){
		t1 = new JTextField(1);
		t1.addKeyListener(this);
		t2 = new JTextField(1);
		t2.addKeyListener(this);
		t3 = new JTextField(1);
		t3.addKeyListener(this);
		t4 = new JTextField(1);
		t4.addKeyListener(this);
		t5 = new JTextField(1);
		t5.addKeyListener(this);
		t6 = new JTextField(1);
		t6.addKeyListener(this);
		t7 = new JTextField(1);
		t7.addKeyListener(this);
		word = new JLabel("your word:");
		p1 = new JPanel();
		p1.add(word);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);
		p1.add(t7);
		
		
		
		
		
		this.setTitle("les lettres");
		this.add(p1);
		this.setSize(300,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if((int)e.getKeyChar()==27) { //exit on escape key
			System.exit(0);
		}
		if (e.getSource()==t1) {
			if((int)e.getKeyChar()!=8) {
				System.out.println(e.getKeyChar());
				this.nextFocus();
			}
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
