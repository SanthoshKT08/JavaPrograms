package JavaPrograms;

public class countTheNumberOfDigits {
	
	public static void main(String[] args) {
		
		int Numbers = 2323;
		int count =0;
		
		while (Numbers>0) {
			Numbers = Numbers/10;
			count++;
		}
		
		System.out.println("No of counts " + count);
	}

}
