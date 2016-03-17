import org.junit.*;

import net.masuqat.knit_codecov.*;

public class JavaJUnitTest {
	@Test
	public void _2_plus_1_is_3() {
		Assert.assertEquals(ArithmeticKt.p(2, 1), "3");
	}

	@Test
	public void _y_plus_y_is_2y() {
		Assert.assertEquals(ArithmeticKt.p(y.INSTANCE, y.INSTANCE), "2y");
	}
}
