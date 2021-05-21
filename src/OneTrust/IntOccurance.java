package OneTrust;

public class IntOccurance {
	
	public static void main(String[] args) {
		int [] a= {1,2,1,2,3,2,3};
		boolean [] visited=new boolean[a.length];

		for (int i = 0; i < a.length; i++) {			
			if (visited[i]==true) 
				continue;
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println(a[i] +" : "+ count);
		}

	}

}
