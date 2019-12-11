package FormControl;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import ExtendedSupportClasses.JPanelExtended;

@SuppressWarnings("serial")
public class FormInputWorkerShift extends JPanelExtended {
	private JTextField ShiftField;

	/**
	 * Create the panel.
	 */
	public FormInputWorkerShift() {
		
		JLabel lblInputWorkerShift = new JLabel("Input Worker's Shift");
		lblInputWorkerShift.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblInputWorkerShift.setBounds(57, 11, 324, 57);
		add(lblInputWorkerShift);
		
		ShiftField = new JTextField();
		ShiftField.setBounds(91, 79, 228, 87);
		ShiftField.setToolTipText("Input the worker's shift");
		add(ShiftField);
		ShiftField.setColumns(10);
	}
	
	public String getShift(){
		return ShiftField.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(430, 230);
	}
}
