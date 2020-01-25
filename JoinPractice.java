
public class JoinPractice extends Thread {
	private int x;
	private int y;
	
	public JoinPractice(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void run() {	
		
		
		for(int i = this.x; i<=this.y; i++) {
			System.out.println(i);
		}
	}

}
