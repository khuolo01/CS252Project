package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		try {
//			String input_id = id.getId();
			File file = new File("WorkerData.txt");
			Scanner sc = new Scanner(file);
			boolean found = false;
			String WorkerData = "";
			
			while (sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(!line.equals(""));
			}
			
			sc.close();

	}catch (FileNotFoundException error) {
		System.out.println("An error occurred.");
		error.printStackTrace();
		}	
	}
}
