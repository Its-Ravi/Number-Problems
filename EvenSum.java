//--> sum of even digits of a number 

import java.util.*;
public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = (sc.nextInt());
		int sum = 0;
		
		while(n>0) {
			int rem = n%10;
			
			if(rem%2==0) {
				
				sum = sum+rem;
				
			}
			
			n=n/10;
	
		}
		System.out.println("Sum of even number is: " +sum);

	}

}
