package JavaPrograms;

public class FindMissingNumberInArray {
	
	
	public static void main(String[] args) {
		
		
		int a [] = {1,2,3,5};
		
		int sum1=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println(sum1);
		
		int sum2=0;
				
				for(int j=0;j<=5;j++)
				{
					sum2=sum2+j;
				}
				
				System.out.println(sum2);
				
				System.out.println("Missing number in array "+ (sum2-sum1));
	}

}
 