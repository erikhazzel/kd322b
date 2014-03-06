import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class Antagning_GUI extends JFrame {

	private JPanel contentPane;
	private Document doc;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private Bargraph bargraph;
	
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
		
		
		
		doc = openXmlFile("ht2013_antagning.xml");
		
		Node n = doc.getDocumentElement();
		
		String root = n.getNodeName();
		programsList = loadAllPrograms();
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent graph){
				String x = String.valueOf(comboBox.getSelectedItem());
				int index = comboBox.getSelectedIndex();
				Program prog = programsList.get(index);
				System.out.println("Vi valde: "+ x);
				
				
				bargraph.updateValues(prog.getWomen(), prog.getMen());
				
			}
			
		});
		
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));

		bargraph = new Bargraph(0, 0);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)
						.addComponent(bargraph, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(bargraph, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
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
