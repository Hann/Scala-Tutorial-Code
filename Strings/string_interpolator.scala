object Demo {
    def main(args: Array[String]) {
        var name = "James"

        // s뒤에 띄어쓰기 하면 안됨..
        // PHP에도 이런거 있음
        println(s"Hello, $name")
        println(s"1 + 1 = ${1 + 1}")
    }
}