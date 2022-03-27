package bot

import java.util.Scanner

const val CORRECT_ANSWER: Int = 3

val scanner = Scanner(System.`in`)

/*
 * Simple Chatty Bot
 */
fun main() {
    greet("Arthas", "2022")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use loops?")
    println("1. To determine the execution time of a program.")
    println("2. To interrupt the execution of a program.")
    println("3. To repeat a statement multiple times.")
    println("4. To decompose a program into several small subroutines.")

    var answer: Int = scanner.nextInt()

    while (answer != CORRECT_ANSWER) {
        println("Please, try again")

        answer = scanner.nextInt()
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}
