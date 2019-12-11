package DomainClasses;

public class Supplier {
	private String CompanyName, Address,PhoneNumber;
	
	public Supplier(String name, String Address, String PhoneNumber) {
		this.CompanyName = name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	@Override
	public String toString() {
		return CompanyName + " | " + Address + " | " + PhoneNumber;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}
