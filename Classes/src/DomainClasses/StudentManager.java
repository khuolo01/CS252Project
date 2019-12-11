package DomainClasses;

public class StudentManager extends StudentWorker {
	private String employer;
	
	// Constructor
	StudentManager(Information inf, String shift, String employer){
		super(inf, shift);
		this.employer = employer;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}
}
