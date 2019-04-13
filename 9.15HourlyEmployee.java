/*
 * HourlyEmployee.java
 * Author:Yun Pei Chao 
 */
public class HourlyEmployee extends Employee1{

	private double hours;
	private double wage;
	
	public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,
			double hours,double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(hours>168||hours<0)
			throw new IllegalArgumentException("The total hours must be <168 and <0");
		if(wage<0)
			throw new IllegalArgumentException("The wage must be>0");
		this.hours=hours;
		this.wage=wage;
		}
	public void setHours(double hours) {
		if(hours>168||hours<0)
			throw new IllegalArgumentException("The total hours must be <168 and <0");
		this.hours=hours;
	}
	public double getHours() {
		return hours;
	}
	public void setWage(double wage) {
		if(wage<0)
			throw new IllegalArgumentException("The wage must be>0");
		this.wage=wage;
	}
	public double getWage() {
		return wage;
	}
	public double earnings() {
		double total;
		if(getHours()>40) {
			total=1.5*getHours()*getWage();
			return total;
		}
		else {
			total=getHours()*getWage();
			return total;
		}
		
	}
	public String toString() {
		return String.format("%s:%s %s%n%s:%s%n%s:%.2f%n%s:%.2f%n%s:%.2f",
				"Empolyee",getfirstName(),getlastName(),
				"Social security number",getsocialSecurityNumber(),
				"Hours",getHours(),"Wage",getWage(),"Total wages",earnings());
	}
}
