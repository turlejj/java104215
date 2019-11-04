package triangle;

import java.util.Arrays;

public class Triangle {
	
	int requiredNumberOfSides = 3;	
	
	//props
	double[] triangleSides;
	
	public Triangle(double[] triangleSides) {
		this.triangleSides = triangleSides;
	}
	
	public boolean IsTriangle() {
		double maxValue = this.triangleSides[0];
		double[] shorterSides = {0, 0};
		int n = 0;
		for (int i = 1; i < this.triangleSides.length; i++) {
			if(this.triangleSides[i] > maxValue) {
				maxValue = this.triangleSides[i];
			}					
						
		}
		
		for(double element : this.triangleSides) {
			if(element != maxValue) {
				shorterSides[n] = element;
				n++;
			}
			
		}
		
		return (maxValue < shorterSides[0] + shorterSides[1]) 
				&& this.triangleSides.length == this.requiredNumberOfSides;
	}
	
	public void TriangleSidesAsc() {
		double[] sidesAsc = this.triangleSides;
		Arrays.sort(sidesAsc);
		System.out.println(Arrays.toString(sidesAsc));		
	}
	
	public void CountTriangleArea() {
		double a = this.triangleSides[0];
		double b = this.triangleSides[1];
		double c = this.triangleSides[2];
		
		double s= (a+b+c)/2.0;
		double result = s*(s-a)*(s-b)*(s-c);
        double  area = Math.sqrt(result);
        System.out.println("Area of Triangle is: " + area);
	}
	
	public void IsTriangleRectangular() {
		double[] sidesAsc = this.triangleSides;
		Arrays.sort(sidesAsc);
		
		boolean isRectangular = Math.pow(sidesAsc[0], 2) + Math.pow(sidesAsc[1], 2) == Math.pow(sidesAsc[2], 2)? true : false;
		System.out.println("Triangle is rectangular - " + isRectangular);
	}
	
	public void IsTriangleObtuse() {
		double[] sidesAsc = this.triangleSides;
		Arrays.sort(sidesAsc);
		
		boolean isObtuse = Math.pow(sidesAsc[0], 2) + Math.pow(sidesAsc[1], 2) < Math.pow(sidesAsc[2], 2)? true : false;
		System.out.println("Triangle is obtuse - " + isObtuse);
	}
	
	
}
