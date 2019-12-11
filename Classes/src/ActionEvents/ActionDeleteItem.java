package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import FormControl.FormInputItemName;

public class ActionDeleteItem implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		FormInputItemName name = new FormInputItemName();
		
		int result = JOptionPane.showConfirmDialog(
				null, 
				name, 
				"Input Product Name",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			// Delete an Item Data
			try {
				String input_name = name.getName();
				File file = new File("ItemData.txt");
				Scanner sc = new Scanner(file);
				String new_data = "";
				
				while (sc.hasNextLine()){
					String line = sc.nextLine();
					String[] data = line.split(Pattern.quote(" | "));
					String cur_name = data[0];
					
					if (!cur_name.equals(input_name)){
						new_data = new_data + line + "\n";
					}
				}
				
				FileWriter itemData = new FileWriter("ItemData.txt");
				itemData.write(new_data);
				
				String deleteMessage = input_name + "'s" + " Data has been deleted from the storage";
				JOptionPane.showMessageDialog(null, deleteMessage);
				
				itemData.close();
				sc.close();
				
				
				
			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				} catch (IOException e1) {
				e1.printStackTrace();
			}		
		}	
	}
}
