package DomainClasses;

import java.io.FileWriter;
import java.io.IOException;

import JavaMailAPI.SendEmail;


public class StudentWorker {
	private Information info;
	private int NumOfWarnings;
	private int totalWorkingTime;
	private String shift;
	private String status;
	
	// Constructor
	
	public StudentWorker(Information inf, String shift){
		this.info = inf;
		this.NumOfWarnings = 0;
		this.totalWorkingTime = 0;
		this.shift = shift;
		this.status = "Clean";
	}

	public Information getInfo() {
		return info;
	}

	public void setInfo(Information info) {
		this.info = info;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumOfWarnings() {
		return NumOfWarnings;
	}
	
	public void sendWarning(String message, int currentNumberOfWarning){
		this.NumOfWarnings = currentNumberOfWarning;
		SendEmail warning = new SendEmail(this.info.getEmail(), "Job Warning", message);
		warning.sendFromGMail();
		if (NumOfWarnings < 3){
			addWorkerToDatabase();
		}
		else{
			Terminate();
		}
	}
	
	public void Terminate(){
		status = "Terminated";
		String message = "Hi " + info.getFirstName() + ",\n\n" +
						 "You have been terminated from Dining Services" + "\n\n" +
						 "Best,\nDining Services";
		SendEmail terminate = new SendEmail(this.info.getEmail(), "Job Terminating", message);
		terminate.sendFromGMail();
						 
		try{
			FileWriter workerData = new FileWriter("BannedData.txt", true);
			workerData.write("\n");
			workerData.write(toString());
			workerData.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}

	public int getTotalWorkingTime() {
		return totalWorkingTime;
	}
	
	public void addWorkingTime(int WorkingTime){
		this.totalWorkingTime += WorkingTime;
	}
	
	public void addWorkerToDatabase(){
		try{
			FileWriter workerData = new FileWriter("WorkerData.txt", true);
			workerData.write("\n");
			workerData.write(toString());
			workerData.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}

	@Override
	public String toString() {
		return info.toString() + 
				" | " + NumOfWarnings + 
				" | " + totalWorkingTime + 
				" | " + shift + 
				" | " + status;
	}
	
}
