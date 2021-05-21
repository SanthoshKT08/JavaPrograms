package Practice;

import java.util.LinkedHashSet;

public class DuplicateValueRemove {
	
	public static void main(String[] args) {
	
		int []  a = {1,1,2,2,3,3,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		
	}

}
