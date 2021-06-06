package basics;

import java.util.Scanner;

public class ReverseNumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,reversnum=0;
		System.out.println("Enter your number");
		Scanner number=new Scanner(System.in);
		num=number.nextInt();
		while(num!=0) {
			reversnum=reversnum*10;
			reversnum=reversnum+num%10;
			num=num/10;
		}
		System.out.println("reverse of input number is: "+reversnum);
		number.close();

	}

}
