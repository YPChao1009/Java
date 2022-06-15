/*
 * BasePlusCommissionEmployee.java
 * Author:Yun Pei Chao 
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName,String lastName,
			String socialSecurityNumber,double grossSales,double commissionRate,
			double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary<0.0)
			throw new IllegalArgumentException("Base salary must be>0.0");
		this.baseSalary=baseSalary;
	}
public	void setbaseSalary(double baseSalary) {
	if(baseSalary<0.0)
		throw new IllegalArgumentException("Base salary must be>0.0");
		this.baseSalary=baseSalary;
	}
public double getbaseSalary() {
	return baseSalary;
}

public double earning() {
	return getbaseSalary()+super.earning();
}
public String toString() {
	return String.format("%s %s%n%s: %.2f",
			"Base-salaried",super.toString(),
			"Base salary",getbaseSalary());
}
}
