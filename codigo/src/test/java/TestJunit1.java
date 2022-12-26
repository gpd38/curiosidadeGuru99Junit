import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestJunit1 {
	@Test
	public void testSetup() {
		String str = "I am done with Junit setup";
		assertEquals("I am done with Junit setup", str);
	}
}