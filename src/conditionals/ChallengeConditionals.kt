import kotlin.random.Random

fun main() {
    val random = Random.nextInt(50) + 1

    when (random) {
        in 1..10 -> println("is in range from 1 to 10: $random")
        in 11..20 -> println("is in range from 11 to 20: $random")
        in 21..30 -> println("is in range from 21 to 30: $random")
        in 31..40 -> println("is in range from 31 to 40: $random")
        else -> println("is over 40: $random")
    }
}