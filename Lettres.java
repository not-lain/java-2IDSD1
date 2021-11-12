package project;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lettres extends JFrame implements KeyListener, ActionListener {
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JCheckBox c1;
	JLabel word, msg, l1=new JLabel(), l2=new JLabel(), l3=new JLabel(), l4=new JLabel(), l5=new JLabel(), l6=new JLabel(), l7=new JLabel(), player1, player2, turn;
	JPanel main, gamezone, targetzone, submitzone, head, headzone;
	JButton submit, exit;
	int p1 = 0, p2 = 0, t = 1, score, alphabetValue;
	char alphabet;
	List<String> l = new ArrayList<String>();

	Lettres() {


		head = new JPanel();
		headzone = new JPanel();
		headzone.setLayout(new BoxLayout(headzone, BoxLayout.Y_AXIS));
		player1 = new JLabel("player 1: " + p1);
		player2 = new JLabel("player 2: " + p2);
		turn = new JLabel("turn: " + t);
		headzone.add(player1);
		headzone.add(player2);
		headzone.add(turn);
		head.add(headzone);

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
		targetzone = new JPanel();
		setNewWord();
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
		submit.addActionListener(this);
		exit = new JButton("exit");
		exit.addActionListener(this);
		submitzone = new JPanel();
		submitzone.add(c1);
		submitzone.add(submit);
		submitzone.add(exit);

		main = new JPanel();
		main.add(head);
		main.add(gamezone);
		main.add(targetzone);
		main.add(submitzone);
		this.setTitle("les lettres");
		this.add(main);
		this.setSize(300, 400);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		

	}

	
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		if ((int) e.getKeyChar() == 27) { // exit on escape key
			System.exit(0);
		}
		if (e.getSource() == t1) {
			if ((int) e.getKeyChar() != 8) {
				t2.requestFocus(true);
			}
		} else if (e.getSource() == t2) {
			if ((int) e.getKeyChar() != 8) {
				t3.requestFocus(true);
			}
		} else if (e.getSource() == t3) {
			if ((int) e.getKeyChar() != 8) {
				t4.requestFocus(true);
			}
		} else if (e.getSource() == t4) {
			if ((int) e.getKeyChar() != 8) {
				t5.requestFocus(true);
			}
		} else if (e.getSource() == t5) {
			if ((int) e.getKeyChar() != 8) {
				t6.requestFocus(true);
			}
		} else if (e.getSource() == t6) {
			if ((int) e.getKeyChar() != 8) {
				t7.requestFocus(true);
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

	public String randomWordGenerator() {
		Random r = new Random();
		char c = (char) (r.nextInt(26) + 'a');
		return ("" + c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// exit button
		if (e.getSource() == exit) {
			System.exit(0);
		}
		
		//submit button
		if (e.getSource() == submit) {

			
			calculateScore();
			if (t == 1) {
				p1 += score;
				player1.setText("player 1: " + p1);

			} else {
				p2 += score;
				player2.setText("player 2: " + p2);
			}

			// turn
			t1.requestFocus(true);
			t = (int) (1.5 + (-(t - 1.5))); // switch between 1 and 2 alternatively
			turn.setText("turn: " + t);// change player turn
			setNewWord();
			

		}
	}
	
	public void setNewWord() {
		l = new ArrayList<String>();
		for (int i = 0; i < 7; i++) {
			l.add(randomWordGenerator());
		}
		l1.setText(l.get(0));
		l2.setText(l.get(1));
		l3.setText(l.get(2));
		l4.setText(l.get(3));
		l5.setText(l.get(4));
		l6.setText(l.get(5));
		l7.setText(l.get(6));
	}

	public void calculateScore() {
		score = 0;
		alphabetValue = 0 ;
		// for loop on all JtextFields
					for (Component component : gamezone.getComponents()) {
						if (component instanceof JTextField) {
							// System.out.println(((JTextField) component).getText());
							try {
								//sometimes the field is empty and getting the character will create an error  
								alphabet =((JTextField) component).getText().charAt(0);
								if(l.contains(""+alphabet)) {
									l.remove(""+alphabet);
									System.out.println(alphabet+" :exists");
									alphabetValue = (int)alphabet -97 ;
									if (alphabetValue > 0 && alphabetValue < 26) {
										score += alphabetValue;
									}
									System.out.println("score "+score);
								}
							} catch (Exception e2) {
								// TODO: handle exception
							}
							
							// clear JtextField for the next player 
							((JTextField) component).setText(""); 
							
						}
					}
	}
}
