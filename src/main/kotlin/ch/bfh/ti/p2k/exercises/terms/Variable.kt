/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

/**
 * A Variable is identified by a name. The value bounded with its name is stored in a Context object.
 *
 * Primary constructor: creation without binding
 * Secondary constructor: creation with binding
 *
 * @see ch.bfh.ti.p2k.exercises.terms.Context
 * @property name of the variable (neither blank nor empty)
 * @throws CanNotBeBlankException whenever the variable name is empty or blank
 */
class Variable(val name: String) : Term () {

	// ADD YOUR CODE HERE
}
