package Test;

import main.model.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class TestDueDayException {
	@Before
	public void setup() {
		toDoList.currentDate=3;
		toDoList.currentMonth=3;
		Event mainList[] = new Event[1];
	}
	@Test
	public void testEvent() {
		//System.out.println(e.getDueDay());
		try {
			System.out.println(toDoList.createEventList(1));
			assertEquals(0,1);
		}catch(DueDayPassedException e){
			assertEquals(0,0);
		}
	}
}
