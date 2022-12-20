package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);

		/*System.out.println("Enter how many contacts you want to add");
		int contactNumber = s.nextInt();
		s.nextLine();

		Contact[] contacts = new Contact[contactNumber];

		File f = new File("allContacts");

		for (int i = 0; i < contacts.length; i++) {
			System.out.println("Enter phone number");
			String phoneNumber = s.nextLine();
			System.out.println("Enter phone owner");
			String phoneOwner = s.nextLine();
			System.out.println("Enter group");
			Contact.Group group = Contact.Group.valueOf(s.nextLine());
			contacts[i] = new Contact(phoneNumber, phoneOwner, group);
		}

		PrintWriter pw = new PrintWriter(f);
		pw.println(contacts.length);

		for (int i = 0; i < contacts.length; i++) {
			contacts[i].save(pw);
		}

		pw.close();
		*/
		File newFile = new File("allContacts");
		Scanner scanner = new Scanner(newFile);
		int length = scanner.nextInt();

		Contact[] contactsNew = new Contact[length];

		for (int i = 0; i < contactsNew.length; i++) {
			contactsNew[i] = new Contact(scanner);
		}

		for (int i = 0; i < contactsNew.length; i++) {
			System.out.println(i + 1 + " person is " + contactsNew[i].toString());
		}

		
	}

}
