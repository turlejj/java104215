package animal_project;

public class Main {
	public static void main(String[] args) {
		int[] triangleSides = {10, 6, 5};
		Triangle triangle = new Triangle(triangleSides);
		
		System.out.println("Is my triangle is valid - " + triangle.IsTriangle());
		triangle.TriangleSidesAsc();
		triangle.CountTriangleArea();
	}
}
