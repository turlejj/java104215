import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResponseHelper {
	public void showSortedResponse(List<Integer> values) {
		List<String> result = new ArrayList<String>();
		Collections.sort(values);
		
		for (int value : values) {
			if(value < 0) {
				result.add("Liczba ujemna |" + value);
			}
			else if(isPrimeNumber(value)) {
				result.add("Liczba pierwsza |" + value);
			}
			else {
				result.add("Liczba dodatnia |" + value);
			}
		}
		
		for (String res : result) {
			System.out.println(res);
		}
	}
	
	private boolean isPrimeNumber(int value) {
		boolean isPrime = true;
		
		for(int i = 2; i<= value/2; i++) {
			if(value % i == 0)
            {
                isPrime = false;
                break;
            }
		}
		
		return isPrime;
	}

}
