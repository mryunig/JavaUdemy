package Package;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.out.println("Hello from Macintosh");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gebe etwas ein:");
		
		String eingabeString = sc.next();
		
		System.out.println("Eingabe: " + eingabeString);
		
		System.out.println("Hallo from Linux");
	}

}
