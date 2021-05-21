package JavaPrograms;

public class FIndMaximumAndMinimumValuesInArray {

	public static void main(String[] args) {
		
		
		int a[] = {10,20,50,80, 1, 200};
		
	     int max = a[0];
	     
	     for(int i=1;i<a.length;i++)
	     {
	    	 if(a[i]>max)
	    	 {
	    	    max=a[i];	 
	    	 }
	     }
	     
	     System.out.println(max);
	     
	     int min=a[0];
	     
	     for(int j=1;j<=a.length-1;j++)
	     {
	    	 if(a[j]<min)
	    	 {
	    		 min=a[j];
	    	 }
	     }
	     
	     System.out.println(min);
	}

}
