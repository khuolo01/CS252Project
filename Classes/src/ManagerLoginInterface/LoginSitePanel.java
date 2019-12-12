package ManagerLoginInterface;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

@SuppressWarnings("serial")
public class LoginSitePanel extends JPanel {
	
	JFrame loginFrame;
	
	/**
	 * Create the panel.
	 */
	
	public LoginSitePanel(JFrame frame) {
		
		loginFrame = frame;
		
		final JLabel loginLabel = new JLabel();
		loginLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
    	loginLabel.setBounds(100,11,150,30);
    	loginLabel.setText("Manager Login Site");
    	
    	
    	final JLabel label = new JLabel();            
    	label.setBounds(20,150, 200,50);
    	
    	
    	// Username
    	
    	JLabel l1=new JLabel("Username:");    
        l1.setBounds(50,50, 80,30);
        final JTextField usernameField = new JTextField();  
        usernameField.setBounds(123,50,160,30); 
        usernameField.setToolTipText("Input username");
        
        
        // Password
        
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(50,105, 80,30);
        final JPasswordField value = new JPasswordField();   
    	value.setBounds(123,105,160,30);
    	value.setToolTipText("Input password");
        
    	
    	// Login Button
    	
        JButton loginButton = new JButton("Login"); 
        loginButton.setBounds(100,160,120,30);    
        
        ActionListener action1 = (e)-> {
        	String username = usernameField.getText();
			String password = String.valueOf(value.getPassword());
			
			// Read the manager List
			
			try{
				File managerList = new File("ManagerAccountList.txt");
				Scanner list = new Scanner(managerList);
				boolean stop = false;
				while (list.hasNextLine() && stop == false){
					String line = list.nextLine();
					String[] data = line.split("[ |]+");
					String required_username = data[0];
					String required_password = data[1];
					
					// Check whether the login is successful or not
					
					if (username.equals(required_username) && password.equals(required_password)){
						ManagerInterface manager_function = new ManagerInterface();
						dispose();
						JOptionPane.showConfirmDialog(
								null, 
								manager_function, 
								"Manager Interface", 
								JOptionPane.CLOSED_OPTION,
								JOptionPane.PLAIN_MESSAGE);
						
						stop = true;
					}
				}
				list.close();
				
				// Login fail
				
				if (stop == false){
					JOptionPane.showMessageDialog(null, "Login fail, please try again!");
				}

			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				}
        };
        loginButton.addActionListener(action1);
		add(loginLabel); add(value); add(l1);
		add(label); add(l2); add(loginButton); 
		add(usernameField);   
        setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
	}
	
	public void dispose(){
		loginFrame.dispose();
	}
	
}
