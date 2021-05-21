package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		//Factorial- 5! = 1*2*3*4*5=120;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int num=in.nextInt();

		long factorial = 1;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}

		System.out.println(num+"! Factorial is "+ factorial);
	}

}
