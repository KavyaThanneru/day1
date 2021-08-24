package question4;
import java.util.Scanner;

public class CharacterInput 
   {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Chracter");
		char ch = sc.next().charAt(0);
		System.out.println("The Character Is\n" +ch);
		
	}
	

}
