package main.model;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JLabel;

public class toDoList implements Loadable, Saveable{
	public static int currentMonth;
	public static int currentDate;
	public static HashMap <Integer, Event> eventMap = new HashMap<>();
	public static HashMap <Integer, Event> urgentEventMap = new HashMap<>();
	public Event[] eventlist;
	public toDoList(int n) {
		eventlist = new Event[n];
	}
	//Modifies: msg
	//Effects: get the string of the eventList to print on the new panel
	public static String printEventList(Map a, int num) {
		int count = 1;
		String msg="";
		//System.out.println("Number Name Type Month Day Completed?");
		for(int i=1;i<=num;i++) {
			if(a.get(i)!=null) {
				msg+="Event "+count+": \r\n";
				count++;
				Event e = (Event) a.get(i);
				msg+=e.toString();
			}
		}
		msg+="\r\n";
		return msg;
	} 
	//Requires: type in the matched data type for each attributes in Event
	//Modifies: eventList
	//Effects: assign the value to each 
	public static Event[] createEventList(int n) throws DueDayPassedException {
		Scanner in = new Scanner(System.in);
		Event []eventList= new Event[n];
		for(int i=0;i<n;i++) {
			Event x;
			System.out.println("Event number "+(i+1)+":");
			System.out.println("Highlight Event? (yes/no)");
			String s = in.next();
			while(!(s.equalsIgnoreCase("yes")||s.equalsIgnoreCase("no"))) {
				System.out.println("Please enter 'yes' or 'no'");
				s = in.next();
			}
			if(s.equals("yes")) {
				System.out.println("Urgent Event? (yes/no)");
				s = in.next();
				if(s.equals("yes"))
					x = new UrgentEvent();
				else
					x = new ImportantEvent();
			}
			else 
				x = new RegularEvent();
			System.out.println("Event name:");
			String name = in.next();
			x.setName(name);
			
			System.out.println("Event type:");
			String type = in.next();
			x.setType(type);
			
			System.out.println("Due month:");
			int month = in.nextInt();
			x.setDueMonth(month);
			
			System.out.println("Due day:");
			int day = in.nextInt();
			x.setDueDay(day);
		
			if(x.getDueMonth()<currentMonth||(x.getDueMonth()==currentMonth&&x.getDueDay()<currentDate)) {
				throw new DueDayPassedException();
			}
			
			if(x instanceof UrgentEvent)
				((UrgentEvent) x).setDaysRemain(currentDate, currentMonth,day, month);
			for(int j = 0;j<i;j++)
				if(eventList[j].equals(x))
					System.out.println("Warning: A similar event exist in the list.");
			eventList[i] = x;
			eventMap.put(i+1,x);
			System.out.println("The event is created successfully.");
			if(x instanceof UrgentEvent)
				urgentEventMap.put(i+1, x);
		}
		return eventList;
	}
	
	public static void save(String msg) throws Exception {
		String[] a = ReadFile.read();
		String [] b = msg.split("\r\n");
		String []c= new String[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[i-a.length];
		}
		//System.out.println(c.length);
		WriteFile.write(c);
	}
	
	public static String[] load() throws IOException {
		String[] a = ReadFile.read();
		return a;
	}
	
}
