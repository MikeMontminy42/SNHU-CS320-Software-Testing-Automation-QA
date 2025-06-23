// Mike R. Montminy
// 05/21/2025
// CS320: Software Testing, Automation, & QA


// IMPORTS
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTesting {
	private ContactsService service;
	
	
	@BeforeEach
	public void serviceSetUp() {
		service = new ContactsService();
	}
	
	
	
	// ADD CONTACT TESTING
	@Test
	public void testAddContactSUCCESS() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		assertNotNull(service);
	}
	
	@Test
	public void testAddContactDUPE() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
	}
	
	@Test
	public void testAddContactNULL() {
		Contact contact = null;
		assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
	}

	
	// UPDATE CONTACT TESTING
	@Test
	public void testUpdateContactFName() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		service.updateContact("125", "Marcus", "Montminy", "6065481939", "75 Carmine Road");
		assertEquals("Marcus", contact.getFirstName());
	}
	
	@Test public void testUpdateContactLName() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		service.updateContact("125", "Mike", "Ford", "6065481939", "75 Carmine Road");
		assertEquals("Ford", contact.getLastName());
	}
	
	@Test
	public void testUpdateContactPNumber() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		service.updateContact("125", "Mike", "Montminy", "1231231231", "75 Carmine Road");
		assertEquals("1231231231", contact.getPhoneNumber());
	}
	
	@Test
	public void testUpdateContactAddress() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		service.updateContact("125", "Mike", "Montminy", "6065481939", "745 Gulf Road");
		assertEquals("745 Gulf Road", contact.getAddress());
	}
	
	@Test
	public void testUpdateContactDNE() {
		assertThrows(IllegalArgumentException.class, () -> service.updateContact("181", "Shaun", "McAllister", "1234567890", "12 Parrot Street"));
	}
	
	
	// DELETE CONTACT TESTING
	@Test
	public void testDeleteContactSUCCESS() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		service.deleteContact("125");
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact("125"));
	}
	
	@Test
	public void testDeleteContactDNE() {
		Contact contact = new Contact("125", "Mike", "Montminy", "6065481939", "75 Carmine Road");
		service.addContact(contact);
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact("141"));
	}
}

