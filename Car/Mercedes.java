package Car;

public class Mercedes extends Car {

	public String model;
	public double prize;
	public String engine;
	
	public void SetModel(String model) {
		this.model = model;
	}
	
	public String GetModel() {
		return model;
	}
	
	public void SetPrize(double prize) {
		this.prize = prize;
	}
	
	public double GetPrize() {
		return prize;
	}
	
	public void SetEngine(String engine) {
		this.engine = engine;
	}
	
	public String GetEngine() {
		return engine;
	}
}
