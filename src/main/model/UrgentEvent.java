package main.model;

public class UrgentEvent extends HighlightEvent{
	private String name;
	private String type;
	private int dueMonth;
	private int dueDay;
	private int daysRemain;
	private boolean isCompleted;
	public  UrgentEvent() {
		this.name = "no name";
		this.type = "no type";
		this.dueMonth = 1;
		this.dueDay = 1;
		//this.daysRemain = Time.daysLeft(dueDay, dueMonth, toDoList.currentDate, toDoList.currentMonth);
		this.isCompleted = false;
	}
	//Effects: return name
	public String getName() {
		return name;
	}
	//Modifies: this
	//Effects: set name into a given string
	public void setName(String name) {
		this.name = name;
	}
	//Effects: return type
	public String getType() {
		return type;
	}
	//Requires: a string type
	//Modifies: this
	//Effects: set type into hw ex or job
	public void setType(String type) {
		if(type.equals("homework")||type.equals("other")||type.equals("job"))
			this.type = type;
		else
			this.type = "other";
	}
	//Effects: return dueMonth 
	public int getDueMonth() {
		return dueMonth;
	}
	//Requires: dueMonth(any integer)
	//Modifies: this
	//Effect: change dueMonth into 1 to 12
	public void setDueMonth(int dueMonth) {
		if(dueMonth<1) this.dueMonth=1;
		else if(dueMonth>12) this.dueMonth=12;
		else this.dueMonth = dueMonth;
	}
	//Effects: return dueDay
	public int getDueDay() {
		return dueDay;
	}
	//Requires: dueDay(any integer)
	//Modifies: this
	//Effects: set due day into 1 to 31
	public void setDueDay(int dueDay) {
		if(dueDay<1) this.dueDay =1;
		else if(dueDay>31) this.dueDay = 31;
		this.dueDay = dueDay;
	}
	//Modifies: this
	//Effects: return isCompleted status
	public boolean isCompleted() {
		return isCompleted;
	}
	//Requires: isCompleted
	//Modifies: this
	//Effects: set isCompleted in the data field to the given boolean value
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public void setDaysRemain(int dueDay, int dueMonth, int currentDate, int currentMonth) {
		this.daysRemain = Time.daysLeft(dueDay, dueMonth, currentDate, currentMonth);
	}
	public int getDaysRemain() {
		return this.daysRemain;
	}
	public String toString() {
		return super.toString()+"Urgent\r\n";
	}
	public boolean equals(UrgentEvent e) {
		if(this.dueDay==e.dueDay&&this.dueMonth==e.dueMonth&&this.name.equals(e.name)
				&&this.type.equals(e.type))
			return true;
		else return false;
	}
}
