/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

import ch.bfh.ti.p2k.exercises.terms.UnaryOperator.*

/**
 * A UnaryExpression is a Term composed of a single Term and a UnaryOperator.
 *
 * @property operator the unary operator
 * @property term is the sub-term of the unary expression
 */
class UnaryExpression(val operator: UnaryOperator, val term: Term) : Term() {
	// ADD YOUR CODE HERE
}

