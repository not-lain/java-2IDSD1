package project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class Chiffres extends JFrame implements ActionListener {
	JPanel main,submitzone,tryZone ;
	JButton submit , menu , exit,b1,b2,b3,b4,b5,b6,b7,plus,minus,divide,times ;
	JLabel msg,equation;
	List<Integer> l = new ArrayList<Integer>();
	
	Chiffres(){
		tryZone = new JPanel(new GridLayout(7,2)); 
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		plus = new JButton("+");
		minus = new JButton("-");
		times = new JButton("*");
		divide = new JButton("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		times.addActionListener(this);
		divide.addActionListener(this);
		newRound();
		equation = new JLabel("");
		tryZone.add(b1);
		tryZone.add(new JLabel());
		tryZone.add(b2);
		tryZone.add(plus);
		tryZone.add(b3);
		tryZone.add(minus);
		tryZone.add(b4);
		tryZone.add(times);
		tryZone.add(b5);
		tryZone.add(divide);
		tryZone.add(b6);
		tryZone.add(new JLabel());
		tryZone.add(b7);
		tryZone.add(equation);
		
		
		
		
		
		
		
		
		
		submitzone= new JPanel();
		submit = new JButton("submit");
		menu = new JButton("menu");
		exit = new JButton("exit");
		submit.addActionListener(this);
		menu.addActionListener(this);
		exit.addActionListener(this);
		submitzone.add(submit);
		submitzone.add(menu);
		submitzone.add(exit);
		
		main = new JPanel();
		main.add(tryZone);
		main.add(submitzone);
		this.add(main);
		this.setTitle("les numeros");
		this.setSize(300, 400);
		this.setLocation(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==exit) {
			System.exit(0);
		}
		else if(e.getSource()==menu){
			dispose();
			Frame f = new Frame();
		}
		else if(e.getSource()==submit) {
			//---calculate score
		}
		if(e.getSource()==b1) {
			equation.setText(equation.getText()+" "+l.get(0));
		}
	}
	
	
	
	public int randomNumberGenerator() {
		Random r = new Random();
		int c =  r.nextInt(999);
		return (c);
	}
	private void newRound() {
		l.clear();
		for(int i=0;i<7;i++) {
			l.add(randomNumberGenerator());
		}
		b1.setText(""+l.get(0));
		b2.setText(""+l.get(1));
		b3.setText(""+l.get(2));
		b4.setText(""+l.get(3));
		b5.setText(""+l.get(4));
		b6.setText(""+l.get(5));
		b7.setText(""+l.get(6));
	}



}
