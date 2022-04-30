package main.model;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadFile{
	public static String[] read() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("D:\\Internet.Downloads\\ToDoList\\data\\history.txt"));
		String s="";
		String a;
		int i = 0;
		while((a = in.readLine())!=null) {
			s+=a+"\r\n";
		}
		String [] result = s.split("\r\n");
		in.close();
		return result;
	}
}