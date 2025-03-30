/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

/**
 * Root class (abstract) that represents a term.
 */
abstract class Term {

    /**
     * Abstract methods that evaluates the current Term
     * @param context that contains the variable bindings
     * @return the value of the evaluated Term
     */
    abstract fun eval(context: Context) : Double
}