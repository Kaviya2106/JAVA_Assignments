/* 8) Write an application that reads two integers, determines whether the first is a multiple of the 
second and print the result. */
package pfa.java.assignments;
import java.util.Scanner;

public class MultiplesOf {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = obj.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = obj.nextInt();
		MultipleOrNot(num1,num2);

	}
public static void MultipleOrNot(int num1, int num2)
{
	if((num1 % num2)==0) {
		System.out.println(+num1+" "+"is a multiple of"+" "+num2);
	}
	else {
		System.out.println(+num1+" "+"is not a multiple of"+" "+num2);
	}
		
	}
	
}
