package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import DomainClasses.StudentWorker;
import FormControl.*;

// Add new worker to the database

public class ActionCreateNewWorker implements ActionListener{  
	
	boolean successful = true;
	
	@Override
	public void actionPerformed(ActionEvent e) {

		FormInformationInput info = new FormInformationInput();
		
		// Input Worker's Information
		
		int result = JOptionPane.showConfirmDialog(
				null, 
				info, 
				"Worker Information",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			
			// Check if the Information is in the BannedData
			
			try{
				File file = new File("BannedData.txt");
				Scanner sc = new Scanner(file);
				String input_id = info.getID();
				while (sc.hasNextLine() && successful == true){
					String line = sc.nextLine();
					String[] data = line.split(Pattern.quote(" | "));
					if (!line.equals("")){
						String cur_id = data[3];
						if (cur_id.equals(input_id)){
							successful = false;
						}
					}
				}
				sc.close();
			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				}
			
			if (successful == true){
				// Input Worker's Shift
				
				FormInputWorkerShift shift = new FormInputWorkerShift();
				
				result = JOptionPane.showConfirmDialog(
						null, 
						shift, 
						"Worker's Shift",
			            JOptionPane.OK_CANCEL_OPTION,
			            JOptionPane.PLAIN_MESSAGE);
				
				if (result == JOptionPane.OK_OPTION){
					
					// Add New Worker To Database
					
					String workerShift = shift.getShift();
					StudentWorker worker = new StudentWorker(info.createInformation(), workerShift);
					worker.addWorkerToDatabase();
					
					JOptionPane.showMessageDialog(null, "Creating successfully");
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Error! This worker has been banned from Dining Services");
			}
			
			
		}
	}
}


