package Car;
import java.util.Date;

public abstract class Car {

	public String brand;
	public int numberOfWheels;
	public Date productionYear;
	public double course;
	public int horsePower;
	public String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setNumberOfWheels(int nrOfWheels) {
		this.numberOfWheels = nrOfWheels;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}
	
	public Date getProductionYear() {
		return productionYear;
	}
	
	public void setCourse(double course) {
		this.course = course;
	}
	
	public double getCourse() {
		return course;
	}
	
	public void setHorsePower(int hoursePwr) {
		this.horsePower = hoursePwr;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}
