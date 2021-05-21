package JavaPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//using concatication.
		String name = "Google";
		String rev = "";
//		int len=name.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+name.charAt(i);
//		}
//		
//		System.out.println(rev);
		
		char[] tochar = name.toCharArray();
		int len=tochar.length;
		for(int i=len-1;i>=0;i--)
		{
		rev=rev+tochar[i];
		}
		
		System.out.println(rev);
		StringBuffer str = new StringBuffer(name);
		
		System.out.println(str.reverse());
		
	}
	

}
