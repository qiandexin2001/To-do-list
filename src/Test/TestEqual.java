package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.model.Event;
import main.model.RegularEvent;

public class TestEqual {
	private Event a = new RegularEvent();
	private Event b = new RegularEvent();
	@Before
	public void setup() {
		a.setDueDay(1);
		a.setDueMonth(31);
		a.setName("hw1");
		a.setType("sb");
		b.setDueDay(1);
		b.setDueMonth(31);
		b.setName("hw1");
		b.setType("sb");
	}
	@Test
	public void testEqual() {
		assertTrue(a.equals(b));
	}
}
