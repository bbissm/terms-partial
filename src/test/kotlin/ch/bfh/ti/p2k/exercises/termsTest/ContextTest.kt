/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.termsTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import ch.bfh.ti.p2k.exercises.terms.*

class ContextTest {
    val delta = 0.00001
    val context = Context()

    /**
     * Checks if binding is
     */
    @Test
    internal fun binding() {
        val value = 23.6;
        val name = "name"
        context.bind(name, value)

        assertEquals(value, context.getValue(name), delta, "Wrong Binding");
    }

    /**
     * Checks if the name is blank (empty or blank) while binding (three asserts)
     */
    @Test
    internal fun emptyBlankNameBinding() {
        val value = 23.6;
        assertThrows(CanNotBeBlankException::class.java) { context.bind("", value) }
        assertThrows(CanNotBeBlankException::class.java) { context.bind(" ", value) }
        assertThrows(CanNotBeBlankException::class.java) { context.bind("   ", value) }
    }

    /**
     * Checks if the name is blank (empty or blank) while getting value (three asserts)
     */
    @Test
    internal fun emptyBlankNameGetValue() {
        assertThrows(CanNotBeBlankException::class.java) { context.getValue("") }
        assertThrows(CanNotBeBlankException::class.java) { context.getValue(" ") }
        assertThrows(CanNotBeBlankException::class.java) { context.getValue("   ") }
    }

}
