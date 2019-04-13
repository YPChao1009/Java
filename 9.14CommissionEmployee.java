/*
 * CommissionEmployee.java
 * Author:Yun Pei Chao 
 */
public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName,String lastName,
			String socialSecurityNumber,
			double grossSales,double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		if(grossSales<0.0)
			throw new IllegalArgumentException("Gross sales must be>=0.0");
		if(commissionRate<=0.0||commissionRate>=1.0)
			throw new IllegalArgumentException("Commission rate must be>0.0 and <1.0");
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
	}
	public void setgrossSales(double grossSales) {
		if(grossSales<0.0)
			throw new IllegalArgumentException("Gross sales must be>=0.0");
		this.grossSales=grossSales;
	}
	public double getgrossSales() {
		return grossSales;
	}
	public void setcommissionRate(double commissionRate) {
		if(commissionRate<=0.0||commissionRate>=1.0)
			throw new IllegalArgumentException("Commission rate must be>0.0 and <1.0");
		this.commissionRate=commissionRate;
	}
	public double getcommissionRate() {
		return commissionRate;
	}
	public double earning() {
		return getgrossSales()*getcommissionRate();
	}
	public String toString() {
		return String.format("%s%n%s: %.2f%n%s %.2f",
				super.toString(),"Gross sales",getgrossSales(),
				"Commission rate",getcommissionRate());
	}
	
}
