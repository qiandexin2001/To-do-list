package main.model;

import java.util.ArrayList;

public abstract class HighlightEvent extends Event{
	private String name;
	private String type;
	private int dueMonth;
	private int dueDay;
	private boolean isCompleted;

	
	public HighlightEvent() {
	}
	//requires: name, type, dueMonth, dueDay, isCompleted
	//modifies: this
	//effects: set the data fields
	public HighlightEvent(String name, String type, int dueMonth, int dueDay, boolean isCompleted) {
	}
	//Effects: return name
	public abstract String getName();
	//Modifies: this
	//Effects: set name into a given string
	public abstract void setName(String name);
	//Effects: return type
	public abstract String getType();
	//Requires: a string type
	//Modifies: this
	//Effects: set type into hw ex or job
	public abstract void setType(String type);
	//Effects: return dueMonth 
	public abstract int getDueMonth();
	//Requires: dueMonth(any integer)
	//Modifies: this
	//Effect: change dueMonth into 1 to 12
	public abstract void setDueMonth(int dueMonth);
	//Effects: return dueDay
	public abstract int getDueDay();
	//Requires: dueDay(any integer)
	//Modifies: this
	//Effects: set due day into 1 to 31
	public abstract void setDueDay(int dueDay);
	public abstract boolean isCompleted();
	public abstract void setCompleted(boolean isCompleted);
	public String toString() {
		return "Highlighted"+"\r\n"+super.toString();
	}
}
