package triangle;

public class Main {
	public static void main(String[] args) {
		double[] triangleSides = {4, 3, 6};
		Triangle triangle = new Triangle(triangleSides);
		
		System.out.println("Is my triangle is valid - " + triangle.IsTriangle());
		triangle.TriangleSidesAsc();
		triangle.CountTriangleArea();
		triangle.IsTriangleRectangular();
		triangle.IsTriangleObtuse();
	}
}
