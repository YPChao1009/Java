
public class Calculator {

	private double unitprice;
     public Calculator(double unitprice) {
    	 this.unitprice=unitprice;
     }
     public void setPrice(double unitprice) {
    	 this.unitprice=unitprice;
     }
     public double getPrice() {
    	 return unitprice;
     }
     public double calculatePrice(Land l) {
    	 return unitprice*l.area();
     }
}
