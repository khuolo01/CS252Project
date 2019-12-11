package FormControl;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import ExtendedSupportClasses.JPanelExtended;

@SuppressWarnings("serial")
public class FormInputItemName extends JPanelExtended {
	private JTextField NameField;
	/**
	 * Create the panel.
	 */
	public FormInputItemName() {
		
		JLabel lblInputWorkersId = new JLabel("Input Product's Name");
		lblInputWorkersId.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblInputWorkersId.setBounds(21, 11, 389, 57);
		add(lblInputWorkersId);
		
		NameField = new JTextField();
		NameField.setBounds(107, 79, 201, 26);
		NameField.setToolTipText("Input the Item's name");
		add(NameField);
		NameField.setColumns(10);
	}
	
	public String getName(){
		return NameField.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(400, 120);
	}

}
