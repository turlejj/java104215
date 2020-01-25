
public class Account extends Thread {

	private float accountBallance = 1000;
	private float withdrawAmmount;
	
	public Account(float withdrawAmmount) {
		this.withdrawAmmount = withdrawAmmount;
	}
	
	public void run() {
		this.checkAccountBallanceBefore();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.withdrawMoney();
		
		this.checkAccountBallanceAfter();
	}
	


	private synchronized void  checkAccountBallanceBefore() {
		System.out.println("Stan konta przed wyp³at¹: " + this.accountBallance);
	}
	
	private void withdrawMoney() {
		if(this.accountBallance > this.withdrawAmmount) {
			this.accountBallance -= this.withdrawAmmount;
		}
	}
	
	private synchronized void  checkAccountBallanceAfter() {
		System.out.println("Stan konta po wyp³acie: " + this.accountBallance);
	}
}