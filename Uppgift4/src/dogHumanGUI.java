import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class dogHumanGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHuman;
	private JTextField textFieldDog;
	Human human1;
	Dog dog1;
	
	private JTextField textFieldError;
	private JTextField textFieldInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dogHumanGUI frame = new dogHumanGUI();
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
	public dogHumanGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldHuman = new JTextField();
		textFieldHuman.setBounds(19, 18, 134, 28);
		contentPane.add(textFieldHuman);
		textFieldHuman.setColumns(10);
		
		textFieldDog = new JTextField();
		textFieldDog.setBounds(19, 58, 134, 28);
		contentPane.add(textFieldDog);
		textFieldDog.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String humanName = textFieldHuman.getText();	
				if(humanName.length() < 4){
					textFieldError.setText("Error1");
					
				}else {
					human1 = new Human(humanName);
					
				}
				
				
			}
		});
		btnNewHuman.setForeground(Color.DARK_GRAY);
		btnNewHuman.setBounds(194, 19, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dog = textFieldDog.getText();
				if(human1 != null){
					
					dog1 = new Dog(dog);
					human1.buyDog(dog1);
				}else{
					
					textFieldError.setText("Error 2");
					
				}
			}
		});
		btnBuyDog.setForeground(Color.DARK_GRAY);
		btnBuyDog.setBackground(Color.WHITE);
		btnBuyDog.setBounds(194, 59, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldInfo.setText(human1.getInfo());
			}
		});
		btnPrintInfo.setForeground(Color.DARK_GRAY);
		btnPrintInfo.setBounds(194, 100, 117, 29);
		contentPane.add(btnPrintInfo);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setForeground(Color.DARK_GRAY);
		lblInfo.setBounds(19, 123, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setForeground(Color.DARK_GRAY);
		lblErrormessage.setBounds(19, 195, 92, 16);
		contentPane.add(lblErrormessage);
		
		textFieldError = new JTextField();
		textFieldError.setBounds(19, 218, 411, 54);
		contentPane.add(textFieldError);
		textFieldError.setColumns(10);
		
		textFieldInfo = new JTextField();
		textFieldInfo.setColumns(10);
		textFieldInfo.setBounds(19, 141, 411, 54);
		contentPane.add(textFieldInfo);
	}
}
