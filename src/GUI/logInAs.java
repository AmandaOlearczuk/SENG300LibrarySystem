package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import Actors.Customer;
import Actors.Librarian;
import Media.CD;
import Media.DVD;
import Media.PaperMedia;
import Media.PhysicalMedia;
import Shelf.Shelf;
import Utilities.Address;
import Utilities.LogIn;
import Utilities.Status;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.AbstractListModel;
import java.awt.List;
import javax.swing.JScrollBar;
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class logInAs {

	private JFrame frmLogin = new JFrame();
	
	private JPanel panelCont = new JPanel();
	private JPanel LogInAs= new JPanel();
	private JPanel LogInAsSomeone = new JPanel();
	private JPanel StudentWindow = new JPanel();
	private JPanel LibrarianWindow = new JPanel();
	private JPanel FacultyWindow = new JPanel();
	
	private JButton btnBack1 = new JButton("Back");
	private JButton studentBtn = new JButton("Student");
	private JButton facultyBtn = new JButton("Faculty");
	private JButton librarianBtn = new JButton("Librarian");
	
	private CardLayout cl = new CardLayout();
	
	private final JLabel lblNewLabel = new JLabel("Log in as ..");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_2 = new JLabel("");
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel = new JPanel();
	private final JPasswordField passwordField = new JPasswordField();
	private final JLabel lblNewLabel_3 = new JLabel("Email : ");
	private final JLabel lblNewLabel_4 = new JLabel("Password : ");
	private final JTextField emailTextField = new JTextField();
	private final JLabel who = new JLabel("Librarian");
	private final JLabel lblNewLabel_6 = new JLabel("");
	private final JLabel lblNewLabel_7 = new JLabel("");
	private final JLabel lblNewLabel_8 = new JLabel("");
	private final JLabel lblNewLabel_9 = new JLabel("");
	private final JPanel panel_1 = new JPanel();
	private final JButton loginButton = new JButton("Log in");
	private final JPanel person = new JPanel();
	private final JLabel lblWelcome = new JLabel("Logged in as Librarian: ");
	private final JLabel nameLabel = new JLabel("<name>");
	private final JPanel panel_4 = new JPanel();
	private final JPanel menu = new JPanel();
	private final JButton librarianReturnButton = new JButton("Return media");
	private final JButton btnNewButton_1 = new JButton("Add media");
	private final JButton librarianBrowseButton = new JButton("Browse media");
	
	private final JPanel middle = new JPanel();
	private final JPanel browse_media = new JPanel();
	private final JPanel return_media = new JPanel();
	
	private final JButton browseBtn = new JButton("Browse");
	private final JComboBox comboBox = new JComboBox();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final CardLayout mid = new CardLayout(0,0);
	private final JButton btnNewButton = new JButton("Log Out");
	private final JList list = new JList();
	private final DefaultListModel dlm = new DefaultListModel();
	private JScrollPane scrollPane;
	private final JTextField textField = new JTextField();
	private final JLabel lblMediaName = new JLabel("Media name:");
	private JTextField textField_1;
	private final JPanel borrow_media = new JPanel();
	private final JButton btnNewButton_2 = new JButton("Borrow");
	private final JPanel panel_6 = new JPanel();
	private final JButton btnNewButton_3 = new JButton("New button");
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logInAs window = new logInAs();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public logInAs() {
		textField.setBounds(326, 5, 86, 20);
		textField.setColumns(10);
		emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
		emailTextField.setColumns(10);
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cl.setVgap(5);
		cl.setHgap(5);
		
		panelCont.setLayout(cl);
		panelCont.add(LogInAs,"1");
		panelCont.add(LogInAsSomeone,"2");
		
		panelCont.add(panel_4, "name_88267641545600");
		panelCont.add(LibrarianWindow,"LibrarianWindow");
		LibrarianWindow.setLayout(new BorderLayout(0, 0));
		person.setBorder(new LineBorder(new Color(0, 0, 0)));
		LibrarianWindow.add(person, BorderLayout.SOUTH);
		person.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		person.add(lblWelcome);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		person.add(nameLabel);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		person.add(btnNewButton);
		menu.setBorder(null);
		LibrarianWindow.add(menu, BorderLayout.WEST);
		menu.setLayout(new GridLayout(5, 0, 0, 0));
		
		menu.add(librarianReturnButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		menu.add(librarianBrowseButton);
		middle.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		LibrarianWindow.add(middle, BorderLayout.CENTER);
		
		middle.setLayout(mid);
		
		middle.add(browse_media, "browse");
		browse_media.setLayout(new GridLayout(2, 1, 0, 0));
		
		browse_media.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		panel_3.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Books/Magazines/Comics", "CDs", "DVDs"}));
		
		panel_3.add(browseBtn);
		
		browse_media.add(panel_5);
		
		
		middle.add(return_media, "return");
		return_media.setLayout(null);
		lblMediaName.setBounds(260, 8, 61, 14);
		
		return_media.add(lblMediaName);
		
		return_media.add(textField);
		
		JLabel lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setBounds(249, 33, 72, 14);
		return_media.add(lblCustomerId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(326, 30, 86, 20);
		return_media.add(textField_1);
		textField_1.setColumns(10);
		panelCont.add(StudentWindow,"StudentWindow");
		panelCont.add(FacultyWindow,"FacultyWindow");
		
		cl.show(panelCont, "1");
		
		GridLayout gl_LogInAs = new GridLayout(7, 1);
		LogInAs.setLayout(gl_LogInAs);
		
		LogInAs.add(lblNewLabel_2);
		LogInAs.add(lblNewLabel);
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LogInAs.add(studentBtn);
		LogInAs.add(facultyBtn);
		LogInAs.add(librarianBtn);
		LogInAs.add(lblNewLabel_1);
		LogInAsSomeone.setLayout(new GridLayout(5, 3, 0, 0));
		LogInAsSomeone.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		btnBack1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack1.setAlignmentY(Component.TOP_ALIGNMENT);
		btnBack1.setVerticalAlignment(SwingConstants.TOP);
		panel_2.add(btnBack1);
		btnBack1.setHorizontalAlignment(SwingConstants.LEFT);
		who.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
		who.setHorizontalAlignment(SwingConstants.CENTER);
		
		LogInAsSomeone.add(who);
		
		LogInAsSomeone.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 5));
		
		panel.add(lblNewLabel_6);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(lblNewLabel_3);
		
		panel.add(emailTextField);
		
		panel.add(lblNewLabel_7);
		
		panel.add(lblNewLabel_8);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(lblNewLabel_4);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		
		panel.add(passwordField);
		
		panel.add(lblNewLabel_9);
		
		LogInAsSomeone.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_1.add(loginButton);
		panel_5.setLayout(new GridLayout(2, 2, 0, 0));
		
		panel_5.add(list);
		
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		panel_6.add(btnNewButton_2);
		panel_6.add(btnNewButton_3);
		
		middle.add(borrow_media, "name_49849626154600");




		
		
		
		/**
		 * Click "back button from selected person log in
		 */
		btnBack1.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "1");
			}
		});
			
		/**
		 * Click "log in as Student/Librarian/Faculty"
		 */
		
	   studentBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
			        cl.show(panelCont, "2");
			        who.setText("Student");
				}
			});
	   
	   facultyBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		        cl.show(panelCont, "2");
		        who.setText("Faculty");
			}
		});
	   
	   librarianBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		        cl.show(panelCont, "2");
		        who.setText("Librarian");
			}
		});
	   
	        
	   /**
	   * Click on "log in" & verify info, then load appropriate window for student/faculty/librarian
	   */
	   
	   loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//Verify login
				LogIn enter = new LogIn();
				Boolean verifyLogin = enter.verifyLogin(emailTextField.getText(), passwordField.getText());
				if (verifyLogin == true) {
					
					JOptionPane.showMessageDialog(null, "Log in was successful", "InfoBox: " + "Success", JOptionPane.INFORMATION_MESSAGE);
					if (who.getText().equals("Librarian")){
						cl.show(panelCont, "LibrarianWindow");
						
						librarianWindowActions(emailTextField.getText());
					
					}
			        if (who.getText().equals("Student")) {
			        	cl.show(panelCont, "StudentWindow");
			        }
			        
			        if (who.getText().equals("Faculty")) {
			        	cl.show(panelCont, "FacultyWindow");
			        }
				}
				else {
					JOptionPane.showMessageDialog(null, "Log in was unsuccessful", "InfoBox: " + "No Success", JOptionPane.ERROR_MESSAGE);
					cl.show(panelCont, "2");
				}
				
		        
			}
		});
	        
	      
	   /**
	    * Click on BROWSE button to browse CD,DVD or book/magazine/comics
	    */
	   browseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String comboBoxValue = (String) comboBox.getSelectedItem();
				Shelf shelf = new Shelf();
				shelf.loadMedia(); //load media info from file
				ArrayList<PaperMedia> papermedia = shelf.getPaperMedias();
				ArrayList<CD> cds = shelf.getCds();
				ArrayList<DVD> dvds = shelf.getDvds();
				
				if (comboBoxValue.equals("CDs")) 
				{
					dlm.clear();
					for (int i=0; i<shelf.getCds().size();i++) {
						dlm.addElement(shelf.getCds().get(i));
					}
				}
				
				if (comboBoxValue.equals("DVDs")) 
				{
					dlm.clear();
					for (int i=0; i<shelf.getDvds().size();i++) {
						dlm.addElement(shelf.getDvds().get(i));
					}
				}
				
				if (comboBoxValue.equals("Books/Magazines/Comics")) 
				{
					dlm.clear();
					for (int i=0; i<shelf.getPaperMedias().size();i++) {
						dlm.addElement(shelf.getPaperMedias().get(i));
					}
				}
				
				list.setModel(dlm);
			}
		});
	   
	    /**
	     * Window settings
	     */
	   
		frmLogin.setResizable(false);

		frmLogin.setTitle("Mount Royal Library Management System");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmLogin.setBounds(0,0,screenSize.width/2, screenSize.height/2 );
		frmLogin.setLocationRelativeTo ( null ); //centers the window
		frmLogin.getContentPane().add(panelCont);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmLogin.setVisible(true);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public void librarianWindowActions(String email) {
		
				//Load librarian's info based on email from file TODO
		
				//Create a librarian
				Calendar librarianSophieBirthDate = Calendar.getInstance();
				librarianSophieBirthDate.set(1970,0,12);
				Librarian Sophie = new Librarian("101","Sophie", "L", librarianSophieBirthDate, 
						new Address(10,"St.Paul","AAAA33","Calgary","Canada"),"4035667080");
				
				nameLabel.setText(Sophie.getFirstName() + " " + Sophie.getLastName());
				
				
				
						
				librarianBrowseButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							mid.show(middle,"browse");
							
						}
					});
				
				librarianReturnButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						mid.show(middle, "return");
					}
				});
				
				/**
				 * Borrow button TODO
				 */
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						//addMediaOwned(Customer customer,PhysicalMedia media,String holdOrTake)
						
						//try{CD item = (CD)list.getSelectedValue();
						  //  }catch(Exception e) {
						//	try {DVD item = (DVD)list.getSelectedValue();}catch(Exception f) {
						//		try {PaperMedia item = (PaperMedia)list.getSelectedValue();}catch(Exception f) {
									
							//	}
						//	}
						}
						
						
						//System.out.println(item.toString());
					//}
				});
				
				
				
				
	}
}