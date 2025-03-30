/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.termsTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import ch.bfh.ti.p2k.exercises.terms.*
import ch.bfh.ti.p2k.exercises.terms.UnaryOperator.*

class UnaryExpressionTest {
    val delta = 0.00001
    val context = Context()

    @Test
    internal fun minusPositiveConstant() {
        val value = 5.5

        val constant = Constant(value)

        val unaryExpr = UnaryExpression(MINUS, constant)
        val result = unaryExpr.eval(context)

        assertEquals((-1)*value, result, delta, "Minus positive constant");
    }

    @Test
    internal fun minusNegativeConstant() {
        val value = -7.6

        val constant = Constant(value)

        val unaryExpr = UnaryExpression(MINUS, constant)
        val result = unaryExpr.eval(context)

        assertEquals((-1)*value, result, delta, "Minus neagtive constant");
    }


}
