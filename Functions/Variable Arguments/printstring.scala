object Demo {
    def main(args: Array[String]){
        printString("Hello", "Scala", "Python");
    }

    def printString(args: String*){
        var i: Int = 0

        for(arg <- args) {
           println("Arg value[" + i + "] = " + arg)
           i += 1
        }
    }
}