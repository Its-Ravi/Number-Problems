// --> extract all the digits of a number

public class ExtractNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5432;
		
		while(n>0) {
			int rem = n%10;
			
			System.out.println(rem);
			
			n = n/10;
					
		}

	}

}
