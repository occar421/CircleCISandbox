import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
	@Test
	public void Value() {
		Hello h = new Hello();
		Assert.assertEquals(h.Run(), 1);
	}
}
