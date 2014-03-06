import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;
import javax.swing.JComboBox;


public class Antagning_GUI extends JFrame {

	private JPanel contentPane;
	private Document doc;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Antagning_GUI frame = new Antagning_GUI();
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
	public Antagning_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		doc = openXmlFile("ht2013_antagning.xml");
		
		Node n = doc.getDocumentElement();
		
		String root = n.getNodeName();
		programsList = loadAllPrograms();
		
		JLabel lblNewLabel = new JLabel("Fšrsta elementet: "+ root);
		lblNewLabel.setBounds(6, 6, 278, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Antal Program: " + programsList.size());
		lblNewLabel_1.setBounds(243, 6, 172, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 34, 438, 238);
		contentPane.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
	}
	
	private ArrayList<Program> loadAllPrograms() { 
		ArrayList<Program> output = new ArrayList<Program>();
	  
	NodeList programs = doc.getElementsByTagName("Program"); for (int i = 0; i < programs.getLength(); i++) {
	   
	    Node node = programs.item(i);
	    Element elm = (Element) node;
	   
	String name = elm.getElementsByTagName("name").item(0).getTextContent();
	String code = elm.getElementsByTagName("code").item(0).getTextContent();
	int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
	int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
	
	Program program = new Program(name, code, women, men);
	    output.add(program);
	  }
	return output; 
	}
	
	
	/**
	* Opens the given XML file as DOM. *
	* @param fileName
	* The filename of the XML file (make sure to copy this to your
	* Eclipse project)
	* @return A Document instance containing the given XML file. */
	private Document openXmlFile(String fileName) { Document doc = null;
	try {
	File fXmlFile = new File(fileName);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	} catch (Exception e) { e.printStackTrace();
	}
	return doc; }
}
