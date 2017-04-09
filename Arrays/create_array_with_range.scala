import Array._

object Demo {
    def main(args: Array[String]){
        var myList1 = range(10, 20, 2) //근데 20은 포함이 안된다 2칸씩
        var myList2 = range(10, 20) // 파이썬의 range와 비슷함

        for (x <- myList1){
            print( " " + x)
        }

        println()

        for (x <- myList2){
            print( " " + x)
        }
    }
}