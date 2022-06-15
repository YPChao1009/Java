/*
 * HourlyEmployeeTest.java
 * Author:Yun Pei Chao 
 */
public class HourlyEmployeeTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		HourlyEmployee employee=new HourlyEmployee
				("Sue", "Jones", "222-22-2222",30,133.2);
				System.out.println("Employee information obtained my get methods:");

				System.out.printf("First name is %s%n",employee.getfirstName());
				System.out.printf("Last name is %s%n",employee.getlastName());
				System.out.printf("Social security number is %s%n",employee.getsocialSecurityNumber());
				System.out.printf("Hours is %.2f%n",employee.getHours());
				System.out.printf("Wage is %.2f%n",employee.getWage());
				System.out.printf("Total wages are %.2f%n%n",employee.earnings());

				employee.setHours(45);
		


				System.out.printf("%s%n%n%s%n","Updated:", employee);

						
					

	}

}
