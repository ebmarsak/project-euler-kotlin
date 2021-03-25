/*
    -- Problem 4 --

        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.


*/

fun getPalindrome(number: Int) : IntArray{
    var palindromeArray: IntArray = intArrayOf()

    for (num1 in 1..number) {
        for (num2 in 1..number) {
            val possiblePalindrome: Int = num1 * num2
            if (isPalindrome(possiblePalindrome)) {
                palindromeArray += possiblePalindrome
            }
        }
    }
    return palindromeArray
}


fun isPalindrome(number: Int): Boolean {

    var reversedInteger = 0
    var remainder: Int
    var n = number
    val originalInteger: Int = n

    while (n != 0) {
        remainder = n % 10
        reversedInteger = reversedInteger * 10 + remainder
        n /= 10
    }

    return (originalInteger == reversedInteger)
}

fun main() {
    println("Largest palindrome within range: ${getPalindrome(999).maxOrNull()}")
    println("Number of palindromes within range: ${getPalindrome(999).size}")
}