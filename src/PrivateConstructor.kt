class DontCreateMe private constructor(val name: String) {
    var fieldEmpty: String? = null

    init {
        name.also { println("Init block DontCreate $name") }
    }

    constructor(name: String, lastName: String?) : this(name) {
        this.fieldEmpty = lastName.also {
            println("Constructor DontCreate $name fieldEmpty = $lastName")
        }
    }

}