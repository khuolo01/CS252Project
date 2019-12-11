package DomainClasses;

public class ProductDetail {
	private String name;
	private float price, calories, fat, cholesterol, sodium;
	
	public ProductDetail(String name, float price, float calories, float fat, float cholesterol, float sodium){
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.fat = fat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getCalories() {
		return calories;
	}

	public void setCalories(float calories) {
		this.calories = calories;
	}

	public float getFat() {
		return fat;
	}

	public void setFat(float fat) {
		this.fat = fat;
	}

	public float getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(float cholesterol) {
		this.cholesterol = cholesterol;
	}

	public float getSodium() {
		return sodium;
	}

	public void setSodium(float sodium) {
		this.sodium = sodium;
	}

	@Override
	public String toString() {
		return name + " | " +
				price + " | " +
				calories + " | " +
				fat + " | " +
				cholesterol + " | " +
				sodium;
	
	}
	
	
}
