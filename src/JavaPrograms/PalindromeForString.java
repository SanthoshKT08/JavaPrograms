package JavaPrograms;

import java.util.Scanner;

public class PalindromeForString {
	
	public static void main(String[] args) {
		
		//Palindrome number in java: A palindrome number is a number that is same after reverse. 
		//For example 545, 151, 34543, 343, 171, 48984, 10201 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
		
		//Using scanner class will do number/String
		
		
		String Original , reverse = "" ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String or Number to check the palindrome");
		
		Original=in.nextLine();
		
		int lenghth = Original.length();
		
		for(int i=lenghth-1;i>=0;i--)
		{
			//System.out.print(Original.charAt(i) + " ");
			 reverse=reverse+Original.charAt(i);
		}
		
		if(Original.equalsIgnoreCase(reverse))
		{
			System.out.println(reverse+" is a palindrome");
		}
		
		else
		{
			System.out.println("is a not palindrome");
		}

	}

}
