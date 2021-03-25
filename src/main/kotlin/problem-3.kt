/*
    -- Problem 3 --

        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?

*/

fun primeFactor(number: Long): Set<Long> {
    val primesSet: MutableSet<Long> =
        mutableSetOf() // Will be using a "Set" instead of an "Array". Set does not contain duplicate elements unlike an array.
    var divisor: Long =
        2 // Will be using primitive type "Long" instead of "Int". The number "600851475143" exceeds the limits of an "Int" can take up on memory.
    var m: Long = number

    while (divisor <= m) {
        if (m % divisor == 0L) { // Running a logic operation such as "==" we need both arguments to have the same type. "m % divisor" outputs as "Long", so the number "0" should be "Long" too.
            primesSet += divisor
            m /= divisor
        } else {
            divisor += 1
        }
    }

    return primesSet
}

fun main() {

    val placeholderSet: Set<Long> = primeFactor(600851475143)

    placeholderSet.distinct()
        .forEach { println("${placeholderSet.indexOf(it) + 1}. $it") } // Prints all the prime factors

    println("The largest prime factor is ${placeholderSet.maxOrNull().toString()}")

}
