
public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1; i < 20;) {
			JoinPractice obj1 = new JoinPractice(i,i+1);
			obj1.start();
			obj1.join();
			
			i+=2;
		}

	}
}
