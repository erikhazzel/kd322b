import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		myCalculator = new Calculator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 440, 268);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(16, 5, 345, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.numberButtonPressed(1);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setBounds(16, 39, 117, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			myCalculator.numberButtonPressed(2);	
			int i = myCalculator.getOperand();
			textField.setText(String.valueOf(i));
				
			}
		});
		button_1.setBounds(133, 39, 117, 29);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(255, 39, 117, 29);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(16, 69, 117, 29);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBounds(133, 69, 117, 29);
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(255, 69, 117, 29);
		panel.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setBounds(16, 99, 117, 29);
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setBounds(133, 99, 117, 29);
		panel.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_8.setBounds(255, 99, 117, 29);
		panel.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);	
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_9.setBounds(16, 131, 117, 29);
		panel.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();	
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		button_10.setBounds(133, 131, 117, 29);
		panel.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		button_11.setBounds(255, 131, 117, 29);
		panel.add(button_11);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		btnX.setBounds(16, 160, 117, 29);
		panel.add(btnX);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_12.setBounds(255, 160, 117, 29);
		panel.add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.clear();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		btnC.setBounds(133, 160, 117, 29);
		panel.add(btnC);
	}
}
