/* 15)Create a class called Employee that includes three pieces of information as instance variables—a first name (typeString), 
 a last name (typeString) and a monthly salary (double). Your class should have a constructor that initializes the three instance 
 variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a 
 test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each 
 object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again. */

package pfa.java.assignments;
public class EmployeeTest {
class Employee {
//Instance variables
		String FirstName;
		String LastName;
		double Mon_Salary;
//Constructor
Employee(String fn,String ln,double ms){
	this.FirstName = fn;
	this.LastName = ln;
	 this.Mon_Salary = ms;
}
//Set and Get Methods for Each Instance variables
public void setFirstName(String FirstName) {
	this.FirstName =  FirstName;
}
public String getFirstName() {
	return FirstName;
}
public void setLastName(String LastName) {
	this.LastName =LastName;
}
public String getLastName() {
	return LastName;
}
public void setMon_Salary(double Mon_Salary) {
	this.Mon_Salary = Mon_Salary;
}
public double getMon_Salary() {
	return Mon_Salary;
}
//Method to Display YearlySalary
		public void YearSalary() {
			if (getMon_Salary() < 0) {
				setMon_Salary(0.0);
				System.out.println("Name:"+getFirstName() + " "+ getLastName());
				System.out.println("Yearly Salary:"+getMon_Salary());
			 }
			else {
				double year_salary = getMon_Salary() * 12;
				System.out.println("Name:"+getFirstName() + " "+ getLastName());
				System.out.println("Yearly Salary:" +year_salary);
		    }
		}
		
		public void AfterIncr() {
			double incr_amt =(getMon_Salary() * 10)/100; //Increment amount
			double tot_salary = incr_amt + getMon_Salary(); //Monthly salary
			System.out.println("Name:"+getFirstName() + " "+ getLastName());
			System.out.println("After 10% Raise !!Yearly Salary:" +tot_salary *12);//Yearly Salary
		}
		
}
public static void main(String[] args) {
	EmployeeTest obj = new EmployeeTest();
	Employee obj1 = obj.new Employee("Kaviya","R",21000);
	Employee obj2 = obj.new Employee("Yavika","R",30000);
	obj1.YearSalary();
	obj2.YearSalary();
	obj1.AfterIncr();
	obj2.AfterIncr();
	
}
}


