import org.junit.*;

import net.masuqat.knit_codecov.*;

public class JavaJUnitTest {
	@Test
	public void _2_plus_1_is_3() {
		Assert.assertEquals(Arithmetic.Companion.p(2, 1), "3");
	}
}
