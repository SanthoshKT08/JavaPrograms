package JavaPrograms;

import java.util.Scanner;

public class SumNoOfDigits {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Digits");
		long  number=in.nextInt();
		long sum=0;
		
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		
		System.out.println("Sum No of Digits :" + sum);
	}

}
