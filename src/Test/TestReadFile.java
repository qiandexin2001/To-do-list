package Test;

import main.model.*;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestReadFile {
	@Before
	public void setUp() throws Exception {
		String s[] = {"jiunimalipu","awsl"};
		WriteFile.write(s);
	}
	@Test
	public void testReadFile() throws IOException {
		String s[] = ReadFile.read();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		assertTrue(s[0].equals("jiunimalipu"));
		assertTrue(s[1].equals("awsl"));
	}
}
