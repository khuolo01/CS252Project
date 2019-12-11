package DomainClasses;

import java.io.FileWriter;
import java.io.IOException;

public class Item {
	private Supplier Supplier;
	private ProductDetail detail;
	private int amount;
	
	public Item() {
		
	}
	
	public Item(Supplier Supplier, ProductDetail detail) {
		this.Supplier = Supplier;
		this.detail = detail;
		this.amount = 0;
	}
	
	public void ItemOrder(int amount) {
		//order
	}

	@Override
	public String toString() {
		return detail.toString() + " | " + Supplier.toString() + " | " + amount;
	}
	
	public void addItemToDatabase(){
		try{
			FileWriter itemData = new FileWriter("ItemData.txt", true);
			itemData.write("\n");
			itemData.write(toString());
			itemData.close();
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}
	
}
