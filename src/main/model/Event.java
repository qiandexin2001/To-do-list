package main.model;

public abstract class Event{
	private String name;
	private String type;
	private int dueMonth;
	private int dueDay;
	private boolean isCompleted;
	public Event() {
		this.name = "no name";
		this.type = "no type";
		this.dueMonth = 1;
		this.dueDay = 1;
		this.isCompleted = false;
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
	//Modifies: this
	//Effects: return isCompleted status
	public abstract boolean isCompleted();
	//Requires: isCompleted
	//Modifies: this
	//Effects: set isCompleted in the data field to the given boolean value
	public abstract void setCompleted(boolean isCompleted);
	public String toString() {
		String msg = "";
		msg+="Name: "+getName()+"\r\n";
		msg+="Type: "+getType()+"\r\n";
		msg+="Due month: "+getDueMonth()+"\r\n";
		msg+="Due day: "+getDueDay()+"\r\n";
		return msg;
	}
	public boolean equals(Event e) {
		if((this.getDueDay()==e.getDueDay())&&(this.getDueMonth()==e.getDueMonth())&&(this.getName().equals(e.getName()))
				&&this.getType().equals(e.getType()))
			return true;
		else 
			return false;
	}
}
