import Array._ // 2차원부터는 패키지를 임포트해서 쓰라고 한다. 기본에서는 지원을 하지 않는다고.. (왜..?)

object Demo {
    def main(args: Array[String]){
        // 아니 고차원 배열 선언하려면 이렇게 해야하네.. 으아 안 직관적
        var myMaxtrix = ofDim[Int](3,3)

        // build a matrix
        for (i <- 0 to 2){
            for (j <- 0 to 2){
                myMaxtrix(i)(j) = j
            }
        }

        for (i <- 0 to 2){
            for (j <- 0 to 2){
                print(" " + myMaxtrix(i)(j))
            }
            println()
        }
    }
}