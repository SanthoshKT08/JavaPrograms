package JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  Num=sc.nextInt();
		
//		int rev=0;
//		
//		while(Num!=0)
//		{
//			rev=rev*10+Num%10;
//			Num=Num/10;
//		}
//		
//		System.out.println(rev);
//		
		
//		StringBuffer sb= new StringBuffer(String.valueOf(Num));
//		
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		
		StringBuilder strin = new StringBuilder();
		StringBuilder rev = strin.append(Num);
		System.out.println(rev.reverse());
		
		
	}
}
