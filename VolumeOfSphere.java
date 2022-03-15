/*10) Write a complete Java application to prompt the user for the double radius of a sphere, and call 
method sphereVolume to calculate and display the volume of the sphere. */
package pfa.java.assignments;

public class VolumeOfSphere {

	public static void main(String[] args) {
		double radius = 21;
		double result = SphereVolume(radius);
		System.out.println("The volume of the sphere:"+result);
		
	}
	public static double SphereVolume(double radius) {
		// Volume of sphere = 4/3*pi*r^3 
		double volume = (((radius*radius*radius)*4)*22)/21; //pi value taken as 22/7
		return volume;
	}

}
