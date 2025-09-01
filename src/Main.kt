//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    InitOrderDemo(Person("leo", "pereyra"))
    val person = PersonConstructor(name = "Leo")
    val person2 = PersonConstructor(name = "Leo", lastName = "Pereyra")
    println("Persona 1 name ${person.name}, age = ${person.age},lastName = ${person.lastName}")
    println("Persona 2 name ${person2.name}, lastname ${person2.lastName}")

}