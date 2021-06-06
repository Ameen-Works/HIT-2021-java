package basics;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the year: ");
		year=y.nextInt();
		y.close();
		boolean isleap=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					isleap=true;
				else
					isleap=false;		
			}
			else
				isleap=true;
		}
		else {
			isleap=false;
	}
		if(isleap==true)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");

	}

}
