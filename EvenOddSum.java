import java.util.Scanner;
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		while(n>0) {
			int rem = n%10;
			if(rem%2==0) {
				sum = sum+rem;
			}
			else {
				sum2 = sum2+rem;
			}
			n= n/10;
		}
		System.out.println("Even number sum is: "+sum);
		System.out.println("Odd number sum is: "+sum2);

	}

}
