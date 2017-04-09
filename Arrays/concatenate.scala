import Array._

object Demo {
    def main(args: Array[String]){
        var myList1 = Array(1.8, 2.9, 3.4, 3.5)
        var myList2 = Array(8.9, 7.9, 0.4, 1.5)

        var myList3 = concat(myList1, myList2)

        //그냥 쭉이어서 합쳐지네
        for (x <- myList3) {
            println(x)
        }
    }
}