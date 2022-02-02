fun main() {
    val age: Int = 26
    if (age < 18) {
        println("you cannot register")
    } else if (age < 21) {
        println("Well, maybe you can register")
    } else if (age < 27) {
        println("You should be able to register")
    } else {
        println("You're good to go!")
    }
}