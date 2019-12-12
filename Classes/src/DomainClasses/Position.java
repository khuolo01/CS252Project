package DomainClasses;

import java.util.ArrayList;

public class Position {
	private String title;
	@SuppressWarnings("unused")
	private ArrayList <StudentWorker> currentStudents;
	private int remainingSlots;
	private String place;
	
	public Position(String title, int noOfSlots, String place) {
		this.title = title;
		this.remainingSlots = noOfSlots;
		this.place = place;
	}
	
	public String toString() {
		return "title: " + this.title + 
				" remaining slot: " + this.remainingSlots + 
				"at " + this.place;
	}
	
}
