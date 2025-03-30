/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.termsTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import ch.bfh.ti.p2k.exercises.terms.*

class VariableTest {
    val delta = 0.00001
    val context = Context()

    /**
     * Checks if the name is blank (empty or blank) while creating (three asserts)
     */
    @Test
    internal fun emptyBlankNameCreating() {
        assertThrows(CanNotBeBlankException::class.java) {Variable("")}
        assertThrows(CanNotBeBlankException::class.java) {Variable(" ")}
        assertThrows(CanNotBeBlankException::class.java) {Variable("   ")}
    }

    @Test
    internal fun createWithBinding() {
        val value = 23.6
        val name = "variable"
        val variable = Variable(name, value, context)
        assertEquals(value, variable.eval(context), delta, "Wrong variable evaluation")
    }

    /**
     * Checks if eval works as required
     */
    @Test
    internal fun bindingEval() {
        val value = 23.6
        val name = "variable"
        val variable = Variable(name)
        context.bind(name, value)
        assertEquals(value, variable.eval(context), delta, "Wrong variable evaluation")
    }
}