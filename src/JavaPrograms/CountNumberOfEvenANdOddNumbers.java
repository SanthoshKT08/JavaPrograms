package JavaPrograms;

public class CountNumberOfEvenANdOddNumbers {


	public static void main(String[] args) {

        
		long Number = 64398544;
		System.out.println("Count Number Of Even ANd Odd Numbers");

		int Even_count = 0;
		int Odd_Count = 0;

		while(Number>0)
		{
			//Logic is extract last number. Use % / 10

			long Remainder = Number%10;
			System.out.println(Remainder);

			if(Remainder%2==0)
			{
				Even_count++;
			}

			else {
				Odd_Count++;
			}	

			Number=Number/10;

		}

		System.out.println("Odd count is :" + Odd_Count);
		System.out.println("Even count is :" + Even_count);


	}
}
