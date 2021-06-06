package basics;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, breadth;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter length");
		length=scanner.nextInt();
		System.out.println("enter breadth");
		breadth=scanner.nextInt();
		System.out.println("area of rectangle is: "+(length*breadth));
		scanner.close();

	}

}
