package JavaPrograms;

import java.util.Arrays;

public class ArraysAreEqualOrNot {

	public static void main(String[] args) {

		int a1 [] = {1,2,3,4,5};
		int a2 [] = {1,2,3,4,5};

		Boolean status=Arrays.equals(a1, a2);

		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

		//	  Boolean status = true;
		//	  
		//	  if(a1.length==a2.length)
		//	  {
		//		  for(int i=0;i<=a1.length-1;i++)
		//		  {
		//			  if(a1[i]!=a2[i])
		//			  {
		//				  status=false;
		//			  }
		//			 
		//		  }
		//	  }
		//	  else
		//	  {
		//		  System.out.println("Arrays are not equals");
		//	  }
		//	  if(status==true)
		//	  {
		//		  System.out.println("Arrays are equals");
		//	  }
		//	  else
		//	  {
		//		  System.out.println("Are not");
		//	  }
	}

}
