package OneTrust;

public class RemoveExtraSpaces {
	
	public static void main(String[] args) {
		
		String name = "S A N T H O S H";
		name=name.replaceAll("\\s", "");
		System.out.println(name);
		
		
		String name1 = "google      is amazing                     workSpace";
		
		name1=name1.replaceAll("\\s+", " ");
		
		System.out.println(name1);
	}

}
