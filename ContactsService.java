// Mike R. Montminy
// 05/21/2025
// CS320: Software Testing, Automation, & QA


import java.util.Map;
import java.util.HashMap;


public class ContactsService {
	//Setting up the hash map
	private final Map<String, Contact> contacts = new HashMap<>();
	
	
	//Adding new contacts
	public void addContact(Contact contact) {
		if (contact == null || contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("THIS CONTACT IS EITHER INVALID OR ALREADY EXISTS.");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	
	// Deletion of contacts
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("CONTACT INVALID. MAKE SURE IT EXISTS BEFORE ATTEMPTING DELETION.");
		}
		contacts.remove(contactId);
	}
	
	
	// Updating contact information
	public void updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("CONTACT INVALID. MAKE SURE IT EXISTS BEFORE EDITING DETAILS.");
		}
		if (firstName != null) {
			contact.setFirstName(firstName);
		}
		if (lastName != null) {
			contact.setLastName(lastName);
		}
		if (phoneNumber != null) {
			contact.setPhoneNumber(phoneNumber);
		}
		if (address != null) {
			contact.setAddress(address);
		}
	}
}
