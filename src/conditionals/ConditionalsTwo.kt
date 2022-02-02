fun main() {
    val mode: Int = 5

    when (mode) {
        1 -> println("the mode is lazy")
        2 -> {
            println("the mode is 2")
            println("so de mode is busy")
        }
        3 -> println("the mode is super productive")
        else -> println("I dont know this mode")

    }
}