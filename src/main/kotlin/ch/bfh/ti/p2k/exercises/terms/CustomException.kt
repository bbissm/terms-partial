/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

/**
 * Thrown when a variable name is empty or blank
 */
class CanNotBeBlankException(message:String) : Exception(message)

/**
 * Thrown when the value of a unbound variable is required
 */
class NotBoundException(message:String) : Exception(message)


