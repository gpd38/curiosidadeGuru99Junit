import org.testng.annotations.Test;

public class AirthematicTest1 {

	public String message = "Saurabh";

	JUnitMessage2 junitMessage = new JUnitMessage2(message);

	@Test
	public void testJUnitMessage() {

		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();

	}

	@Test
	public void testJUnitHiMessage() {
		message = "Hi!" + message;
		System.out.println("Junit Message is printing ");
		// assertEquals(message, junitMessage.printMessage());

	}
}