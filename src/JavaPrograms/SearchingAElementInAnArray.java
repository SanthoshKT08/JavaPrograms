package JavaPrograms;

public class SearchingAElementInAnArray {

	public static void main(String[] args) {
		
		int no [] = {1,2,334,434,34,33};
		
		int search=4;
		
		Boolean flag=false;
		for(int i=0;i<=no.length-1;i++)
		{
			
			if(search==no[i])
			{
				System.out.println("Searching element is : " +no[i]);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Search NO is not found");
		}
	}

}
