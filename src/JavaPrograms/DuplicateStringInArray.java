package JavaPrograms;

public class DuplicateStringInArray {
	
	
	public static void main(String[] args) {
		
		String lan [] = {"java", "python", "java"};
		
		Boolean flag=false;
		for(int i=0;i<lan.length;i++)
		{
			for(int j=i+1;j<lan.length;j++)
			{
				if(lan[i]==lan[j])
				{
					System.out.println("Duplicate value found : " + lan[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Dulicate value not found");
		}
	}

}
