package main.ui;

import main.model.*;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static int eventNum;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws Exception {	
		System.out.println("-----------------------");
		System.out.println("   (1) Add    ");
		System.out.println("   (2) History    ");
		System.out.println("   (3) Remove    ");
		System.out.println("   (4) Exit    ");
		System.out.println("-----------------------");
		boolean flag = true;
		while(flag) {
			System.out.println("* Choose an item from the menu: ");
			int item;
			try {
				item = in.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("(x) wrong choice.");
				in.next();
				continue;
			}
			if(item<1||item>4) 
				System.out.println("(x) wrong choice.");
			else {
				if(item==1) {
					add();
				}
				if(item==2) {
					String []s = toDoList.load();
					for(int i=0;i<s.length;i++) {
						System.out.println(s[i]);
					}
				}
				if(item==3) {
					System.out.println("How many events to cross out?");
					int n = in.nextInt();
					System.out.print("Enter the event number: ");
					for(int i=0;i<n;i++) {
						int x = in.nextInt();
						toDoList.eventMap.remove(x);
						toDoList.urgentEventMap.remove(x);
					}
					String[] msg = {};
					WriteFile.write(msg);
					toDoList.save(toDoList.printEventList(toDoList.eventMap,eventNum)+"Urgent Events: \n\r"+toDoList.printEventList(toDoList.urgentEventMap,eventNum));
				}
				if(item==4) {
					System.out.println("Good bye!!");
					flag = false;
				}
			}
		}
	}
	public static void add() throws Exception {
		System.out.println("current day?");
		toDoList.currentDate = in.nextInt();
		System.out.println("current month?");
		toDoList.currentMonth = in.nextInt();
		try {
		System.out.println("How many events do you want to create?");
		eventNum = in.nextInt();
		Event mainList[] = new Event[eventNum];
		System.arraycopy(toDoList.createEventList(eventNum), 0, mainList, 0, eventNum);
		toDoList.save(toDoList.printEventList(toDoList.eventMap,eventNum)+"Urgent Events: \n\r"+toDoList.printEventList(toDoList.urgentEventMap,eventNum));		
		}
		catch(DueDayPassedException e) {
			System.out.println("Due day has passed.");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
			File file = new File("D:\\Internet.Downloads\\ToDoList\\data\\history.txt");
		}
	}
}
