package FormControl;


import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;

import DomainClasses.*;
import ExtendedSupportClasses.*;

@SuppressWarnings("serial")
public class FormInformationInput extends JPanelExtended {
	/**
	 * Create the panel.
	 */
	JTextField fn, ln, dob, ID, Email;
	
	public FormInformationInput() {
		
		// Title label
		
		JLabel lblWorkerInformation = new JLabel("Worker Information");
		lblWorkerInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWorkerInformation.setBounds(109, 11, 150, 28);
		
		
		// First Name Field
		
		JLabel fn_label = new JLabel();
		fn_label.setText("First Name: ");
		fn_label.setBounds(50,50,68,30);
		fn = new JTextField();
		fn.setBounds(130, 50, 150, 30);
		fn.setToolTipText("Input the person's first name");
		
		
		// Last Name Field
		
		JLabel ln_label = new JLabel();
		ln_label.setText("Last Name: ");
		ln_label.setBounds(50,100,68,30);
		ln = new JTextField();
		ln.setBounds(130, 100, 150, 30);
		ln.setToolTipText("Input the person's last name");
		
		
		// Date Of Birth Field
		
		JLabel dob_label = new JLabel();
		dob_label.setText("Date Of Birth: ");
		dob_label.setBounds(50,150,82,30);
		dob = new JTextField();
		dob.setBounds(130, 150, 150, 30);
		dob.setToolTipText("Input the person's Date of Birth");
		
		
		// Worker ID Field
		
		JLabel ID_label = new JLabel();
		ID_label.setText("ID: ");
		ID_label.setBounds(50,200,68,30);
		ID = new JTextField();
		ID.setBounds(130, 200, 150, 30);
		ID.setToolTipText("Input the person's ID");
		
		
		// Worker Email Field
		JLabel Email_label = new JLabel();
		Email_label.setText("Email: ");
		Email_label.setBounds(50,250,68,30);
		Email = new JTextField();
		Email.setBounds(130, 250, 150, 30);
		Email.setToolTipText("Input the person's email");
		
		
		this.add(fn); this.add(fn_label);
		this.add(ln); this.add(ln_label);
		this.add(dob); this.add(dob_label);
		this.add(ID); this.add(ID_label);
		add(Email); add(Email_label);
		add(lblWorkerInformation);
	}
	
	public String getID(){
		return ID.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(370, 330);
	}
	
	public Information createInformation(){
		return new Information(fn.getText(), ln.getText(), dob.getText(), ID.getText(), Email.getText());
	}
}
