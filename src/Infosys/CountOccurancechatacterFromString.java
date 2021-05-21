package Infosys;

public class CountOccurancechatacterFromString {

	public static void main(String[] args) {
		
		String a = "Java is amazing programming language";
		
		int original=a.length();
		int occurance=a.replace("s", "").length();
		
		int value  = original-occurance;
		System.out.println(value);
	}
}
	