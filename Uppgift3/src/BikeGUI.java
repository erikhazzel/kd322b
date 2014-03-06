import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldColor;
	private JTextField textFieldSize;
	private JTextField textFieldPrice;
	private JTextArea textArea;
	
	BikeStore bikeStore = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		bikeStore.addBike("blue", 20, 5000);
		bikeStore.addBike("pink", 28, 7000);
		bikeStore.addBike("black", 24, 5000);
		bikeStore.addBike("red", 18, 2000);
		bikeStore.addBike("red", 20, 3000);
		bikeStore.addBike("black", 16, 5000);
		bikeStore.addBike("blue", 22, 4000);
		bikeStore.addBike("pink", 26, 5000);
		bikeStore.addBike("blue", 16, 20000);
		bikeStore.addBike("blue", 20, 10000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size ;
				int price;
				try{
					size = Integer.parseInt(textFieldSize.getText());
					price = Integer.parseInt(textFieldPrice.getText());
					bikeStore.addBike(textFieldColor.getText(), size, price);
					textArea.setText(bikeStore.getAllBikes());
				}catch(NumberFormatException e){
					
				}
				
			}
		});
		btnNewButton.setBounds(304, 243, 117, 29);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(6, 6, 264, 266);
		contentPane.add(textArea);
		textArea.setText(bikeStore.getAllBikes());
		
		textFieldColor = new JTextField();
		textFieldColor.setBounds(282, 23, 153, 34);
		contentPane.add(textFieldColor);
		textFieldColor.setColumns(10);
		
		textFieldSize = new JTextField();
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(282, 77, 153, 34);
		contentPane.add(textFieldSize);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(282, 140, 153, 34);
		contentPane.add(textFieldPrice);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(282, 6, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(282, 58, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(282, 123, 61, 16);
		contentPane.add(lblPrice);
	}
}
