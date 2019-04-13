/*
 * CAI.java
 * Author:Yun Pei Chao 
 */
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
do {
		int num1=OneDigitInteger();
		int num2=OneDigitInteger();
		Scanner input=new Scanner(System.in);
		int answer=0;
		int correct=num1*num2;
		System.out.println("How much is " + num1 + " times " + num2 +"?");
		answer=input.nextInt();
		
		while(answer!=correct)
		{
			System.out.println("No. Please try again");
			answer=input.nextInt();
		}
		
		System.out.println("Very good!");
}while(true);
		
	}

	
	public static int OneDigitInteger()
	{
		SecureRandom random=new SecureRandom();
		return random.nextInt(10);
	}
	
	
	
}
