/**
 * You can have a primary constructor and secondary ones.
 * Attributes are used inside the class, which can then be initialized in the init block,
 * and values are assigned to them in the secondary constructor.
 */
class PersonConstructor(val name: String) {
    var age: Int? = null
    var lastName: String? = null

    init {
        println("Init block ${javaClass.name}")
        age = 0.also {
            println("Init age $it")
        }
        lastName = "No Last Name".also {
            println("Init lastName $it")
        }
    }

    constructor(name: String, lastName: String) : this(name) {
        this.lastName = lastName
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age , las)"
    }
}
