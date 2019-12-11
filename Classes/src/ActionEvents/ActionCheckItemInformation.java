package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import FormControl.FormInputItemName;

public class ActionCheckItemInformation implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		FormInputItemName name = new FormInputItemName();
		
		int result = JOptionPane.showConfirmDialog(
				null, 
				name, 
				"Input Worker ID",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			// Display Item Data
			try {
				String input_name = name.getName();
				File file = new File("ItemData.txt");
				Scanner sc = new Scanner(file);
				boolean found = false;
				while (sc.hasNextLine()){
					String line = sc.nextLine();
					String[] data = line.split(Pattern.quote(" | "));
					String cur_name = data[0];
					if (cur_name.equals(input_name)){
						found = true;
						System.out.println(data[6]);
						String display_message = 
								"Product Name: " + data[0] + "\n" +
								"Price: " + "$" + data[1] + "\n" +
								"Calories: " + data[2] + "\n" +
								"Fat: " + data[3] + "\n" +
								"Cholesterol: " + data[4] + "\n" +
								"Sodium: " + data[5] + "\n" +
								"Provider: " + data[6] + "\n" +
								"Current_Amount: " + data[9];
						
						JOptionPane.showMessageDialog(null, display_message);
					}
				}
				
				sc.close();
				
				if (found == false){
					String errorMessage = "There is no '" + input_name +  "' in the storage";
					JOptionPane.showConfirmDialog(
							null, 
							errorMessage, 
							"Error Message",
				            JOptionPane.OK_CANCEL_OPTION,
				            JOptionPane.PLAIN_MESSAGE);
				}
			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				}		
		}
	}
}
