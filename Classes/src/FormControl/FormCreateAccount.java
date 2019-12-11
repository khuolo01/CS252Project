package FormControl;


import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import DomainClasses.*;
import ExtendedSupportClasses.*;

@SuppressWarnings("serial")
public class FormCreateAccount extends JPanelExtended {

	JTextField username, password;
	private JLabel lblManagerAccount;
	
	public FormCreateAccount() {

		// First Name Field
		
		JLabel username_label = new JLabel();
		username_label.setText("First Name: ");
		username_label.setBounds(50,60,68,30);
		username = new JTextField();
		username.setBounds(130, 60, 150, 30);
		username.setToolTipText("Input username");
		
		
		// Last Name Field
		
		JLabel password_label = new JLabel();
		password_label.setText("Last Name: ");
		password_label.setBounds(50,118,68,30);
		password = new JTextField();
		password.setToolTipText("Input password");
		password.setBounds(130, 118, 150, 30);
		
		this.add(username); this.add(username_label);
		this.add(password); this.add(password_label);

// Design

 lblManagerAccount = new JLabel("Manager Account");
 lblManagerAccount.setFont(new Font("Times New Roman", Font.PLAIN, 24));
 lblManagerAccount.setBounds(80, 11, 213, 28);
 add(lblManagerAccount);
	}
	
	public Manager_Account createAccount(){
		return new Manager_Account(username.getText(), password.getText());
	}
}
