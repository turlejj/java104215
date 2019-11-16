package StrEnd;

import java.util.Scanner;

public class StrEnd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		
		do {
			System.out.print("Insert text: ");
			userInput = scan.nextLine();	
						
		}while(!userInput.endsWith("end"));
		
		System.out.println("End of the program");		
		
	}
	
}
