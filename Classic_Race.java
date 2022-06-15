/*
 * Classic_Race.java
 * Author:Yun Pei Chao 
 */
import java.io.IOException;
import java.util.Scanner;



public class Classic_Race {

	
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
int[] course=new int[70];
boolean end=false;
		Scanner input=new Scanner(System.in);
		int TortoisePosition=0,HarePosition=0,count=0;
		System.out.print("BANG!!!!!\nAND THEY'RE OFF!!!!!\n");
		course[0]=3;
		while (end == false)
		{
			for (int i = 0; i < course.length; i++)
			{
				switch (course[i])
					{
					case 0:
						System.out.printf("_ ");
						break;
					case 1:
						System.out.printf("T ");
						break;
					case 2:
						System.out.printf("H ");
						break;
					case 3:
						if (count == 0)
							System.out.printf("TH ");
						else
							System.out.printf("OUCH!!!");
						break;
					}
			}
		System.out.print("\nPress \"ENTER\" to continue...\n");
		
		try
		{
			System.in.read();
			System.in.read();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		count+=1;
		System.out.printf("Round %d\n", count);
		
		course[TortoisePosition] = 0;
		course[HarePosition] = 0;
		TortoisePosition = Tortoise(TortoisePosition);
		HarePosition = Hare(HarePosition);
		if (TortoisePosition < 0)
			TortoisePosition = 0;
		if (HarePosition < 0)
			HarePosition = 0;
		if (TortoisePosition > 69)
			TortoisePosition = 69;
		if (HarePosition > 69)
			HarePosition = 69;
		course[TortoisePosition] = 1;
		course[HarePosition] = 2;
		if (TortoisePosition == HarePosition)
			course[TortoisePosition] = 3;

		if (TortoisePosition == 69)
		{
			if (HarePosition == 69)
			{
				System.out.println("It's a tie.");
				end = true;
			} else
			{
				System.out.println("TORTOISE WINS!!! YAY!!!");
				end = true;
			}
		} else if (HarePosition == 69)
		{
			System.out.println("Hare wins. Yuch.");
			end = true;
		}
	}}
	
	public static int Tortoise(int position) {
		
		int rand=(int)(Math.random()*(10-1+1)+1);
		int move=0;
		System.out.print("Tortoise:");
		if(rand>=1&&rand<=5) {
			move+=3;
		System.out.println("Fast plod");}
		else if(rand>=6&&rand<=7) {
			move-=6;
		System.out.println("Slip");}
		else if(rand>=8&&rand<=10) {
			move+=1;
		System.out.println("Slow plod");}
		
		return (position+move);
	}
public static int Hare(int position) {
		
		int rand=(int)(Math.random()*(10-1+1)+1);
		int move=0;
		System.out.print("Hare:");
		if(rand>=1&&rand<=2) {
			System.out.println("Sleep");}
		
		else if(rand>=3&&rand<=4) {
			move+=9;
		System.out.println("Big hop");}
		else if(rand==5) {
			move-=12;
		System.out.println("Big slip");}
		else if(rand>=6&&rand<=8) {
			move+=1;
		System.out.println("Small hop");}
		else if(rand>=9&&rand<=10) {
			
			move-=2;
		System.out.println("Small slip");}
		
		return (position+move);
	}
}
