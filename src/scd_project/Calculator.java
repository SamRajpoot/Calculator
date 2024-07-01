package scd_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Author: Mazhar Rehan, Usama Bin Naseer, Sameer Nasir
 * Date: 23th-July-2024
 * Description: This class is a simple calculator application that performs basic arithmetic operations.
 * Tool: Eclipse IDE
 */

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private double num1;
	private double num2;
	private boolean isOn;
	private JTextField tfdisplay;

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"D:\\BSSE\\S6\\Software Construction and Development - Lab\\Term Project\\scd_project\\scd_project\\src\\ic_calculator.png"));
		setTitle("Calculator");
		this.isOn = false; // Calculator is off initially
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 478);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfdisplay = new JTextField();
		tfdisplay.setForeground(new Color(0, 0, 128));
		tfdisplay.setCaretColor(Color.BLUE);
		tfdisplay.setEnabled(false);
		tfdisplay.setEditable(false);
		tfdisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfdisplay.setBounds(16, 24, 346, 42);
		contentPane.add(tfdisplay);
		tfdisplay.setColumns(10);

		JRadioButton rdbtnOn = new JRadioButton("ON");
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// when ON radio button is clicked
				if (rdbtnOn.isSelected()) {
					isOn = true;
					tfdisplay.setText("");
					tfdisplay.setEnabled(true);
					// tfdisplay.setEditable(true);
					rdbtnOff.setSelected(false);
				}
			}
		});
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOn.setBounds(16, 82, 51, 21);
		contentPane.add(rdbtnOn);

		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnOff.isSelected()) {
					// set the calculator to OFF
					isOn = false;
					tfdisplay.setText("");
					tfdisplay.setEnabled(false);
					// tfdisplay.setEditable(false);
					rdbtnOn.setSelected(false);
				}
			}
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOff.setBounds(96, 82, 51, 21);
		contentPane.add(rdbtnOff);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if the calculator is on
				if (isOn) {
					tfdisplay.setText("");
				}
				// else do nothing
			}
		});
		btnClear.setBackground(new Color(204, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(16, 128, 73, 42);
		contentPane.add(btnClear);

		JButton btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					if (text.length() > 0) {
						// remove the last character from the text
						text = text.substring(0, text.length() - 1);
						tfdisplay.setText(text);
					}
				}
				// else do nothing
			}
		});
		btnDelete.setBackground(new Color(204, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(105, 128, 73, 42);
		contentPane.add(btnDelete);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "/");
				}
			}
		});
		btnDivide.setBackground(new Color(72, 209, 204));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDivide.setBounds(289, 128, 73, 42);
		contentPane.add(btnDivide);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "-");
				}
			}
		});
		btnSubtract.setBackground(new Color(72, 209, 204));
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubtract.setBounds(289, 304, 73, 42);
		contentPane.add(btnSubtract);

		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "*");
				}
			}
		});
		btnMultiply.setBackground(new Color(72, 209, 204));
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMultiply.setBounds(289, 187, 73, 42);
		contentPane.add(btnMultiply);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "+");
				}
			}
		});

		btnAdd.setBackground(new Color(72, 209, 204));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(289, 242, 73, 42);
		contentPane.add(btnAdd);

		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "%");
				}
			}
		});

		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					try {
						double result = calculate(text);
						tfdisplay.setText(String.valueOf(result));

					} catch (NumberFormatException ex) {
						tfdisplay.setText("Syntax Error");
						System.out.println(ex + " Syntax Error: Invalid number format");
					} catch (ArithmeticException ex) {
						tfdisplay.setText("Math Error");
						System.out.println(ex + " Math Error: " + ex.getMessage());
					} catch (IllegalArgumentException ex) {
						tfdisplay.setText("Syntax Error");
						System.out.println(ex + " Syntax Error: " + ex.getMessage());
					} catch (Exception ex) {
						tfdisplay.setText("Error");
						System.out.println(ex + " Unexpected Error");
					}
				}
			}

			private double calculate(String text) {
				if (text.length() > 0) {
					String[] parts = text.split("((?<=[-+*/%])|(?=[-+*/%]))");

					if (parts.length < 3) {
						throw new IllegalArgumentException("Invalid input format");
					}

					try {
						int index = 0;

						// Check if the first number is negative
						if (parts[index].equals("-")) {
							num1 = -Double.parseDouble(parts[++index]);
							index++;
						} else {
							num1 = Double.parseDouble(parts[index++]);
						}

						// Get the operator
						char operator = parts[index++].charAt(0);

						// Check if the second number is negative
						if (parts[index].equals("-")) {
							num2 = -Double.parseDouble(parts[++index]);
						} else {
							num2 = Double.parseDouble(parts[index]);
						}

						double result = 0;
						switch (operator) {
							case '+':
								result = num1 + num2;
								break;
							case '-':
								result = num1 - num2;
								break;
							case '*':
								result = num1 * num2;
								break;
							case '/':
								result = num1 / num2;
								break;
							case '%':
								result = (num1 / num2) * 100;
								break;
							default:
								throw new IllegalArgumentException("Invalid operator");
						}
						return result;
					} catch (NumberFormatException ex) {
						throw new NumberFormatException("Invalid number format");
					}
				}
				return 0;
			}

		});

		btnEquals.setBackground(new Color(255, 204, 0));
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEquals.setBounds(289, 370, 73, 42);
		contentPane.add(btnEquals);

		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "9");
				}
				// else do nothing
			}
		});
		btn9.setBackground(new Color(0, 0, 128));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.setBounds(197, 187, 73, 42);
		contentPane.add(btn9);

		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "8");
				}
			}
		});
		btn8.setBackground(new Color(0, 0, 128));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(105, 187, 73, 42);
		contentPane.add(btn8);

		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(240, 240, 240));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "7");
				}
			}
		});
		btn7.setBackground(new Color(0, 0, 128));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.setBounds(16, 187, 73, 42);
		contentPane.add(btn7);

		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "6");
				}
			}
		});
		btn6.setBackground(new Color(0, 0, 128));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(197, 242, 73, 42);
		contentPane.add(btn6);

		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "5");
				}
			}
		});
		btn5.setBackground(new Color(0, 0, 128));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(105, 242, 73, 42);
		contentPane.add(btn5);

		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "4");
				}
			}
		});
		btn4.setBackground(new Color(0, 0, 128));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(16, 242, 73, 42);
		contentPane.add(btn4);

		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "3");
				}
			}
		});
		btn3.setBackground(new Color(0, 0, 128));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(197, 305, 73, 42);
		contentPane.add(btn3);

		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "1");
				}
			}
		});
		btn1.setBackground(new Color(0, 0, 128));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(16, 305, 73, 42);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "2");
				}
			}
		});
		btn2.setBackground(new Color(0, 0, 128));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(105, 305, 73, 42);
		contentPane.add(btn2);

		JButton btnDecimal = new JButton(".");
		btnDecimal.setForeground(Color.WHITE);
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + ".");
				}
			}
		});
		btnDecimal.setBackground(new Color(0, 0, 128));
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDecimal.setBounds(197, 370, 73, 42);
		contentPane.add(btnDecimal);

		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn) {
					String text = tfdisplay.getText();
					tfdisplay.setText(text + "0");
				}
			}
		});
		btn0.setBackground(new Color(0, 0, 128));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn0.setBounds(16, 370, 162, 42);
		contentPane.add(btn0);

		btnPercentage.setBackground(new Color(72, 209, 204));
		btnPercentage.setForeground(Color.BLACK);
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPercentage.setBounds(197, 128, 73, 42);
		contentPane.add(btnPercentage);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
