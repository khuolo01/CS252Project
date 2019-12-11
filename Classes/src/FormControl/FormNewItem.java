package FormControl;


import ExtendedSupportClasses.JPanelExtended;

import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FormNewItem extends JPanelExtended{
	private JTextField NameField;
	private JTextField PriceField;
	private JTextField CaloriesField;
	private JTextField FatField;
	private JTextField CholesterolField;
	private JTextField SodiumField;
	private JTextField CompanyNameField;
	private JTextField AddressField;
	private JTextField PhoneNumberField;

	/**
	 * Create the panel.
	 */
	public FormNewItem() {
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JLabel lblNewItem = new JLabel("New Item");
		lblNewItem.setFont(new Font("Times New Roman", Font.BOLD, 43));
		lblNewItem.setBounds(181, 26, 195, 47);
		add(lblNewItem);
		
		JLabel lblItemDetails = new JLabel("Item Details:");
		lblItemDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblItemDetails.setBounds(65, 92, 137, 29);
		add(lblItemDetails);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblName.setBounds(65, 132, 75, 23);
		add(lblName);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPrice.setBounds(65, 166, 75, 23);
		add(lblPrice);
		
		JLabel lblCalories = new JLabel("Calories:");
		lblCalories.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCalories.setBounds(65, 200, 75, 23);
		add(lblCalories);
		
		JLabel lblFat = new JLabel("Fat:");
		lblFat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFat.setBounds(65, 234, 75, 23);
		add(lblFat);
		
		JLabel lblCholesterol = new JLabel("Cholesterol:");
		lblCholesterol.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCholesterol.setBounds(65, 268, 75, 23);
		add(lblCholesterol);
		
		JLabel lblSodium = new JLabel("Sodium:");
		lblSodium.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSodium.setBounds(65, 302, 75, 23);
		add(lblSodium);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAddress.setBounds(65, 421, 109, 23);
		add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(65, 455, 109, 23);
		add(lblPhoneNumber);
		
		JLabel lblCompanyName = new JLabel("Company Name:");
		lblCompanyName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCompanyName.setBounds(65, 387, 109, 23);
		add(lblCompanyName);
		
		JLabel lblProviderDetails = new JLabel("Provider Details:");
		lblProviderDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblProviderDetails.setBounds(65, 347, 151, 29);
		add(lblProviderDetails);
		
		NameField = new JTextField();
		NameField.setBounds(181, 132, 172, 23);
		NameField.setToolTipText("Input the Item's name");
		NameField.setColumns(10);
		add(NameField);
		
		PriceField = new JTextField();
		PriceField.setColumns(10);
		PriceField.setBounds(181, 168, 172, 23);
		PriceField.setToolTipText("Input the Item's price");
		add(PriceField);
		
		CaloriesField = new JTextField();
		CaloriesField.setColumns(10);
		CaloriesField.setBounds(181, 202, 172, 23);
		CaloriesField.setToolTipText("Input the Item's Calories");
		add(CaloriesField);
		
		FatField = new JTextField();
		FatField.setColumns(10);
		FatField.setBounds(181, 232, 172, 23);
		FatField.setToolTipText("Input the Item's Fat");
		add(FatField);
		
		CholesterolField = new JTextField();
		CholesterolField.setColumns(10);
		CholesterolField.setBounds(181, 268, 172, 23);
		CholesterolField.setToolTipText("Input the Item's Cholesterol");
		add(CholesterolField);
		
		SodiumField = new JTextField();
		SodiumField.setColumns(10);
		SodiumField.setBounds(181, 302, 172, 23);
		SodiumField.setToolTipText("Input the Item's Sodium");
		add(SodiumField);
		
		CompanyNameField = new JTextField();
		CompanyNameField.setColumns(10);
		CompanyNameField.setBounds(181, 385, 172, 23);
		CompanyNameField.setToolTipText("Input the Provider's name");
		add(CompanyNameField);
		
		AddressField = new JTextField();
		AddressField.setColumns(10);
		AddressField.setBounds(181, 421, 172, 23);
		AddressField.setToolTipText("Input the Provider's address");
		add(AddressField);
		
		PhoneNumberField = new JTextField();
		PhoneNumberField.setColumns(10);
		PhoneNumberField.setBounds(181, 455, 172, 23);
		PhoneNumberField.setToolTipText("Input the Provider's phone number");
		add(PhoneNumberField);	
	}

	public String getNameField() {
		return NameField.getText();
	}

	public String getPriceField() {
		return PriceField.getText();
	}

	public String getCaloriesField() {
		return CaloriesField.getText();
	}

	public String getFatField() {
		return FatField.getText();
	}

	public String getCholesterolField() {
		return CholesterolField.getText();
	}

	public String getSodiumField() {
		return SodiumField.getText();
	}

	public String getCompanyNameField() {
		return CompanyNameField.getText();
	}

	public String getAddressField() {
		return AddressField.getText();
	}

	public String getPhoneNumberField() {
		return PhoneNumberField.getText();
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(540, 552);
	}
}
