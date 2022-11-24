
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			n=n/10;
			sum = rem + sum;
			
		}
		System.out.println("Sum of Digit is: "+sum);

	}

}
