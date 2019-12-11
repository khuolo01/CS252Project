package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DomainClasses.Manager;
import DomainClasses.Manager_Account;
import FormControl.*;


// Add new manager to the Database

public class ActionAddNewManager implements ActionListener{
	public void actionPerformed(ActionEvent e) 
    {  
		FormInformationInput info = new FormInformationInput();

		int result = JOptionPane.showConfirmDialog(
				null, 
				info, 
				"Worker Information",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			
			// Create New Manager Account
			
			FormCreateAccount account = new FormCreateAccount();
			
			result = JOptionPane.showConfirmDialog(
					null, 
					account, 
					"Create New Account",
		            JOptionPane.OK_CANCEL_OPTION,
		            JOptionPane.PLAIN_MESSAGE);
			
			if (result == JOptionPane.OK_OPTION){
				
				// Add new manager to Database
				
				Manager_Account new_account = account.createAccount(); 
				new_account.addAccountToDatabase();
				
				Manager new_manager = new Manager(info.createInformation(), "CAF", new_account);
				new_manager.addManagerToDatabase();
				
				JOptionPane.showMessageDialog(null, "Adding successfully");
			}
		}
    }
}
