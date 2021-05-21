package JavaPrograms;

public class FibonacciSeries {
	
	
	
    public static void main(String[] args) {
    	
    	int f=0, s=1, t, series=8;
		System.out.print(f +" " + s);
		
		for(int i=2;i<=series;i++)
		{
		    t=f+s;
		    System.out.print(" " +t);
		    f=s;
		    s=t;
		}
	}

}
