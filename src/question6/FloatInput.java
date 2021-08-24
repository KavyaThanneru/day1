package question6;
import java.util.Scanner;

public class FloatInput {
	public static void main(String[] args)
	{
		
		System.out.println("enter a number");
		float testFloat;
		Scanner sc = new Scanner(System.in);
		testFloat  = sc.nextFloat();
		System.out.printf("%.2f\n",testFloat);
	}

}
