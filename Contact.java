// Mike R. Montminy
// 05/21/2025
// CS320: Software Testing, Automation, & QA


public class Contact {
	// SETTING UP REQUIRED FIELDS
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// CONSTRUCTOR
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if (contactId ==  null || contactId.length() > 10) {
			throw new IllegalArgumentException("INVALID CONTACT ID. MUST BE 10 CHARACTERS OR LESS.");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("INVALID FIRST NAME. MUST BE 10 CHARACTERS OR LESS.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("INVALID LAST NAME. MUST BE 10 CHRACTERS OR LESS.");
		}
		if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
			throw new IllegalArgumentException("INVALID PHONE NUMBER. MUST BE EXACTLY 10 DIGITS.");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("INVALID ADDRESS. MUST BE 30 CHARACERS OR LESS.");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// GETTING & SETTING EACH PARAMETER
	public String getContactId() {
		return contactId;
	} // NOTE: NO SETTING AS THIS WILL NOT CHANGE ONCE A CONTACT IS CREATED
	
	
	// G&S for first names
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("INVALID FIRST NAME. MUST BE 10 CHARACTERS OR LESS.");
		}
		this.firstName = firstName;
	}
	
	
	// G&S for last names
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("INVALID LAST NAME. MUST BE 10 CHRACTERS OR LESS.");
		}
		this.lastName = lastName;
	}
	
	
	// G&S for phone numbers
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
			throw new IllegalArgumentException("INVALID PHONE NUMBER. MUST BE EXACTLY 10 DIGITS.");
		}
		this.phoneNumber = phoneNumber;
	}
	
	
	//G&S for addresses
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("INVALID ADDRESS. MUST BE 30 CHARACERS OR LESS.");
		}
		this.address = address;
	}
}
