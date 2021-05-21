package JavaPrograms;

public class DuplicateString {

	
	public static void main(String[] args) {
		
		String str = "Sakthivel";
	
		int count1=0;
		for(int i=0;i<str.length();i++)
		{
			int count =0;
			for(int j=1+i;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					System.out.println(str.charAt(i));
				}
			}
			
			if(count>0)
			{
				System.out.println("Duplicate value found");
			}
			
		}
		if(count1==0)
		{
			System.out.println("Duplicate value not found");
		}
		
		
	}
}
