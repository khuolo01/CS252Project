package DomainClasses;
import java.io.*;
import java.io.IOException; 

public class Test {
	public static void CreateFile(){
		try{
			File a = new File("test.txt");
			if (a.createNewFile()){
				System.out.print("File Created");
			}
		}catch (IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void WriteToFile(){
		try{
			FileWriter a = new FileWriter("test.txt");
			a.write("this is a demo");
			a.close();
		}catch (IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		WriteToFile();
		
	}
}
