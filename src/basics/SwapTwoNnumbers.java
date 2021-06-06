package basics;

public class SwapTwoNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int First=120, Second=220;
		System.out.println("---Before Swap---");
		System.out.println("First number is; "+First);
		System.out.println("Second number is: "+Second);
		int temp=First;
		First=Second;
		Second=temp;
		System.out.println("---After Swap---");
		System.out.println("First number is: "+First);
		System.out.println("Second number is: "+Second);
	}

}
