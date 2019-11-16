package Car;

public class ZadanieCar {
	
	public static void main(String[] args) {
		Mercedes MercedesCar = new Mercedes();
		
		MercedesCar.SetBrand("Mercedes");
		
		System.out.println("Im a car! And Im a " + MercedesCar.GetBrand());
	}

}
