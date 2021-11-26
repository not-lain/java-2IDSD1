package project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ListUI;

public class Chiffres extends JFrame implements ActionListener {
	JPanel main, submitzone, tryZone, user, container,turnzone;
	JButton submit, menu, exit, b1, b2, b3, b4, b5, b6, b7, plus, minus, divide, times;
	JLabel msg, equation, number, player,l1,l2,l3;
	List<Integer> l = new ArrayList<Integer>();
	List<Integer> input = new ArrayList<Integer>();
	int a, b, eq, target,score,p1 = 0,p2 = 0,turn = 1,turnsLeft=9;

	Chiffres() {
		turnzone = new JPanel();
		turnzone.setLayout(new BoxLayout(turnzone, BoxLayout.Y_AXIS));
		player = new JLabel("turn :"+turn);
		l1 = new JLabel("p1 :"+p1);
		l2 = new JLabel("p2 : "+p2);
		l3 = new JLabel("turns left : "+turnsLeft);
		turnzone.add(player);
		turnzone.add(l1);
		turnzone.add(l2);
		turnzone.add(l3);
		
		
		
		
		
		
		
		tryZone = new JPanel(new GridLayout(7, 2));
		tryZone.setPreferredSize(new Dimension(200, 300));
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

		user = new JPanel(new BorderLayout());
		number = new JLabel();
		user.add(number, BorderLayout.NORTH);
		user.add(equation, BorderLayout.SOUTH);
		newRound();
		submitzone = new JPanel();
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
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		main.add(turnzone);
		main.add(tryZone);
		main.add(user);
		main.add(submitzone);
		container = new JPanel();
		container.add(main);
		this.add(container);
		this.setTitle("les numeros");
		this.setSize(300, 600);
		this.setLocation(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			System.exit(0);
		} else if (e.getSource() == menu) {
			dispose();
			Frame f = new Frame();
		} else if (e.getSource() == submit) {
			CalculateScore();
		}
		// numbers are scored under 999
		// signs are scored above 1000
		else if (e.getSource() == b1) {
			if (input.size() == 0) {
				input.add(l.get(0));
				b1.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(0));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(0));
						b1.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(0));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == b2) {
			if (input.size() == 0) {
				input.add(l.get(1));
				b2.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(1));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(1));
						b2.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(1));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == b3) {
			if (input.size() == 0) {
				input.add(l.get(2));
				b3.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(2));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(2));
						b3.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(2));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}
		} else if (e.getSource() == b4) {
			if (input.size() == 0) {
				input.add(l.get(3));
				b4.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(3));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(3));
						b4.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(3));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == b5) {
			if (input.size() == 0) {
				input.add(l.get(4));
				b5.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(4));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(4));
						b5.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(4));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == b6) {
			if (input.size() == 0) {
				input.add(l.get(5));
				b6.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(5));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(5));
						b6.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(5));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == b7) {
			if (input.size() == 0) {
				input.add(l.get(6));
				b7.setEnabled(false);
				equation.setText(equation.getText() + " " + l.get(6));
			} else {
				try {
					if (input.get(input.size() - 1) >= 1000) {
						input.add(l.get(6));
						b7.setEnabled(false);
						equation.setText(equation.getText() + " " + l.get(6));

					}

				} catch (Exception e1) {
					// TODO: handle exception
				}

			}

		} else if (e.getSource() == plus) {
			if (input.size() > 0) {
				if (input.get(input.size() - 1) < 999) {
					input.add(1000);
					equation.setText(equation.getText() + " + ");
				}
			}

		} else if (e.getSource() == minus) {
			if (input.size() > 0) {
				if (input.get(input.size() - 1) < 999) {
					input.add(2000);
					equation.setText(equation.getText() + " - ");
				}
			}

		} else if (e.getSource() == times) {
			if (input.size() > 0) {
				if (input.get(input.size() - 1) < 999) {
					input.add(3000);
					equation.setText(equation.getText() + " x ");
				}
			}

		} else if (e.getSource() == divide) {
			if (input.size() > 0) {
				if (input.get(input.size() - 1) < 999) {
					input.add(4000);
					equation.setText(equation.getText() + " / ");
				}
			}

		}
	}

	public int randomNumberGenerator() {
		Random r = new Random();
		int c = r.nextInt(99);
		return (c);
	}

	private void newRound() {
		l.clear();
		for (int i = 0; i < 7; i++) {
			l.add(randomNumberGenerator());
		}
		b1.setText("" + l.get(0));
		b2.setText("" + l.get(1));
		b3.setText("" + l.get(2));
		b4.setText("" + l.get(3));
		b5.setText("" + l.get(4));
		b6.setText("" + l.get(5));
		b7.setText("" + l.get(6));
		target = randomNumberGenerator();
		number.setText("your number is =" + target);
	}

	private void CalculateScore() {
		score = 0;
		
		if (input.get(input.size() - 1) >= 1000) {
			input.remove(input.size() - 1);
			System.out.println(input);
		}
		// importance pour multiplication et division
		boolean test_importance = true;
		while (test_importance) {
			test_importance = false;
			for (int i = 1; i < input.size(); i++) {
				if (input.get(i) >= 3000) {
					test_importance = true;
					a = input.get(i - 1);
					b = input.get(i + 1);
					if (input.get(i) == 3000) { // '*'
						eq = a * b;
						input.add(i + 2, eq);
						input.remove(i - 1);
						input.remove(i - 1);
						input.remove(i - 1);
						System.out.println(input);
					} else { // '/'
						eq = a / b;
						input.add(i + 2, eq);
						input.remove(i - 1);
						input.remove(i - 1);
						input.remove(i - 1);
						System.out.println(input);
					}
					break;
				}

			}
			// input does not contain '*' or '/' anymore
			// only '+' and '-' => '1000' and '2000' after i encoded them

			// sum
			while (input.size() > 1) {
				if (input.get(1) == 1000) {
					a = input.get(0);
					b = input.get(2);
					eq = a + b;
					input.add(0, eq);
					input.remove(1);
					input.remove(1);
					input.remove(1);
					System.out.println(input);

				} else if (input.get(1) == 2000) {
					a = input.get(0);
					b = input.get(2);
					eq = a - b;
					input.add(0, eq);
					input.remove(1);
					input.remove(1);
					input.remove(1);
					System.out.println(input);

				}

			}

		}
		score = (int) (100 - Math.abs(target - input.get(0)));
		if (score < 0 ) {
			score = 0 ; 
		}
		if (turn == 1) {
			p1+=score ; 
			turn = 2 ;
			player.setText("turn :"+turn);
			l1.setText("p1 :"+p1);
			newRound();
		}else {
			p2+=score;
			turn = 1 ;
			turnsLeft -= 1 ; 
			player.setText("turn :"+turn);
			l2.setText("p2 :"+p2);
			l3.setText("turns left : "+turnsLeft);
			newRound();
			if(turnsLeft == 0) {
				dispose();
				Score s = new Score(p1, p2);
			}
			
		}
	}

}
