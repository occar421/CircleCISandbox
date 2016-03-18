package net.masuqat.knit_codecov

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

object x : Variable(3) {
	override fun toString() = "x"
}

object y : Variable(2) {
	override fun toString() = "y"
}

object z : Variable(1) {
	override fun toString() = "y"
}