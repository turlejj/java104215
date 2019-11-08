import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
				
		String fileName = "C://Users/Przemo/eclipse-workspace/Quiz/JavaQuiz.txt";
		Quiz[] QuizSet = ReadQuizData(fileName);
		int points = 0;
		String answer;
		Scanner in = new Scanner(System.in);
		
		for(Quiz element:QuizSet) {
			System.out.println("\n" + element.Question);
			System.out.print(element.AnswerOptions[0] + "   ");
			System.out.println(element.AnswerOptions[1]);
			System.out.print(element.AnswerOptions[2] + "   ");
			System.out.println(element.AnswerOptions[3] + "\n");
			
			System.out.print("Odpowiedz: ");
			answer = in.nextLine();
			if(new String(answer).equals(element.Answer)) {
				points++;
			}
		}
		
		System.out.println("Koniec quizu ! Twoj wynik to " + points + " pkt !");
		
		System.exit(0);
	}
	
	private static Quiz[] ReadQuizData(String fileName) {
		Quiz[] set = new Quiz[4];
		set[0] = new Quiz();
		set[1] = new Quiz();
		set[2] = new Quiz();
		set[3] = new Quiz();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			int lineNr = 1;
			int i = 0;
			int j = 0;
			int answrOptionsCount = 0;
			
			while ((line = br.readLine()) != null) {
				if(lineNr == 1 || lineNr == 7 || lineNr == 13 || lineNr == 19) {
					set[i].Question = line;
				}else if(lineNr == 6 || lineNr == 12 || lineNr == 18 || lineNr == 24) {
					set[i].Answer = line;
					i++;
				}else {
					set[i].AnswerOptions[answrOptionsCount] = line;
					answrOptionsCount++;
				}
				lineNr++;
				
				if(answrOptionsCount == 4) {
					answrOptionsCount = 0;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return set;
	}
}
