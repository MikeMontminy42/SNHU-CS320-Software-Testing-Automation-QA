// Mike R. Montminy
// 05/21/2025
// CS320: Software Testing, Automation, & QA


// IMPORTS
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTesting {
	
	
	// CREATION TESTING
	@Test
	public void testCreatingContactACCEPTED() {
		Contact contact = new Contact("12052001", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		assertNotNull(contact);
	}
	
	
	// CONSTRUCTOR TESTING
	@Test
	public void testValidConstructor() {
		String contactId = "125";
		String firstName = "Mike";
		String lastName = "Montminy";
		String phoneNumber = "6065481939";
		String address = "75 Carmine Road";
		
		Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
		
		assertEquals(contactId, testContact.getContactId());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
		
	}
	
	
	// FIRST NAME TESTING
	@Test
	public void testValidFirstName() {
		String contactId = "125";
		String firstName = "Mike";
		String lastName = "Montminy";
		String phoneNumber = "6065481939";
		String address = "75 Carmine Road";
		
		Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
		testContact.setFirstName("Name");
		assertEquals("Name", testContact.getFirstName());
	}
	
	@Test
	public void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "WhyIsThisSoLongHelpMeOutHere", null, "1231231231", "75 Carmine Road"));
	}
	
	
	// LAST NAME TESTING
	@Test
	public void testNULLLastName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", null, "1231231231", "75 Carmine Road"));
	}
	
	@Test
	public void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "WhyIsThisSoLong", "1231231231", "75 Carmine Road"));
	}
	
	
	// PHONE NUMBER TESTING
	@Test
	public void testSTRINGPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "Montminy", "123123123A", "75 Carmine Road"));
	}
	
	@Test
	public void testInvalidPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "Montminy", "123123123123", "75 Carmine Road"));
	}	
	
	@Test
	public void testNULLPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "Montminy", null, "75 Carmine Road"));
	}
	
	
	// ADDRESS TESTING
	@Test
	public void testNULLAddress() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "Montminy", "1231231231", null));
	}
	
	@Test
	public void testINVALIDAddress() {
		assertThrows(IllegalArgumentException.class, () -> new Contact("12121212", "Mike", "Montminy", "1231231231", "75 Carmine Road in God only knows where this is in the universe."));
	}
	
	
	// GETTER & SETTER TESTING
	@Test
	public void testGetterandSetter(){
		String contactID = "12121212";
		String firstName = "Mike";
		String lastName = "Montminy";
		String phoneNumber = "1231231231";
		String address = "75 Carmine Road";
		
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		
		assertEquals(contactID, contact.getContactId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNumber, contact.getPhoneNumber());
		assertEquals(address, contact.getAddress());
		
		String newFName = "James";
		String newLName = "Ford";
		String newPNumber = "1231231236";
		String newAddress = "745 Gulf Road";
		
		contact.setFirstName(newFName);
		contact.setLastName(newLName);
		contact.setPhoneNumber(newPNumber);
		contact.setAddress(newAddress);
		
		assertEquals(newFName, contact.getFirstName());
		assertEquals(newLName, contact.getLastName());
		assertEquals(newPNumber, contact.getPhoneNumber());
		assertEquals(newAddress, contact.getAddress());
		
	}
}
