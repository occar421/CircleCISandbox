import com.taroid.knit.*
import org.junit.Test

import net.masuqat.knit_codecov.*

class KnitTest {
	@Test
	fun `x plus x is "2x"`() = Arithmetic.run {
		(x p x).should be "2x"
	}
}