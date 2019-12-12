package FormControl;

import ExtendedSupportClasses.JPanelExtended;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FormSendWarning extends JPanelExtended {
	private JTextArea ReasonField;
	private JTextField Date;

	/**
	 * Create the panel.
	 */
	public FormSendWarning() {
		
		JLabel lblSendWarning = new JLabel("Send Warning");
		lblSendWarning.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblSendWarning.setBounds(138, 11, 176, 43);
		add(lblSendWarning);
		
		JLabel lblReason = new JLabel("Reason: ");
		lblReason.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblReason.setBounds(40, 94, 100, 34);
		add(lblReason);
		
		ReasonField = new JTextArea();
		ReasonField.setBounds(194, 94, 186, 122);
		ReasonField.setToolTipText("Input the reason");
		add(ReasonField);
		ReasonField.setColumns(10);
		ReasonField.setRows(10);
		ReasonField.setLineWrap(true);
		ReasonField.setWrapStyleWord(true);
		
		JLabel lblDayOfViolation = new JLabel("Day Of Violation:");
		lblDayOfViolation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDayOfViolation.setBounds(40, 49, 144, 34);
		add(lblDayOfViolation);
		
		Date = new JTextField();
		Date.setBounds(194, 58, 186, 20);
		Date.setToolTipText("Input the day of Violation");
		add(Date);
		Date.setColumns(10);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(450, 270);
	}
	
	public String getReason(){
		return ReasonField.getText();
	}
	
	public String getDate(){
		return Date.getText();
	}
}
