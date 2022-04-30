package Test;

import main.model.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class TestEvent {
	private Event e = new RegularEvent();
	@Before
	public void setup() {
		e.setDueDay(1);
		e.setDueMonth(31);
		e.setName("hw1");
		e.setType("sb");
	}
	@Test
	public void testEvent() {
		//System.out.println(e.getDueDay());
		assertEquals(1,e.getDueDay());
		assertEquals(12,e.getDueMonth());
		assertFalse(e.getType()=="sb");
	}
}
