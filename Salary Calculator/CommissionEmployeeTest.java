/*
 * CommissionEmployeeTest.java
 * Author:Yun Pei Chao 
 */
public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
CommissionEmployee employee=new CommissionEmployee
("Sue", "Jones", "222-22-2222", 10000, .06);
System.out.println("Employee information obtained my get methods:");

System.out.printf("First name is %s%n",employee.getfirstName());
System.out.printf("Last name is %s%n",employee.getlastName());
System.out.printf("Social security number is %s%n",employee.getsocialSecurityNumber());
System.out.printf("Gross sales is %.2f%n",employee.getgrossSales());
System.out.printf("Commission rate is %.2f%n%n",employee.getcommissionRate());

employee.setgrossSales(5000);
employee.setcommissionRate(.1);


System.out.printf("%s%n%n%s%n","Updated:", employee);

		
	}

}
