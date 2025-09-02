/**
 * This is used when an object's creation logic is complex and you want to abstract away the construction details.
 * Instead of a public constructor, you provide a public 'factory method' that handles the object's creation
 * and returns the new instance.
 * A private constructor ensures that consumers of the class must use this factory method.
 */
class User private constructor(val name: String, val email: String) {

    companion object {
        fun createWithEmail(name: String, email: String): User {
            if (!email.contains("@")) {
                throw IllegalArgumentException("Invalid email format")
            }
            return User(name, email)
        }
    }

    override fun toString(): String {
        return "user(name='$name', email='$email')"
    }
}