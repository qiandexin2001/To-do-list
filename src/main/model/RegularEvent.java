package main.model;

public class RegularEvent extends Event{
	private String name;
	private String type;
	private int dueMonth;
	private int dueDay;
	private boolean isCompleted;
	public RegularEvent() {
		this.name = "no name";
		this.type = "no type";
		this.dueMonth = 1;
		this.dueDay = 1;
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
	public String toString() {
		String msg = "";
		msg+="Name: "+getName()+"\r\n";
		msg+="Type: "+getType()+"\r\n";
		msg+="Due month: "+getDueMonth()+"\r\n";
		msg+="Due day: "+getDueDay()+"\r\n";
		if(isCompleted()) {
			msg+="Done\r\n";
		}
		else
			msg += "Not done\r\n";
		msg += "Not urgent\r\n";
		return msg;
	}
}
