package Practice;

import java.util.Scanner;

public class Blackbuck_2 {

	public static void main(String args[]) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter no of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Please enter no of columns: ");
		int columns = scanner.nextInt();
		int[][]twoDArray=new int[rows][columns];
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[0].length; j++) {
				System.out.println("Please enter the values: ");
				twoDArray[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Richest Num  "+richestNum(twoDArray));
	}


	public static int richestNum(int [][]array)
	{
		int[] sumOfBalance=new int[array.length];

		int richestTotal = 0;

		for (int i = 0; i < array.length; i++) {
			int currentTotal = 0;
			for(int j=0;j<array[0].length;j++) {
				currentTotal += array[i][j];
			}
			sumOfBalance[i]=currentTotal;
		}		
		for (int i = 0; i < sumOfBalance.length; i++) {
			if (sumOfBalance[i]>richestTotal) {
				richestTotal=sumOfBalance[i];
			}
		}

		return richestTotal;
	}

}
