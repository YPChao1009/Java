/*
 * sales.java
 * Author:Yun Pei Chao 
 */
import java.util.Scanner;
public class sales {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
Scanner input=new Scanner(System.in);

double total=0,salary=0;
int quantity=0; 
		System.out.print("Enter the item or -1 to quit>");
		int item=input.nextInt();
while(item!=-1&&quantity!=-1) {

	
		double price=0;
		switch(item)
		{
		case 1:
			price=239.99;
			break;
		case 2:
			price=129.75;
			break;
		case 3:
			price=99.95;
			break;
		case 4:
			price=350.89;
			break;
			default:
				break;
			
		}
		System.out.print("Enter the quantity>");
		quantity=input.nextInt();
		System.out.print("Enter the item or -1 to quit>");
	item=input.nextInt();
		total+=price*quantity;
		
		}
salary+=200+total*0.09;
		System.out.printf("Your salary is %.2f",salary);
	}
}

