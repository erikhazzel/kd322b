import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class animalGUI extends JFrame {
	
	private Dogg dog;
	private Cat cat;
	private Snake snake;
	
	private JPanel contentPane;
	private ArrayList <Animal> myAnimals;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					animalGUI frame = new animalGUI();
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
	public animalGUI() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 6, 438, 266);
		contentPane.add(textArea);
		
		myAnimals = new ArrayList <Animal>();
		myAnimals.add(dog = new Dogg("Bulldogg", 2, "Small"));
		myAnimals.add(cat = new Cat("Birma", 2, "Black"));
		myAnimals.add(snake = new Snake("Anakonda", "ten"));
		myAnimals.add(dog = new Dogg("Pitbull", 2, "Medium"));
		myAnimals.add(dog = new Dogg("Grand Danois", 2, "Big"));
		myAnimals.add(cat = new Cat("Bobcat", 2, "Pink"));
		myAnimals.add(snake = new Snake("Rattlesnake", "three"));
		
		
		for(Animal a: myAnimals){
			
			textArea.append(a.getInfo() + "\n");
			
			
		}
	}
}
