package Test;

import main.model.*;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestWriteFile {
	private String s[];
	@Before
	public void setUp() throws Exception {
		s=ReadFile.read();
	}
	@Test
	public void testWriteFile() throws Exception {
		WriteFile.write(s);
		String a[] = ReadFile.read();
		assertTrue(a[0].equals(s[0]));
		assertTrue(a[1].equals(s[1]));
	}
}
