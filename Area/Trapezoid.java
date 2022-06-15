
public class Trapezoid extends Land{

	private double hSide;
	private double lSide;
	private double height;
	
	public Trapezoid(double hSide,double lSide,double height) {
		this.hSide=hSide;
		this.lSide=lSide;
		this.height=height;
	}
	public double area() {
		return (hSide+lSide)*height/2;
	}
	public String toString() {
		return "Trapezoid with hSide= "+hSide+",lSide= "+lSide+",height= "+height;
				}
}
