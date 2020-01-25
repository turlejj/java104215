
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Account account = new Account(100);
		account.start();
		account.join();

		Account account1 = new Account(200);
		account1.start();
		account.join();
	}


}
