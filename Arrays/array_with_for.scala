object Demo {
    def main(args: Array[String]){
        var myList = Array(1.9, 2.9, 3.4, 3.5)

        // 프린트 이건 for each로 돈다.
        for (x <- myList) {
            println(x)
        }

        var total: Double = 0
        // sum, 이건 index로 , 근데 length에 괄호가 안붙네..
        for (i <- 0 to (myList.length-1)) {
            total += myList(i) // array접근을 괄호로 하자 대괄호로 하지않음.
        }
        println("Total is " + total)

        var max = myList(0)

        for(i <- 0 to (myList.length-1)){
            if (myList(i) > max) max = myList(i)
        }

        println("Max is " + max)
    }
}