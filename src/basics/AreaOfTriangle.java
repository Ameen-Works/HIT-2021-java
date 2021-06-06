package basics;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the breadth: ");
		Scanner n1=new Scanner(System.in);
		int breadth=n1.nextInt();
		System.out.println("Enter the height: ");
		int height=n1.nextInt();
		System.out.println("The area of triangle is: "+(.5*breadth*height));
		n1.close();

	}

}
