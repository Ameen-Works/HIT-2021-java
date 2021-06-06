package basics;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side of square: ");
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		System.out.println("The area of square: "+ num*num);
		scan.close();

	}

}
