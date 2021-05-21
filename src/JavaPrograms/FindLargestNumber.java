package JavaPrograms;

public class FindLargestNumber {
	
	public static void main(String[] args) {
		
		int a=21;
		int b=2;
		int c=3;
		
		if(a>b && a>c)
		{
			System.out.println("Largest Number " + a);
		}
		
		else if (b>a && b>c) {
			System.out.println("Largest Number " + b);
		}
		
		else
		{
			System.out.println("Largest Number : "+c);
		}
	}

}
	