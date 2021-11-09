package project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lettres extends JFrame implements KeyListener{
	JTextField  t1 , t2 , t3 ,t4 , t5 ,t6 ,t7;
	JCheckBox c1 ;
	JLabel word,msg,l1,l2,l3,l4,l5,l6,l7;
	JPanel main ,gamezone ,targetzone,submitzone ; 
	JButton submit , exit ; 
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
		msg = new JLabel("type here : ");
		gamezone = new JPanel();
		gamezone.add(msg);
		gamezone.add(t1);
		gamezone.add(t2);
		gamezone.add(t3);
		gamezone.add(t4);
		gamezone.add(t5);
		gamezone.add(t6);
		gamezone.add(t7);
		
		
		msg = new JLabel("your word is:   ");
		l1 = new JLabel(""+randomWordGenerator());
		l2 = new JLabel(""+randomWordGenerator());
		l3 = new JLabel(""+randomWordGenerator());
		l4 = new JLabel(""+randomWordGenerator());
		l5 = new JLabel(""+randomWordGenerator());
		l6 = new JLabel(""+randomWordGenerator());
		l7 = new JLabel(""+randomWordGenerator());
		targetzone = new JPanel();
		targetzone.add(msg);
		targetzone.add(l1);
		targetzone.add(l2);
		targetzone.add(l3);
		targetzone.add(l4);
		targetzone.add(l5);
		targetzone.add(l6);
		targetzone.add(l7);
		
		
		
		c1 = new JCheckBox("verify");
		submit = new JButton("submit");
		exit = new JButton("exit");
		submitzone= new JPanel();
		submitzone.add(c1);
		submitzone.add(submit);
		submitzone.add(exit);
		
		
		main = new JPanel();
		main.add(gamezone);
		main.add(targetzone);
		main.add(submitzone);
		this.setTitle("les lettres");
		this.add(main);
		this.setSize(300,400);
		this.setLocation(500,300);
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
	
	public char randomWordGenerator() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}
}
