import java.util.ArrayList;
import java.util.List;

public class Divisibility extends Thread {
	
	private int x;
	private int y;
	
	public Divisibility(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	List<Integer> result = new ArrayList<Integer>();
	public void run() {
		
		for(int i = x; i <= y; i++) {
			if(i > 0 && i%3 == 0) {
				result.add(i);
			}
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + "  ");
		}
	}

}
