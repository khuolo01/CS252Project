package DomainClasses;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class DailyRecord {
	private Date current; 
	
	public DailyRecord(){
		
	}
	
	public DailyRecord(int year, int month, int date) {
		this.current = new Date(year, month, date);
		
	}
	public void test() {
		try {
		FileWriter dailyData = new FileWriter("DailyRecord.txt", true);
		dailyData.write("\n");
		dailyData.write(toString());
		dailyData.close();
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}
}
