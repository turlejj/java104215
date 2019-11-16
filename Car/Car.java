package Car;
import java.util.Date;

public abstract class Car {

	public String brand;
	public int numberOfWheels;
	public Date productionYear;
	public double course;
	public int horsePower;
	public String color;
	
	public void SetBrand(String brand) {
		this.brand = brand;
	}
	
	public String GetBrand() {
		return brand;
	}
	
	public void SetNumberOfWheels(int nrOfWheels) {
		this.numberOfWheels = nrOfWheels;
	}
	
	public int GetNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void SetProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}
	
	public Date GetProductionYear() {
		return productionYear;
	}
	
	public void SetCourse(double course) {
		this.course = course;
	}
	
	public double GetCourse() {
		return course;
	}
	
	public void SetHorsePower(int hoursePwr) {
		this.horsePower = hoursePwr;
	}
	
	public int GetHorsePower() {
		return horsePower;
	}
	
	public void SetColor(String color) {
		this.color = color;
	}
	
	public String GetColor() {
		return color;
	}
	
}
