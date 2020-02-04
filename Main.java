import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Main {
	
	public static void main(String args[]) {
		String input;
		List<Integer> userInputs = new ArrayList<Integer>();
		do {
			input = JOptionPane.showInputDialog("Wprowadz liczbe:");	
			
			try {
				int parsedInput = Integer.parseInt(input);
				userInputs.add(parsedInput);
			}
			catch(Exception ex) {
				if(input.toLowerCase().equals("n")) {
					break;
				}
				System.out.println("Nieprawidlowa wartosc. Wprowadzaj liczby lub litere n aby zakonczyc");
			}
			
		}while(!input.toLowerCase().equals("n"));
		
		ResponseHelper helper = new ResponseHelper();
		helper.showSortedResponse(userInputs);
		
		System.out.println("Koniec! :)");
	}
}
