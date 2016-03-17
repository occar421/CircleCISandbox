import com.taroid.knit.*
import org.junit.Test

import net.masuqat.knit_codecov.*

class KnitTest {
	@Test
	fun `1 plus 1 is "2"`() {
		(1 p 1).should be "2"
	}

	@Test
	fun `x plus 1 is "x + 1"`() {
		(x p 1).should be "x + 1"
	}


	@Test
	fun `1 plus x is "x + 1"`() {
		(1 p x).should be "x + 1"
	}

	@Test
	fun `x plus x is "2x"`() {
		(x p x).should be "2x"
	}

	@Test
	fun `x plus y is "x + y"`() {
		(x p y).should be "x + y"
	}

	@Test
	fun `y plus x is "x + y"`() {
		(y p x).should be "x + y"
	}
}