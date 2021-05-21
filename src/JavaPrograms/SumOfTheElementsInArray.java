package JavaPrograms;

public class SumOfTheElementsInArray {
	
	public static void main(String[] args) {
		
		int a [] = {2,3,4,5,6,7,8,4,3,3,3,3,3,3,3};
		
		int sum=0;
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			sum=sum+a[i];
//		}
//		
//		System.out.println("SumOfTheElementsInArray is :" +sum);
		
		for(int value: a)
		{
			sum=sum+value;
		}
		
		System.out.println(sum);
	}

}
