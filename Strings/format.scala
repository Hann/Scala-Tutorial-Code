object Demo {
    def main(args: Array[String]) {
        var floatVar = 12.456
        var intVar = 2000
        var stringVar = "Hello Scala"

        // concat이 먼저 되고 formatting이 된다.
        var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string " + "is %s", floatVar, intVar, stringVar)
    }
}