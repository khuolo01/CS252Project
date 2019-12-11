package ActionEvents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import FormControl.*;

public class ActionCheckWorkerInformation implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		FormInputID id = new FormInputID();
		
		int result = JOptionPane.showConfirmDialog(null, id, "Input Worker ID",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			
			// Display worker Data
			
			try {
				String input_id = id.getId();
				File file = new File("WorkerData.txt");
				Scanner sc = new Scanner(file);
				boolean found = false;
				while (sc.hasNextLine()){
					String line = sc.nextLine();
					String[] data = line.split(Pattern.quote(" | "));
					if (!line.equals("")){
						String cur_id = data[3];
						if (cur_id.equals(input_id)){
							found = true;
							String display_message = 
									"First Name: " + data[0] + "\n" +
									"Last Name: " + data[1] + "\n" +
									"Date Of Birth: " + data[2] + "\n" +
									"ID: " + data[3] + "\n" +
									"Email: " + data[4] + "\n" +
									"Number Of Warning: " + data[5] + "\n" +
									"Total Working Time: " + data[6] + "\n" +
									"Shift: " + data[7] + "\n" +
									"Status: " + data[8];
							
							JOptionPane.showMessageDialog(null, display_message);
						}
					}
				}
				
				sc.close();
				
				if (found == false){
					JOptionPane.showMessageDialog(null, "The ID is unavailable.");
				}
			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				}		
		}
	}
}
