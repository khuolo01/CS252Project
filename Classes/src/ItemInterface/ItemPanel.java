package ItemInterface;


import ActionEvents.*;
import ExtendedSupportClasses.JPanelExtended;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ItemPanel extends JPanelExtended {

	/**
	 * Create the item panel.
	 * JPanelExtended can be found in the package ExtendedSupportClasses
	 */
	
	public ItemPanel() {
		
		// Title Label
		
		JLabel lblItemManipulation = new JLabel("Item Manipulation");
		lblItemManipulation.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblItemManipulation.setBounds(242, 21, 377, 62);
		add(lblItemManipulation);
		
		
		// Add New Item
		
		JButton newItem = new JButton("Add New Item");
		newItem.setBounds(50, 110, 250, 125);
		add(newItem);
		ActionAddNewItem addItem = new ActionAddNewItem();
		newItem.addActionListener(addItem);
		
		// Check Item Information
		
		JButton itemInfo = new JButton("Check Item's Information");
		itemInfo.setBounds(470, 110, 250, 125);
		add(itemInfo);
		ActionCheckItemInformation checkItemInfo = new ActionCheckItemInformation();
		itemInfo.addActionListener(checkItemInfo);
		
		
		// Order Item
		
		JButton order = new JButton("Order Item (Constructing)");
		order.setBounds(50, 260, 250, 125);
		add(order);
		
		
		// Delete Item
		
		JButton delete = new JButton("Delete Item");
		delete.setBounds(470, 260, 250, 125);
		add(delete);
		ActionDeleteItem deleteItem = new ActionDeleteItem();
		delete.addActionListener(deleteItem);
		
		
		// Panel Configuration
		
		setBounds(100, 100, 800, 600);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800, 400);
	}
}
