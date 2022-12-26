import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class JunitTestExample4 {

	public String message = "Guru99";

	JUnitMessage1 junitMessage = new JUnitMessage1(message);

	@Test
	public void testJUnitMessage() {

		System.out.println("Junit Message is printing ");
		assertEquals(message, junitMessage.printMessage());

	}

	@Test
	public void testJUnitHiMessage() {
		message = "Hi!" + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, junitMessage.printHiMessage());

	}
}