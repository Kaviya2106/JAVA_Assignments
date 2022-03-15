/*5)Write an application that asks the user to enter two integers, obtains them from the user and 
prints their sum, product, difference and quotient (division)*/

package pfa.java.assignments;
import java.util.Scanner;

public class ArithmeticOfTwoIntegers {
	
	public static void main (String args[]) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num1 = obj1.nextInt();
		System.out.println("Enter another Number:");
		int num2 = obj1.nextInt();
		Arithmetic(num1,num2);
		
}
	public static void Arithmetic(int num1,int num2) {
		int sum = num1 + num2;
		int sub = num1 - num2;
		System.out.println("Sum:" +sum);
		System.out.println("Product:"+num1* num2);
		System.out.println("Difference:"+sub); 
		System.out.println("Division:"+num1/ num2);
		
		
	}
}