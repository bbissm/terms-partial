/* Exercise Terms, Programming with Kotlin 2 */
package ch.bfh.ti.p2k.exercises.terms

/**
 * Context stores the bindings of a variable name with its value (name, value) in a lookup table.
 */
class Context {
    private val lookupTable = mutableMapOf<String, Double>()
    /**
     * Binds a value to a variable name. If the variable name is already bound then the new binding
     * replaces the old one.
     * If the variable name is blank a CanNotBeBlankException is thrown.
     *
     * @param name of the variable
     * @param value of the variable
     * @throws CanNotBeBlankException when name is empty or blank
     */
    fun bind(name: String, value: Double) {
        if (name.isBlank()) throw CanNotBeBlankException("var name cannot be blank.")
        lookupTable[name] = value
    }
    /**
     * Returns the value of a bound variable name or throw an exception if get returns null.
     *
     * @param name of the variable
     * @return the value associated to name
     * @throws CanNotBeBlankException whenever name is empty or blank
     * @throws NotBoundException when name is not bound to a value
     */
    fun getValue(name: String): Double {
        if (name.isBlank()) throw CanNotBeBlankException("var name cannot be blank.")
        return lookupTable[name] ?: throw NotBoundException("var '$name' not bound to any value.")
    }
}
