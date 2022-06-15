/*
 * Employee.java
 * Author:Yun Pei Chao 
 */
public class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {}
	
	Employee(String firstName,String lastName,String socialSecurityNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setsocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public String toString() {
		return String.format("%s: %s %s%n%s:%s",
				"Employee",getfirstName(),getlastName(),
				"Social security number",getsocialSecurityNumber());
	}
}
