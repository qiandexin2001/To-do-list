package main.model;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void write(String[] msg) throws Exception{
		FileWriter out = new FileWriter("D:\\Internet.Downloads\\ToDoList\\data\\history.txt");
		for(int i=0;i<msg.length;i++) {
			out.write(msg[i]+"\r\n");
			//out.write("\r\n");
		}
		out.close();
	}
}
