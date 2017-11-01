import java.util.*;

class Date {

	private int year, month, day;				//Private data members

	Date() {

	}

	public int getYear() {
		return year;							//returns current year 
	}

	public void setYear(int year) {					
		this.year = year;						//set current year
	}

	public int getMonth() {
		return month;							//return current month
	}

	public void setMonth(int month) {
		this.month = month;						//set current month
	}

	public int getDay() {
		return day;								//return current day
	}

	public void setDay(int day) {
		this.day = day;							//set current day
	}

	public String toString() {
												//Prints the output
		return String.format("%04d:%02d:%02d",year,month,day);
			
	}

	public void setDate(int year1, int month1, int day1) {
		if (day1 < 1 || day1 > 31 || month1 > 12 || month1 < 1 || year1 == 0) {

			System.out.println("not a valid date");

		} else {
			year = year1;
			month = month1;						//sets current date
			day = day1;
		}

	}
}

public class Dates {
	public static void main(String[] args) {
		Date a = new Date();
		System.out.println("Enter Date in the format : year:month:day ");
		Scanner b = new Scanner(System.in);		//data input stream
		int y = b.nextInt();
		int m = b.nextInt();
		int d = b.nextInt();
		a.setDate(y, m, d);						//setDate function calling
		System.out.println(a.toString());		//output

	}
}
