import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;




public class HouseGUI extends JFrame {

	private JPanel contentPane;

	private House[] houseArray;
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 20, 401, 225);
		contentPane.add(textArea);
		
		
		House House1 = new House(1922, 60);
		House House2 = new House(1972, 160);
		House House3 = new House(1992, 12);
		
		houseArray = new House[10];
		houseArray[0] = House1;
		houseArray[1] = House2;
		houseArray[2] = House3;
		
    for(int i = 0; i< houseArray.length; i++){
		
    	if(houseArray[i] !=null){
    		textArea.append("Ett hus byggt ");
    		textArea.append(Integer.toString(houseArray[i].getYear()));
    		textArea.append(" som Šr ");
    		textArea.append(Integer.toString(houseArray[i].getSize()));
    		textArea.append(" kvm stort");
    		textArea.append("\n");
    		
    	}
    	
		
		}
    	textArea.append("Det finns totalt: " + House.getNbrHouses() + " stycken hus.");
				
	}
}
