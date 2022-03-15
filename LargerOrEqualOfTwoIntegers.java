/*6)Write an application that asks the user to enter two integers, obtains them from the user and
 displays the larger number followed by the words “is larger”. If the numbers are equal, print 
“These numbers are equal” */
package pfa.java.assignments;
import java.util.Scanner;

public class LargerOrEqualOfTwoIntegers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num1 = obj.nextInt();
		System.out.println("Enter another Number:");
		int num2 = obj.nextInt();
		Comparison(num1,num2);
		
	}
	public static void Comparison(int num1,int num2) {
		if(num1 == num2) {
			System.out.println(+num1 +","+num2 + "These numbers are equal");
		}
		else if(num1 > num2) {
			System.out.println(+num1 +" "+"is Larger");
		}
		else {
			System.out.println(+num2 +" "+"is Larger");
		}
		
	}

}
