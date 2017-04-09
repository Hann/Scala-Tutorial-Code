object Demo {
    def main(args: Array[String]){
        val alice = new Person("Alice", 25)
        val bob = new Person("Bob", 32)
        val charlie = new Person("Charlie", 32)

        for (person <- List(alice, bob, charlie)){
            person match {
                case Person("Alice", 25) => println("Hi Alice!")
                case Person("Bob", 32) => println("Hi Bob!")
                case Person(name, age) => println(person) // toString이 자동으로 구현된대서 해본 테스트
            }
        }
    }
    case class Person(name: String, age: Int)
}