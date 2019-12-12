package ManagerLoginInterface;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ActionEvents.*;

@SuppressWarnings("serial")
public class ManagerInterface extends JPanel {

	/**
	 * Action Listener for each button can be found at package ActionEvents
	 */
	
	public ManagerInterface() {
		
		// Title Label
		
		JLabel lblManagerInterface = new JLabel("Manager Interface");
		lblManagerInterface.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblManagerInterface.setBounds(233, 21, 384, 62);
		
		
		// Add New Worker Function
		
		JButton newWorker = new JButton("Add New Worker");
		newWorker.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		newWorker.setBounds(50, 110, 250, 125);
		ActionCreateNewWorker addWorker = new ActionCreateNewWorker();
		newWorker.addActionListener(addWorker);
		
		
		// Add New Manager Function
		
		JButton newManager = new JButton("Create New Manager");
		newManager.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		newManager.setBounds(482, 110, 250, 125);
		ActionAddNewManager addManager = new ActionAddNewManager();
		newManager.addActionListener(addManager);

		
		// Check Worker's Information Function
		
		JButton checkInfo = new JButton("Check Worker's Information");
		checkInfo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		checkInfo.setBounds(50, 260, 250, 125);
		ActionCheckWorkerInformation checkInfoAction = new ActionCheckWorkerInformation();
		checkInfo.addActionListener(checkInfoAction);
		
		
		// Send Warning Function
		
		JButton sendWarning = new JButton("Send Warning");
		sendWarning.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sendWarning.setBounds(482, 260, 250, 125);
		ActionSendWarning warning = new ActionSendWarning();
		sendWarning.addActionListener(warning);
		
		
		// Worker Promotion Function (Constructing)
		
//		JButton promotion = new JButton("Promotion\r\n(Constructing)\r\n");
//		promotion.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//		promotion.setBounds(50, 410, 250, 125);
		
		
		// Item Manipulation Function
		
		JButton itemManipulation = new JButton("Item Manipulation");
		itemManipulation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		itemManipulation.setBounds(50, 410, 250, 125);
		ActionOpenItemInterface itemInterface = new ActionOpenItemInterface();
		itemManipulation.addActionListener(itemInterface);
		
		
		
		setBounds(100, 100, 800, 600);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		add(newWorker); add(newManager); add(checkInfo); 
		add(sendWarning); add(itemManipulation);
		add(lblManagerInterface);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800, 600);
	}
}
