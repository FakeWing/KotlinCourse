package loops

fun main() {

    var sum = 0

    for (i in 1..100) {
        sum = sum + i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    for (c in "Python") {
        if (c == 'o') {
            break
        }
        print(c)
    }


    // imprimir los elementos que contienen "o" en la lista
    val lista = listOf("Book", "Table", "Laptop")

    for (str in lista) {
        if (!str.contains('o')) {
            continue
        }
        //calculations
        println(str)
    }


    // un loop con nombre

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }


    }

}