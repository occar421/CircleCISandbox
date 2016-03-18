package net.masuqat.knit_codecov

class Arithmetic {
	companion object {
		infix fun Int.p(another: Int) = "${this + another}"
		infix fun Int.p(another: Variable) = "$another + $this"
		infix fun Variable.p(another: Int) = "$this + $another"
		infix fun Variable.p(another: Variable) = when {
			priority > another.priority -> "$this + $another"
			priority == another.priority -> "2$this"
			priority < another.priority -> "$another + $this"
			else -> ""
		}

		abstract class Variable(val priority: Int)

		val x = object : Variable(3) {
			override fun toString(): String = "x"
		}

		val y = object : Variable(3) {
			override fun toString(): String = "y"
		}

		val z = object : Variable(3) {
			override fun toString(): String = "z"
		}
	}
}