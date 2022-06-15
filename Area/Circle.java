
public class Circle extends Land{

	private double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	public void setCircle(double r) {
		this.r=r;
	}
	public double getCircle() {
		return r;
	}
	public double area() {
		return 3.14159*r*r;
	}
	public String toString() {
		return "Circle with r= "+r;
	}
}
