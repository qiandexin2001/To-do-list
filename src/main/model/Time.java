package main.model;

public class Time {
	public static int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31}; 
	public static int daysLeft(int day, int month, int nday, int nmonth) {
			int result = 0;
			for(int i=month;i<nmonth;i++) {
				result += monthDays[i];
			}
			return result;
	}
}
