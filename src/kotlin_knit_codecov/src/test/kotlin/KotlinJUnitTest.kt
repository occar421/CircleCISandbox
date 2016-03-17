import org.junit.*
import kotlin.test.*

import net.masuqat.knit_codecov.*;

class KotlinJUnitTest {
	@Test
	fun `3 plus 4 is 7`() {
		assertEquals(3 p 4, "7")
	}

	@Test
	fun `y plus 5 is "y + 5"`() {
		assertEquals(y p 5, "y + 5")
	}
}