/*
 * Employee1.java
 * Author:Yun Pei Chao 
 */
public class Employee1 {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee1() {}
	
	Employee1(String firstName,String lastName,String socialSecurityNumber){
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
	public void setsocialNumber(String socialSecurityNumber) {
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}
}
