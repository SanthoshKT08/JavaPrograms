package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int Number=in.nextInt();
	    int count =0;
	    
	    // Natural number >1
	    // if the factor 2 which means 1 and itself - its a prime number.
	    
	    if(Number>1)
	    {
	    	for(int i=1;i<=Number;i++)
	    	{
	    		if(Number%i==0)
	    		{
	    			count++;
	    		}
	    		
	    	}
	    	if(count==2)
	    	{
	    		System.out.println(Number +": This is prime number");
	    	}
	    	else
	    	{
	    		System.out.println("This is not a prime number");
	    	}
	    }
	    else
	    {
	    	System.out.println("This is not a prime number");
	    }
	}

}
