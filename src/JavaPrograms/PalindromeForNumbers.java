package JavaPrograms;

import java.util.Scanner;

public class PalindromeForNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		
		int Numbers=sc.nextInt();
		int orinal=Numbers;
		int Reverse=0;
		
		while(Numbers!=0)
			{
			    Reverse=Reverse*10+Numbers%10;
			    Numbers=Numbers/10;
			}
		
		System.out.println(Reverse);
		
		if(orinal==Reverse)
		{
			System.out.println("This is palindrom");
		}
		else
		{
			System.out.println("THis is not palindrom");
		}
	}
}
