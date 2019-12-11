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

import DomainClasses.*;
import FormControl.FormInputID;
import FormControl.FormSendWarning;

public class ActionSendWarning implements ActionListener{
	
	String[] targetedWorker;
		
	@Override
	public void actionPerformed(ActionEvent e) {
		FormInputID id = new FormInputID();
		
		int result = JOptionPane.showConfirmDialog(
				null, 
				id, 
				"Input Worker ID",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION){
			
			// Find Worker
			
			try {
				String input_id = id.getId();
				File file = new File("WorkerData.txt");
				Scanner sc = new Scanner(file);
				boolean found = false;
				String WorkerData = "";
				
				while (sc.hasNextLine()){
					String line = sc.nextLine();
					if (!line.equals("")){
						String[] data = line.split(Pattern.quote(" | "));
						String cur_id = data[3];
						if (cur_id.equals(input_id)){
							found = true;
							targetedWorker = data;
						}
						else{
							WorkerData = WorkerData + line + "\n";
						}
					}	
				}
				
				sc.close();
				
				
				// Send Warning
				
				if (found == true){
					
					FormSendWarning formWarning = new FormSendWarning();

					result = JOptionPane.showConfirmDialog(
						null,
						formWarning,
						"Send Warning",
						JOptionPane.OK_CANCEL_OPTION,
					    JOptionPane.PLAIN_MESSAGE);
					
					if (result == JOptionPane.OK_OPTION){
						
						// temporary delete the worker
						
						try{
							FileWriter writer = new FileWriter("WorkerData.txt");
							writer.write(WorkerData);
							writer.close();
						}catch (IOException e1) {
							System.out.println("An error occurred.");
							e1.printStackTrace();
							}
						
						
						// send the warning, then re-add worker
						
						String date = formWarning.getDate();
						String reason = formWarning.getReason();
						int NumWarning = Integer.parseInt(targetedWorker[5]) + 1;
						String message = "Hi " + targetedWorker[0] + "," + "\n\n" +
										"This is a warning from Dining Services." + "\n" +
										"Reason: " + reason + "\n" +
										"Date: " + date + "\n" +
										"Number of Warning: " + String.valueOf(NumWarning) + "\n\n" +
										"Best," + "\n" + "Dining Services";
						
						Information targetedWorkerInfo = new Information(
								targetedWorker[0],
								targetedWorker[1],
								targetedWorker[2],
								targetedWorker[3],
								targetedWorker[4]
								);
						
						
						StudentWorker worker = new StudentWorker(targetedWorkerInfo, targetedWorker[7]);
						worker.sendWarning(message, NumWarning);
						
						JOptionPane.showMessageDialog(null, "A warning has been sent");
					}				
				}
				else{
					JOptionPane.showMessageDialog(null, "The ID is unavailable.");
				}
				
			}catch (FileNotFoundException error) {
				System.out.println("An error occurred.");
				error.printStackTrace();
				}		
		}
		
	}

}

