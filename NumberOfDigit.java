
public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 00543210;
		int count =0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		
		System.out.println("Number of digit in a number: "+count);

	}

}
