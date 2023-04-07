package q9;

import java.util.Calendar;

class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	public Date(int day, int month, int year){
		this.day= day;
		this.month= month;
		this.year= year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDate(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid()
	{
		if(year<1 || year>9999)
			return false;
		
		if(month<1 || month>13)
			return false;
		if(day<1 || day>getDaysInMonth(month, year))
			return false;
		
		return true;
	}

	private int getDaysInMonth(int month, int year) {
		switch (month) {
		case 2:
			return isLeapYear(year)?29 : 28;
		case 4:
		case 6:
		case 8:
		case 10:
			return 31;
		default:
		    return 31;		
	}
}

public boolean isLeapYear(int year) {
	if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        }
        return true;
    }
    return false;
	}

// get Days of the Week
public int getDayOfWeek() {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);
    return cal.get(Calendar.DAY_OF_WEEK) - 1;
}

public String dayName(int n)
{
	switch(n)
	{
	case 0:
		return "Sunday";
	case 1:
		return "Monday";
	case 2:
		return "Tuesday";
	case 3:
		return "Wednesday";
	case 4:
		return "Thursday";
	case 5:
		return "Friday";
	case 6:
		return "Saturday";
	default:
		return"Nothing";
	}
}
public String getNextDay() {
    int nextDay = day + 1;
    int nextMonth = month;
    int nextYear = year;
    
    if (nextDay > getDaysInMonth(month, year)) {
        nextDay = 1;
        nextMonth++;
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
    }
    return toString(nextDay, nextMonth, nextYear);
}

public String getPreviousDay() {
    int previousDay = day - 1;
    int previousMonth = month;
    int previousYear = year;
    
    if (previousDay == 0) {
        previousMonth--;
        if (previousMonth == 0) {
            previousMonth = 12;
            previousYear--;
        }
        previousDay = getDaysInMonth(previousMonth, previousYear);
    }
    
    return toString(previousDay, previousMonth, previousYear);
}


public String toString(int day, int month, int year) {
	return "Date: day=" + day + ", month=" + month + ", year=" + year;
}

}

//main function
public class Ques9 {

	public static void main(String[] args) {
		Date date = new Date(17,02,1998);
		if(!date.isValid())
		{
			System.out.println("Enter the Valid Date");
			System.exit(0);
		}
		else {
			System.out.println("Enter Date is valid: "+ date.getDay()+":"+date.getMonth() + ":" + date.getYear());
		}
		System.out.println(date.dayName(date.getDayOfWeek()));
		System.out.println(date.isLeapYear(date.getYear())?"Leap Year": "Not a Leap Year");
		System.out.println(date.getNextDay());
		System.out.println(date.getPreviousDay());
	}
}