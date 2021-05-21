package OneTrust;

public class RemoveExtraSpace {
	
	public static void main(String[] args) {
		String sentance="Working       as                       QA";
		String name="";
		for (int i = 0; i < sentance.length(); i++) {
			if (sentance.charAt(i)!=' ') {
				name+=sentance.charAt(i);
			}
			else if(sentance.charAt(i)==' '){
				int j=i+1;
				if (sentance.charAt(j)!=' ') {
					name+=sentance.charAt(i);
				}
				
				else  {
					continue;
				}
			}
			
		}
		
		System.out.println(name);
	}

}
