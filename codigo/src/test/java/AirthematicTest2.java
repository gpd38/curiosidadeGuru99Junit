import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AirthematicTest2 {

	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private AirthematicTest2 airthematic;

	public AirthematicTest2(int a, int b, int c) {
		super();
		firstNumber = a;
		secondNumber = b;
		expectedResult = c;
	}

	@Before
	public void initialize() {
		airthematic = new AirthematicTest2(0,0,0);
	}

	@Parameterized.Parameters
	public static Collection input() {
		return (Arrays.asList(
				new Object[][] { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 }, { 10, 9, 19 }, { 100, 9, 109 } }));
	}

	@Test
	public void testAirthematicTest() {
		System.out.println("Sun of number = : " + expectedResult);
		assertEquals(expectedResult, airthematic.sum(firstNumber, secondNumber));
	}

	private Integer sum(int firstNumber2, int secondNumber2) {
		return (firstNumber2 + secondNumber2);
	}

}