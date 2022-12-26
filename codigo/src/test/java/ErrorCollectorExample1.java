import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample1 {
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void example() {
		collector.addError(new Throwable("There is an error in first line"));
		collector.addError(new Throwable("There is an error in second line"));
		//collector.checkThat(getResults(), not(containsString("here is an error")));
		// all lines of code will execute and at the end a combined failure will be
		// logged in.
	}
}