/*
 * Guess.java
 * Author:Yun Pei Chao 
 */
import static java.lang.Math.random;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

Scanner input=new Scanner(System.in);

char decision=' ';
int guess=0;
do {
	System.out.println("<Guess the number(1~1000)>");
	int answer=(int)(random()*(1000-1+1)+1);
int min_Number=1, max_Number=1000;
	do {
		System.out.printf("Please enter a number(%d ~ %d)\n",min_Number,max_Number);
		guess=input.nextInt();
		if(guess>answer) {
			System.out.println("Too high.Try again");
		if(guess <max_Number)
			max_Number=guess;
		else
			max_Number=max_Number; }
	else if(guess<answer) {
			System.out.println("Too low.Try again");
		 if(guess>min_Number)			 
			 min_Number=guess;
		 else
			 min_Number=min_Number; 
			 }
	else if(guess==answer)
		System.out.println("Congratulations.You guessed the number!");
	}while(guess!=answer);
	
	
	
	
	
	System.out.printf("Do you want to play again?(Enter 'Y' or 'y' to continue)=>");
	
	decision=input.next().charAt(0);
}while(decision=='y'||decision=='Y');
	}

}
