package Infosys;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStringValues {
	
	public static String removeDuplicateString(String str)
	{
		Set<Character> set = new HashSet<>();
		StringBuffer sf= new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
				char c = str.charAt(i);
				if(!set.contains(c))
				{
					set.add(c);
					sf.append(c);
				}
		}
		return sf.toString();
	}
	
	public static void main(String[] args) {
		String str = "santhhosh";
		System.out.println(removeDuplicateString(str));
	}

}
