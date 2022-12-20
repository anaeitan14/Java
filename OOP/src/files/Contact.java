package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Contact {
	public enum Group {
		FRIENDS, FAMILY, WORK, OTHER
	};

	private String phoneNumber;
	private String ownerName;
	private Group group;

	public Contact(String phoneNumber, String ownerName, Group group) {
		this.phoneNumber = phoneNumber;
		this.ownerName = ownerName;
		this.group = group;
	}

	public Contact(String filename) throws FileNotFoundException {
		File f = new File(filename);
		Scanner s = new Scanner(f);

		phoneNumber = s.nextLine();
		ownerName = s.nextLine();
		group = Group.valueOf(s.nextLine());
		s.close();

	}

	public Contact(Scanner s) {
		phoneNumber = s.nextLine();
		ownerName = s.nextLine();
		group = Group.valueOf(s.nextLine());
	}

	public void save(String filename) throws FileNotFoundException {
		File f = new File(filename);
		PrintWriter s = new PrintWriter(f);

		s.println(phoneNumber);
		s.println(ownerName);
		s.println(group);

		s.close();
	}

	public void save(PrintWriter s) {
		s.println(phoneNumber);
		s.println(ownerName);
		s.println(group.name());

	}
}
