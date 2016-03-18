import org.junit.*
import kotlin.test.*

import net.masuqat.knit_codecov.*;

class KotlinJUnitTest {
	@Test
	fun `y plus 5 is "y + 5"`() = Arithmetic.run {
		assertEquals(y p 5, "y + 5")
	}
}