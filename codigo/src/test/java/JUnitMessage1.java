public class JUnitMessage1 {

	private String message;

	public JUnitMessage1(String message) {
		this.message = message;
	}

	public String printMessage() {

		System.out.println(message);

		return message;
	}

	public String printHiMessage() {

		message = "Hi!" + message;

		System.out.println(message);

		return message;
	}

}