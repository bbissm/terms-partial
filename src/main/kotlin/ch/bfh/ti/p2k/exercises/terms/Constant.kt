/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

/**
 * A Constant represents a value that cannot change.
 *
 * Evaluation of a constant does not depend on any context but context must be provided
 * because Constant inherits from Term.
 *
 * @property value of the constant
 */
class Constant(val value: Double) : Term() {
    override fun eval(context: Context): Double = value
}
