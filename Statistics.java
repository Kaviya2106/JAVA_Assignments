/*7)Write an application that inputs three integers from the user and displays the sum, average, 
product, smallest and largest of the numbers. */
package pfa.java.assignments;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = obj.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = obj.nextInt();
		System.out.println("Enter Third Number:");
		int num3 = obj.nextInt();
		Stats(num1,num2,num3);

	}
    public static void Stats(int num1,int num2,int num3){
    	int n = 3;
    	int sum = num1 + num2;
    	int avg = sum/n;
    	int large = (num1 > num2)?num1 : num2; //Using Ternary operator
    	int largest = (num3 > large)?num3 : large;
    	int smallest = (num2 < num1)?num2 : num1;
    	System.out.println("Product:" +num1*num2);
    	System.out.println("Sum:" +sum);
		System.out.println("Average:"+avg);
		System.out.println("Largest:"+largest); 
		System.out.println("Smallest:"+smallest);
    	
    }
}
