import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class MyFirstClassTest {

	@Test
	public void myFirstMethod() {
		String str = "JUnit is working fine";
		assertEquals("JUnit is working fine", str);
	}
}