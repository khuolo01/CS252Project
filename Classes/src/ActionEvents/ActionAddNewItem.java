package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DomainClasses.*;

import FormControl.FormNewItem;

public class ActionAddNewItem implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		FormNewItem itemInfo = new FormNewItem();
		int result = JOptionPane.showConfirmDialog(
				null, 
				itemInfo, 
				"Item Information", 
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION){
			String name = itemInfo.getNameField();
			float price = Float.parseFloat(itemInfo.getPriceField());
			float calories = Float.parseFloat(itemInfo.getCaloriesField());
			float fat = Float.parseFloat(itemInfo.getFatField());
			float cholesterol = Float.parseFloat(itemInfo.getCholesterolField());
			float sodium = Float.parseFloat(itemInfo.getSodiumField());
			ProductDetail itemDetails = new ProductDetail(name, price, calories, fat, cholesterol, sodium);
			
			String CompanyName = itemInfo.getCompanyNameField();
			String Address = itemInfo.getAddressField();
			String PhoneNumber = itemInfo.getPhoneNumberField();
			Supplier supplier = new Supplier(CompanyName, Address, PhoneNumber);
			
			Item newItem = new Item(supplier, itemDetails);
			newItem.addItemToDatabase();
			
			JOptionPane.showMessageDialog(null, "Adding successfully");
		}
	}

}
