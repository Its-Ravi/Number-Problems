// --> Factorial using recursion and without recursion.

import java.util.*;
public class FactorialRec {
	
//	public static int factorial(int m) {
//		if(m==0) {
//			return 1;
//		}
//		
//		else {
//			return(m*factorial(m-1));
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate Factorial: ");
		int n = sc.nextInt();
		//int fact = factorial(n);
		int fact = 1;
		for(int i=1; i<=n;i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is: "+fact);

	}

}
