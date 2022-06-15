/*
 * ReducingStudentFatigue.java
 * Author:Yun Pei Chao 
 */
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ReducingStudentFatigue {

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
			{Random rand = new Random();
               int  response = rand.nextInt(4) + 1;
				
				switch(response) {
				case 1:
				System.out.println("No. Please try again");
				break;
				case 2:
					System.out.println("Wrong. Try once more.");
					break;
				case 3:
					System.out.println("Don't give up!");
					break;
				case 4:
					System.out.println("No. Keep trying.");
					break;
				}
				
				answer=input.nextInt();
			}
			Random rand = new Random();
            int  response = rand.nextInt(4) + 1;
			switch(response) {
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			}
			
	}while(true);
			
		}

		
		public static int OneDigitInteger()
		{
			SecureRandom random=new SecureRandom();
			return random.nextInt(10);
		}
		
		
		
	}
