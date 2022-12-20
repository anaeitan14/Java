package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SevenBoom {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter file name");
		String name = s.nextLine();
		
		System.out.println("Enter number");
		int number = s.nextInt();
		
		sevenBoom(name, number);
	}

	
	
	public static void sevenBoom(String filename, int number) throws IOException {
		File f = new File(filename);
		PrintWriter s = new PrintWriter(f);
		
		
		for(int i=1;i<=number;i++) {
			if(i % 7 == 0 || i % 10 == 7) {
				s.println("boom");
			} else {
				s.println(i);
			}
		}
		
		s.close();
	}

}
