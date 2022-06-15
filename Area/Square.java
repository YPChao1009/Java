
public class Square extends Land{

	private double side;
	
	public Square(double side) {
		this.side=side;
	}
	public void setSquare(double side) {
		this.side=side;
	}
	public double getSquare() {
		return side;
	}
	public double area() {
		return side*side;
	}
	public String toString() {
		return "Square with side= "+side;
	}
}
