import java.lang.*;

class Time {

	private int second;
	private int minute; // private data members
	private int hour;

	Time() {

	}

	public int getSecond() {
		return second; // returns current second;
	}

	public void setSecond(int second) {
		this.second = second; // sets current second
	}

	public int getMinute() {
		return minute; // returns current second;
	}

	public void setMinute(int minute) {
		this.minute = minute; // sets current minute
	}

	public int getHour() {
		return hour; // returns current second;
	}

	public void setHour(int hour) {
		this.hour = hour; // sets current hour
	}

	public String toString() {
		System.out.println(hour + ":" + minute + ":" + second); // prints the
																// output
		return "";

	}

	public int hourmanage(int hour2) {
		if (hour2 > 12) {
			hour2 = hour2 - 12;
			hourmanage(hour2); // keep hour in 12hr format

		}
		return hour2;
	}

	public int minutemanage(int minute2) {
		if (minute2 > 59) {
			hour++;
			minute2 = minute2 - 60; // don't let minute exceed 60
			minutemanage(minute2);
		}
		return minute2;
	}

	public int secondmanage(int second2) {
		if (second2 > 59) {
			minute++; // don't let second exceed 60
			second2 = second2 - 60;
			secondmanage(second2);
		}
		return second2;
	}

	public void setTime(int second1, int minute1, int hour1) {
		
		
		
		hour = hourmanage(hour1);
		minute = minutemanage(minute1); // sets complete Time
		second = secondmanage(second1);
	}

	public Time nextSecond() {

		second++;
		second=secondmanage(second); // sets time to next second
		minute=minutemanage(minute);
		hour=hourmanage(hour);
		return this;
	}

}

public class Times {
	public static void main(String[] args) {
		Time a = new Time();
		a.setTime(59,59,23);
		a.toString(); // output
		a.nextSecond().nextSecond().nextSecond(); // next second
		a.toString(); // output

	}

}
