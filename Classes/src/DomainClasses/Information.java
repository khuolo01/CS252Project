package DomainClasses;

public class Information {
	@Override
	public String toString() {
		return FN + " | " + LN + " | " + DOB + " | " + ID + " | " + Email;
	}

	private String FN;
	private String LN;
	private String DOB;
	private String ID;
	private String Email;
	
	// Constructor
	
	public Information (String FN, String LN, String DOB, String ID, String Email){
		this.FN = FN;
		this.LN = LN;
		this.DOB = DOB;
		this.ID = ID;
		this.Email = Email;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFirstName() {
		return FN;
	}

	public void setFirstName(String fN) {
		FN = fN;
	}

	public String getLastName() {
		return LN;
	}

	public void setLastName(String lN) {
		LN = lN;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
}
