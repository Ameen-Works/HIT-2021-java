package basics;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius: ");
		Scanner radius=new Scanner(System.in);
		double r=radius.nextDouble();
		System.out.println("Area: "+Math.PI*r*r);
		System.out.println("Circumference: "+2*Math.PI*r);
		radius.close();

	}

}
