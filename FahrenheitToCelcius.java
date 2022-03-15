//3)Write a program that converts a Fahrenheit degree to Celsius
package pfa.java.assignments;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
	//C(degress)=((degress)F-32)*5/9
		float fahrenheit = 21;
		float celcius = FahToCel(fahrenheit);
		System.out.println("Fahrenheit:" +fahrenheit);
		System.out.println("Celcius:" +celcius);
	}
	public static float FahToCel(float fahrenheit)
	{
		float c;
		c = ((fahrenheit - 32)*5)/9;
		return c;
	}

}
