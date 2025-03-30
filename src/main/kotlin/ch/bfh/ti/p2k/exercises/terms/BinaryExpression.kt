/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

import ch.bfh.ti.p2k.exercises.terms.BinaryOperator.*

/**
 * A BinaryExpression is a Term composed of a left and right Term and a BinaryOperator.
 *
 * @property operator the binary operator
 * @property left term the two sub-terms of the binary expression
 * @property right term
 */
class BinaryExpression(val operator: BinaryOperator, val left: Term, val right: Term) : Term() {
	// ADD YOU CODE HERE
}
