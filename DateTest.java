/* 16)Create a class called Date that includes three pieces of information as instance variables—a month (typeint), 
 * a day (typeint) and a year (typeint). Your class should have a constructor that initializes the three instance variables and assumes that the values provided are
 correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year 
 separated by forward slashes(/). Write a test application named DateTest that demonstrates classDate’s capabilities. */

package pfa.java.assignments;
public class DateTest {
	class Date{
		int Month,Day,Year;
		Date(int m,int d,int y){
			Month = m;
			Day = d;
			Year = y;
		}
void setMonth(int m) {
	Month = m;
}
int getMonth() {
	return Month;
}
void setDay(int d) {
	Day = d;
}
int getDay() {
	return Day;
}
void setYear(int y) {
	Year = y;
}
int getYear() {
	return Year;
}
public void DisplayDate() {
	System.out.println("Date:"+getMonth() + "/" + getDay() + "/"+getYear());
}
	}

	public static void main(String[] args) {
		DateTest D = new DateTest();
		Date d = D.new Date(6,21,2000);
		d.DisplayDate();
		

	}

}
