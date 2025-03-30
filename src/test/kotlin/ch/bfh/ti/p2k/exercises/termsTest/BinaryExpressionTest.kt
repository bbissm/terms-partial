/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.termsTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import ch.bfh.ti.p2k.exercises.terms.*
import ch.bfh.ti.p2k.exercises.terms.BinaryOperator.*

class BinaryExpressionTest {
    val delta = 0.00001
    val context = Context()

    /**
     * Check for all the binary operations the case positive and négative
     */
    @Test
    internal fun additionPositive() {
        val value1 = 5.5
        val value2 = 4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(ADD, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 + value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun additionNegative() {
        val value1 = 5.5
        val value2 = -4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(ADD, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 + value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun substractionPositive() {
        val value1 = 5.5
        val value2 = 4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(SUB, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 - value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun substractionNegative() {
        val value1 = 5.5
        val value2 = -4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(SUB, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 - value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun multiplicationPositive() {
        val value1 = 5.5
        val value2 = 4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(MUL, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 * value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun multiplicationNegative() {
        val value1 = 5.5
        val value2 = -4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(MUL, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 * value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun divisionPositive() {
        val value1 = 5.5
        val value2 = 4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(DIV, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 / value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun divisionNegative() {
        val value1 = 5.5
        val value2 = -4.5

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(DIV, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 / value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun divisionZeroNum() { // 0
        val value1 = 0.0
        val value2 = 5.0

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(DIV, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 / value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun divisionNumZero() { // Infinity
        val value1 = 5.5
        val value2 = 0.0

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(DIV, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 / value2, result, delta, "Addition (binary expression)");
    }

    @Test
    internal fun divisionZeroZero() { // NaN (Not a Number)
        val value1 = 0.0
        val value2 = 0.0

        val constant1 = Constant(value1)
        val constant2 = Constant(value2)

        val binaryExpr = BinaryExpression(DIV, constant1, constant2)

        val result = binaryExpr.eval(context)

        assertEquals(value1 / value2, result, delta, "Addition (binary expression)");
    }
}