package main.model;

import java.util.Scanner;

import main.ui.Main;

public class Remove {
	public static void remove() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("How many events to cross out?");
		int n = in.nextInt();
		System.out.print("Enter the event number: ");
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			toDoList.eventMap.remove(x);
			toDoList.urgentEventMap.remove(x);
		}
		//WriteFile.write(toDoList.printEventList(toDoList.eventMap,Main.eventNum)+"Urgent Events: \n\r"+toDoList.printEventList(toDoList.urgentEventMap,Main.eventNum));
	}
}
