package basics;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=120, second=220;
		System.out.println("---Before Swap---");
		System.out.println("First number is: "+first);
		System.out.println("Second number is: "+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("---After Swap---");
		System.out.println("First number is: "+first);
		System.out.println("Second number is: "+second);

	}

}
