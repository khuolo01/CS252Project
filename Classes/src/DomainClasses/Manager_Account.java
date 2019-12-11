package DomainClasses;

import java.io.FileWriter;
import java.io.IOException;

public class Manager_Account {
	private String username;
	private String password;
	
	public Manager_Account(String un, String pw){
		this.username = un;
		this.password = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return username + " | " + password;
	}
	
	public void addAccountToDatabase(){
		try{
			FileWriter accountData = new FileWriter("ManagerAccountList.txt", true);
			accountData.write("\n");
			accountData.write(toString());
			accountData.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}
}
