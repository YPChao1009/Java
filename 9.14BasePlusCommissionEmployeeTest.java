/*
 * BasePlusCommissionEmployeeTest.java
 * Author:Yun Pei Chao 
 */
public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
 
		BasePlusCommissionEmployee commissionEmployee=new BasePlusCommissionEmployee
				("Bob","Lewis", "333-33-3333", 5000, .04, 300);
	
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("First name is %s%n",commissionEmployee.getfirstName());
System.out.printf("Last name is %s%n",commissionEmployee.getlastName());
System.out.printf("Social security number is %s%n",commissionEmployee.getsocialSecurityNumber());
System.out.printf("Gross sales is %.2f%n",commissionEmployee.getgrossSales());
System.out.printf("Commission rate is %.2f%n",commissionEmployee.getcommissionRate());
System.out.printf("Base salary is %s%n%n",commissionEmployee.getbaseSalary());

commissionEmployee.setbaseSalary(1000);

System.out.printf("%s%n%n%s%n","Updated:", commissionEmployee);
	}

}
