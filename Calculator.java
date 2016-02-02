import java.util.Scanner;

public class Calculator {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int first = scan.nextInt();
		
		System.out.print("Enter the second number: ");
		int second = scan.nextInt();
		
		System.out.println(first + " + " + second + " = " + (first+second));
		
		System.out.println(first + " - " + second + " = " + (first-second));
		
		System.out.println(first + " * " + second + " = " + (first*second));
		
		System.out.println(first + " / " + second + " = " + (first/second));
		
		System.out.println("Sqrt of first number = " + (Math.sqrt(first)));
		
		System.out.println("2 to the power of " + second + " = " + Math.pow(2,second));
	}
}
