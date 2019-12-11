package FormControl;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import ExtendedSupportClasses.JPanelExtended;

@SuppressWarnings("serial")
public class FormInputID extends JPanelExtended {
	private JTextField IDField;

	/**
	 * Create the panel.
	 */
	public FormInputID() {
		
		JLabel lblInputWorkersId = new JLabel("Input Worker's ID");
		lblInputWorkersId.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblInputWorkersId.setBounds(57, 11, 324, 57);
		add(lblInputWorkersId);
		
		IDField = new JTextField();
		IDField.setBounds(107, 79, 201, 26);
		IDField.setToolTipText("Input the Worker's ID");
		add(IDField);
		IDField.setColumns(10);
	}
	
	public String getId(){
		return IDField.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(400, 120);
	}
}
