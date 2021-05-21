package JavaPrograms;

public class SwapNumbers {
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Logic 1 : Empty variable
		
		System.out.println("Before Swapping : "+a + " " + b);
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println(a+" "+b);
		
		//Logic 2 + and - Without using 3rd variable.
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		// Use * and / without using 3rd variable.
		
//		a=a*b; //200
//		b=a/b;
//		a=a/b;
		
		

		//logic 4 - Single statement
		
		b=a+b-(a=b);
		
		System.out.println("After Swapping : "+a+" "+b);
		
		
		
	}

}
