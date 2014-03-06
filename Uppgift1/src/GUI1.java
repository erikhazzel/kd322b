import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class GUI1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNamn;
	private JTextField txtPersonNr;
	private JTextField txtAdress;
	private JTextField txtTelNr;
	private JTextField txtEpost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI1 frame = new GUI1();
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
	public GUI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.DARK_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arkiv");
		mnNewMenu.setBackground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv Ut");
		mnNewMenu.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnNewMenu.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setBackground(Color.DARK_GRAY);
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setForeground(Color.DARK_GRAY);
		mnHjlp.setBackground(Color.DARK_GRAY);
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 248, 444);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Elin Andersson"},
				{"Per Olofsson"},
				{"Olle HŠllemarker"},
				{"Bengt Olssonn"},
				{null},
				{null},
			},
			new String[] {
				"Medlemmar"
			
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBounds(266, 6, 328, 444);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNamn = new JTextField();
		txtNamn.setBounds(79, 147, 173, 28);
		panel.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtPersonNr = new JTextField();
		txtPersonNr.setBounds(79, 187, 173, 28);
		panel.add(txtPersonNr);
		txtPersonNr.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(79, 227, 173, 28);
		panel.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtTelNr = new JTextField();
		txtTelNr.setBounds(79, 267, 173, 28);
		panel.add(txtTelNr);
		txtTelNr.setColumns(10);
		
		txtEpost = new JTextField();
		txtEpost.setBounds(79, 307, 173, 28);
		panel.add(txtEpost);
		txtEpost.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("                          Bild");
		lblNewLabel.setIcon(new ImageIcon(GUI1.class.getResource("/images/biiild.jpg")));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(6, 6, 240, 135);
		panel.add(lblNewLabel);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(211, 409, 117, 29);
		panel.add(btnSpara);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(6, 153, 41, 16);
		panel.add(lblNamn);
		
		JLabel lblPersonNr = new JLabel("Person. Nr:");
		lblPersonNr.setBounds(6, 193, 85, 16);
		panel.add(lblPersonNr);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(6, 233, 61, 16);
		panel.add(lblAdress);
		
		JLabel lblTelnr = new JLabel("Tel. Nr:");
		lblTelnr.setBounds(6, 273, 61, 16);
		panel.add(lblTelnr);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(6, 313, 61, 16);
		panel.add(lblEpost);
	}
}
