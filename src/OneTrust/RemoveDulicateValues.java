package OneTrust;

public class RemoveDulicateValues {
	
	
	public static void main(String[] args) {
		
		int [] repeat = {1,2,2,3,4,5,5,6,7,8,2};
		int count;
		for(int i=0;i<repeat.length;i++)
		{
			count =1;
			for(int j=i+1;j<repeat.length;j++)
			{
				if(repeat[i]==repeat[j])
				{
					count++;					
				}
			}
			
			if(count==1)
			{
				System.out.print(repeat[i]);
			}
		}	
	}

}
