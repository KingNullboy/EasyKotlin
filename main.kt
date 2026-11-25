package EasyKotlin

fun clear() {
	ProcessBuilder("clear").inheritIO().start().waitFor()
}

fun sleep(ms: Long) {
	Thread.sleep(ms)
}

fun input(que: String): String {
	print(que)
	return readln()
}