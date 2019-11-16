package Person;

public class VipPerson extends Person {

	public Boolean isVip;
	
	public VipPerson(Boolean isVip) {
		this.isVip = isVip;
	}
	
	public void introduction() {
		if(this.isVip) {
			System.out.println("Im Vip ! Yeaaah");
		}else {
			System.out.println("Im not Vip :(");
		}
	}
}
