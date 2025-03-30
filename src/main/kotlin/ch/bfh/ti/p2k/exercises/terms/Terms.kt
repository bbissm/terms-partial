/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

import ch.bfh.ti.p2k.exercises.terms.BinaryOperator.*
import ch.bfh.ti.p2k.exercises.terms.UnaryOperator.*

/**
 * Main function that illustrates the behavior of the eval function over the various classes.
 *
 * The term (3.0 + -d) * 5.0 where d = 7.0 is created and then evaluated.
 */
fun main() {

    // creation of an empty context
    val context = Context()

    // creation of the "d" variable
    val d = Variable("d")
    // bounds the variable name "d" with 7.0
    context.bind("d", 7.0)
    // evaluation of the variable "d"
    println(d.eval(context))

    // creation of the unary expression -d
    val minusD = UnaryExpression(MINUS, d)
    // evaluation of the unary expression
    println(minusD.eval(context))

    // creation of the 3.0 constant
    val three = Constant(3.0)
    // creation of the binary expression (3.0 + -d)
    val addExpr = BinaryExpression(ADD, three, minusD)

    // creation of the 5.0 constant
    val five = Constant(5.0)
    // creation of the whole expression
    val wholeExpr = BinaryExpression(MUL, addExpr, five)

    println(wholeExpr.eval(context))
}
