/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.termsTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import ch.bfh.ti.p2k.exercises.terms.*

class ConstantTest {
    val delta = 0.00001
    val context = Context()

    /**
     * Checks creation and evaluation of a constant
     */
    @Test
    internal fun constantPositive() {
        val value = 5.5
        val constant = Constant(value)

        assertEquals(value, constant.eval(context), delta, "Constant positive");
    }

    @Test
    internal fun constantNegative() {
        val value = -3.14
        val constant = Constant(value)

        assertEquals(value, constant.eval(context), delta, "Constant negative");
    }

    @Test
    internal fun constantZero() {
        val value = 0.0
        val constant = Constant(value)

        assertEquals(value, constant.eval(context), delta, "Constant zero");
    }

}