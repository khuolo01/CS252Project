package DomainClasses;

import java.io.FileWriter;
import java.io.IOException;

public class Manager {
	private Information info;
	private String placeInCharge;
	private Manager_Account account;
	
	// Constructor
	public Manager(Information info, String placeInCharge, Manager_Account account){
		this.info = info;
		this.placeInCharge = placeInCharge;
		this.account = account;
	}

	public Information getInfo() {
		return info;
	}

	public void setInfo(Information info) {
		this.info = info;
	}

	public String getPlaceInCharge() {
		return placeInCharge;
	}

	public void setPlaceInCharge(String placeInCharge) {
		this.placeInCharge = placeInCharge;
	}

	@Override
	public String toString() {
		return this.info.toString() + " | " + this.placeInCharge + " | " + this.account.toString();
	}
	
	public void addManagerToDatabase(){
		try{
			FileWriter managerData = new FileWriter("ManagerData.txt", true);
			managerData.write("\n");
			managerData.write(toString());
			managerData.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}
	
	
}
