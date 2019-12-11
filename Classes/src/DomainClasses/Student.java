package DomainClasses;

public class Student {
	private Information info;
	private int swipe;
	private int DinningDollar;
	
	// Constructor
	Student (Information info, int swipe, int DinningDollar){
		this.info = info;
		this.swipe = swipe;
		this.DinningDollar = DinningDollar;
	}
	
	public void addSwipe(int numSwipe){
		this.swipe += numSwipe;
	}
	
	public void useSwipe(int numSwipe){
		if (this.swipe >= numSwipe){
			this.swipe -= numSwipe;
		}
		else{
			throw new java.lang.Error("the remaining swipe is not enough");
		}	
	}
	
	public void addDiningDollar(int numDD){
		this.swipe += numDD;
	}
	
	public void useDiningDollar(int numDD){
		if (this.DinningDollar >= numDD){
			this.DinningDollar -= numDD;
		}
		else{
			throw new java.lang.Error("the remaining Dinning Dollar is not enough");
		}	
	}

	public Information getInfo() {
		return info;
	}

	public void setInfo(Information info) {
		this.info = info;
	}
	
	
}
