/**
 * The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor,
 * and some other things), and the class body surrounded by curly braces.
 * Both the header and the body are optional; if the class has no body, the curly braces can be omitted.
 */
class ClassDemo {
}

class Empty

/**
 * Constructor
 *
 */
data class Person(var firstName: String, var lastName: String) {
    lateinit var name: String

    init {
        name = "Name Full of ${firstName} ${lastName}"
    }
}

/**
 * Init
 */
class InitOrderDemo(person: Person) {
    val firstProperty = "First property: $person".also(::println)

    init {
        println("First initializer block that prints ${person.name}")
    }

    val secondProperty = "Second property: ${person.firstName}".also(::println)

    init {
        println("Second initializer block that prints ${person.name.length}")
    }
}