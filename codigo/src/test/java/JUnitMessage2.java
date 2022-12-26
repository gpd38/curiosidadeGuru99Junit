public class JUnitMessage2 {

	private String message;
	private int divide;

	public JUnitMessage2(String message) {
		this.message = message;
	}

	public void printMessage() {

		System.out.println(message);
		divide = 1 / 0;

	}

	public String printHiMessage() {

		message = "Hi!" + message;

		System.out.println(message);

		return message;
	}

}