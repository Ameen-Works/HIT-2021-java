package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1=new Scanner(System.in);
		System.out.println("Enter the number: "	);
		int num=n1.nextInt();
		System.out.println("The Factorial of the number is: "+fact(num));
	n1.close();	
	}
	static int fact(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		output=fact(n-1)*n;
		return output;
	
	}

}
