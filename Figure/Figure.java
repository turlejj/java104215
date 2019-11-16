package Figure;

public class Figure implements FigureAttributes {
	
	public int numberOfSides;
	public String figureType;
	
	public Figure(int nrOfSides, String type) {
		this.numberOfSides = nrOfSides;
		this.figureType = type;
	}
	
	@Override
	public void printNumberOfSides() {
		System.out.println("Number of my figure sides is: " + this.numberOfSides);
		
	}
	@Override
	public void printTypeOfFigure() {
		System.out.println("Im a " + this.figureType);
		
	}
	
	

}
