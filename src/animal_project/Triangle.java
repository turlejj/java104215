package animal_project;

import java.util.Arrays;

public class Triangle {
	
	int requiredNumberOfSides = 3;	
	
	//props
	int[] triangleSides;
	
	public Triangle(int[] triangleSides) {
		this.triangleSides = triangleSides;
	}
	
	public boolean IsTriangle() {
		int maxValue = this.triangleSides[0];
		int[] shorterSides = {0, 0};
		int n = 0;
		for (int i = 1; i < this.triangleSides.length; i++) {
			if(this.triangleSides[i] > maxValue) {
				maxValue = this.triangleSides[i];
			}					
						
		}
		
		for(int element : this.triangleSides) {
			if(element != maxValue) {
				shorterSides[n] = element;
				n++;
			}
			
		}
		
		return (maxValue < shorterSides[0] + shorterSides[1]) 
				&& this.triangleSides.length == this.requiredNumberOfSides;
	}
	
	public void TriangleSidesAsc() {
		int[] sidesAsc = this.triangleSides;
		Arrays.sort(sidesAsc);
		System.out.println(Arrays.toString(sidesAsc));		
	}
	
	public void CountTriangleArea() {
		int a = this.triangleSides[0];
		int b = this.triangleSides[1];
		int c = this.triangleSides[2];
		
		int s=(a+b+c)/2;
        double  area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is: " + area);
	}
	
	//czy trojkat jest prostokatny ? 
	//czy trojkat jest rozwartokatny ?
	
	//nowe zadanie przygotowac quiz
	//szczytywanie z pliku (zel)
	
}
